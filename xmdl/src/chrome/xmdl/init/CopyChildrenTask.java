package chrome.xmdl.init;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.commons.beanutils.*;
import org.apache.log4j.Logger;

class CopyChildrenTask implements Task {
	public static Logger LOGGER = Logger.getLogger(CopyChildrenTask.class);

	private final String destinChildName;

	private final String sourceChildName;

	private String referenceName;

	private final Initializer initializer;

	private final Object newChild;

	private Assertion considerAssertion;

	private final Assertion copyAssertion;

	public CopyChildrenTask(String sourceChildName, String destChildName,
			String referenceName, Initializer initializer, Object newChild,
			Assertion considerAssertion, Assertion copyAssertion) {
		this.destinChildName = destChildName;
		this.sourceChildName = sourceChildName;
		this.referenceName = referenceName;
		this.initializer = initializer;
		this.newChild = newChild;
		this.considerAssertion = considerAssertion;
		this.copyAssertion = copyAssertion;
	}

	@SuppressWarnings( { "unchecked" })
	public void initialize(Object source, Object destination) {
		try {
			Object srcProp = PropertyUtils.getProperty(source, sourceChildName);
			Object dstProp = PropertyUtils.getProperty(destination,
					destinChildName);

			LOGGER.debug(source.getClass() + "." + sourceChildName + "="
					+ srcProp);
			LOGGER.debug(destination.getClass() + "." + destinChildName + "="
					+ dstProp);

			Collection<Object> srcChildren = null;
			Collection<Object> dstChildren = null;
			if (srcProp instanceof Collection) {
				// Make a copy of the original collection, to prevent concurrent
				// modification
				srcChildren = new ArrayList((Collection) srcProp);
			} else if (srcProp instanceof Object[]) {
				srcChildren = Arrays.asList(srcProp);
			}

			if (dstProp instanceof Collection) {
				dstChildren = (Collection) dstProp;
			} else if (dstProp instanceof Object[]) {
				dstChildren = Arrays.asList(dstProp);
			}

			LOGGER.debug("srcChildren.size() = " + srcChildren.size());
			LOGGER.debug("dstChildren.size() = " + dstChildren.size());

			for (Object child : srcChildren) {
				Object found = null;
				for (Object dstChild : dstChildren) {
					Object childsParent = PropertyUtils.getProperty(dstChild,
							referenceName);
					if (childsParent == null)
						continue;
					if (childsParent.equals(child)) {
						found = dstChild;
						LOGGER.debug("Child found : " + found);
						break;
					}
				}

				if (considerAssertion != null) {
					// Check for assertion test
					considerAssertion.setSource(child);
					considerAssertion.setDestination(found);

					boolean assertionResult = considerAssertion.test();
					LOGGER.debug("considerAssertion result = "
							+ assertionResult);
					if (!assertionResult)
						continue;
				}

				if (found == null) {
					LOGGER.debug("Child not found, cloning : " + newChild);
					try {
						found = BeanUtils.cloneBean(newChild);
					} catch (IllegalAccessException e) {
						LOGGER.error(e);
					}
					LOGGER.debug("Child cloned successfully");

					if (copyAssertion != null) {
						copyAssertion.setSource(child);
						copyAssertion.setDestination(found);

						boolean assertionResult = copyAssertion.test();
						LOGGER.debug("copyAssertion result = "
								+ assertionResult);
						if (assertionResult) {
							dstChildren.add(found);
						}
					} else {
						dstChildren.add(found);
					}
				}

				LOGGER.debug("Initializing child");
				initializer.initialize(child, found);
			}

			// PropertyUtils.setProperty(destination, destinChildName,
			// dstChildren
			// );
			if (srcChildren == null) {
				LOGGER.error(source.getClass() + "." + destinChildName
						+ " is neither a collection nor an array!");
				return;
			}
		} catch (Exception e) {
			LOGGER.error("Cannot copy children " + source.getClass() + "."
					+ destinChildName, e);
		}
	}

}

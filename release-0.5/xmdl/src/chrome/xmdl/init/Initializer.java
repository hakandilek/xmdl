package chrome.xmdl.init;

public class Initializer {
	protected static Assertion TRUE = new TrueAssertion();

	private Registry registry;

	public Initializer() {
		super();
		reset();
	}

	public void reset() {
		registry = new Registry();
	}

	public void addSetProperty(Class<?> clazz, String propertyName) {
		Task task = new SetPropertyTask(propertyName);
		registry.addTask(clazz, task);
	}

	public void addSetConstantPropertyIfDifferent(Class<?> clazz,
			String propertyName, Object value) {
		Task task = new SetConstantPropertyTask(propertyName, value);
		registry.addTask(clazz, task);
	}

	public void addSetPropertyIfDifferent(Class<?> clazz, String propertyName,
			String referenceName) {
		Assertion assertion = createReferenceDifferent(referenceName);
		Task task = new SetPropertyTask(propertyName);
		Task wrapperTask = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapperTask);
	}

	public void addSetPropertyIfMissing(Class<?> clazz, String propertyName,
			String referenceName) {
		Assertion assertion = createPropertyMissing(referenceName, propertyName);
		Task task = new SetPropertyTask(propertyName);
		Task wrapperTask = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapperTask);
	}

	private Assertion createReferenceDifferent(String referenceName) {
		return new AssertReferenceDifferent(referenceName);
	}

	private Assertion createPropertyMissing(String referenceName, String propertyName) {
		return new AssertDestinationMissing(propertyName);
	}

	public void addSetPropertyIfDifferent(Class<?> clazz, String propertyName) {
		addSetPropertyIfDifferent(clazz, propertyName, clazz.getSimpleName());
	}

	public void addSetPropertyIfMissing(Class<?> clazz, String propertyName) {
		addSetPropertyIfMissing(clazz, propertyName, clazz.getSimpleName());
	}

	public void addSetPropertyStringUppercaseWithPrefix(Class<?> clazz,
			String propertyName, String prefix) {
		Task task = new SetPropertyStringUppercaseWithPrefixTask(propertyName,
				prefix);
		registry.addTask(clazz, task);
	}

	public void addSetPropertyStringUppercaseWithPrefixIfDifferent(
			Class<?> clazz, String propertyName, String prefix,
			String referenceName) {
		Assertion assertion = createReferenceDifferent(referenceName);

		Task task = new SetPropertyStringUppercaseWithPrefixTask(propertyName,
				prefix);

		Task wrapperTask = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapperTask);
	}

	public void addSetPropertyStringUppercaseWithPrefixIfDifferent(
			Class<?> clazz, String propertyName, String prefix) {
		addSetPropertyStringUppercaseWithPrefixIfDifferent(clazz, propertyName,
				prefix, clazz.getSimpleName());
	}

	public void addSetPropertyStringUppercaseWithPrefixIfDifferent(
			Class<?> clazz, String propertyName, String prefix,
			Assertion prefixAssertion) {
		Assertion assertion = createReferenceDifferent(propertyName);

		SetPropertyStringTask task = new SetPropertyStringUppercaseWithPrefixTask(
				propertyName, prefix);

		task.setPrefixAssertion(prefixAssertion);

		Task wrapperTask = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapperTask);
	}

	public void addSetPropertyStringUppercaseWithPrefixAndSuffixIfDifferent(
			Class<?> clazz, String propertyName, String prefix,
			Assertion prefixAssertion, String suffix, Assertion suffixAssertion) {
		Assertion assertion = createReferenceDifferent(propertyName);

		SetPropertyStringTask task = new SetPropertyStringUppercaseTask(
				propertyName, prefix, suffix);

		task.setPrefixAssertion(prefixAssertion);
		task.setSuffixAssertion(suffixAssertion);

		Task wrapperTask = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapperTask);
	}

	public void addCopyChildren(Class<?> clazz, String sourceChildName,
			String destChildName, String referenceName, Object newChild) {
		addCopyChildren(clazz, sourceChildName, destChildName, referenceName,
				newChild, ((Assertion) null));
	}

	public void addCopyChildren(Class<?> clazz, String sourceChildName,
			String destChildName, String referenceName, Object newChild,
			Assertion considerAssertion) {
		addCopyChildren(clazz, sourceChildName, destChildName, referenceName,
				newChild, considerAssertion, null);
	}

	public void addCopyChildren(Class<?> clazz, String sourceChildName,
			String destChildName, String referenceName, Object newChild,
			Assertion considerAssertion, Assertion copyAssertion) {
		Task task = new CopyChildrenTask(sourceChildName, destChildName,
				referenceName, this, newChild, considerAssertion, copyAssertion);
		registry.addTask(clazz, task);
	}

	public void initialize(Object source, Object target) {
		registry.initialize(source, target);
	}

	/**
	 * Use this method last if you perform IfDifferent control
	 * 
	 * @param clazz
	 * @param referenceName
	 */
	public void addSetReference(Class<?> clazz, String referenceName) {
		Task task = new SetReferenceTask(referenceName);
		registry.addTask(clazz, task);
	}

	/**
	 * Use this method to add a task that will be depend on an assertion to be
	 * executed
	 * 
	 * @param clazz
	 *            registry key
	 * @param task
	 *            task to be executed
	 * @param assertion
	 *            assertion to be tested
	 */
	public void addAssertionTask(Class<?> clazz, Task task, Assertion assertion) {
		Task wrapper = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapper);
	}

	public void addTask(Class<?> clazz, Task task) {
		registry.addTask(clazz, task);
	}

	public void addSetPropertyWithPrefixIfDifferent(Class<?> clazz,
			String propertyName, String referenceName, String prefix,
			String suffix) {
		Assertion assertion = createReferenceDifferent(referenceName);
		Task task = new SetPropertyStringTask(propertyName, prefix, suffix);
		Task wrapperTask = new AssertionWrapperTask(task, assertion);
		registry.addTask(clazz, wrapperTask);
	}

	public void addSetPropertyWithPrefixIfDifferent(Class<?> clazz,
			String propertyName, String prefix, String suffix) {
		addSetPropertyWithPrefixIfDifferent(clazz, propertyName, clazz
				.getSimpleName(), prefix, suffix);
	}

}

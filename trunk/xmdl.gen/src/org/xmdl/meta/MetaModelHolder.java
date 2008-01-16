package org.xmdl.meta;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xgen.util.URIHelper;
import org.xmdl.xmdl.XModel;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.init.Initializer;


/**
 * The temporary holder for the models that correspond to the each meta-model.
 * Meta-model references hold by this class are renewed each time on code
 * generation.
 * 
 * @author Hakan Dilek
 * 
 */
public class MetaModelHolder {

	/** the logger */
	private static final Logger LOGGER = Logger
			.getLogger(MetaModelHolder.class);

	private static MetaModelHolder instance = null;

	/** meta-model root reference mapping */
	private Map<MetaModel, EObject> roots;

	/** the instance constructor */
	protected MetaModelHolder() {
		roots = new HashMap<MetaModel, EObject>();
	}

	/**
	 * @return the initialized instance
	 */
	public static MetaModelHolder getInstance() {
		return instance;
	}

	/**
	 * Renews the meta model references.
	 * 
	 * @param project
	 *            the root project used to reference on initialization.
	 */
	public static void initialize(XProject project) {
		instance = new MetaModelHolder();

		Resource resource = project.eResource();
		if (resource == null) {
			LOGGER.error("Project has no resource");
			return;
		}

		Map<URI, EObject> toSave = new HashMap<URI, EObject>();
		URI uri = resource.getURI();
		MetaModel[] metamodels = MetaModel.values();
		for (MetaModel metaModel : metamodels) {
			XModel model = metaModel.createInstance();
			URI subURI = metaModel.resolveURI(uri);

			boolean fileExists = false;
			File subFile;
			try {
				URI localURI = URIHelper.asLocalURI(subURI);
				subFile = new File(localURI.toFileString());
				LOGGER.debug("subFile.canRead() = " + subFile.canRead());
				fileExists = subFile.exists();
			} catch (RuntimeException e1) {
				//file does not exist
			}

			EObject root;
			if (fileExists) {
				LOGGER.info("Meta Model resource exists, loading " + subURI);
				root = ResourceHelper.loadResource(subURI);
			} else {
				LOGGER.info("Meta Model resource does not exist, creating "
						+ subURI);
				root = model.createRoot(project, uri);
			}

			if (root == null) {
				LOGGER.error("Meta Model is null");
				return;
			}

			if (metaModel.isInitialized()) {
				LOGGER.debug("Initializing Meta Model : " + model.name());

				Initializer init = model.getInitializer();
				init.initialize(project, root);
				LOGGER.debug("Meta Model initialized.");

				toSave.put(subURI, root);
			}

			instance.putRoot(metaModel, root);
		}

        LOGGER.debug("Saving Meta Model...");
        try {
            ResourceHelper.saveResources(toSave);
        } catch (IOException e) {
            LOGGER.error("Error Saving resource", e);
        }

	}

	private void putRoot(MetaModel metaModel, EObject root) {
		roots.put(metaModel, root);
	}

	/**
	 * @param metaModel
	 *            the meta-model
	 * @return root model element for the given meta-model
	 */
	public static EObject getRoot(MetaModel metaModel) {
		return instance.roots.get(metaModel);
	}

	/**
	 * 
	 * @return model element roots for the contained meta-models.
	 */
	public static List<EObject> getRoots() {
		Collection<EObject> values = instance.roots.values();
		ArrayList<EObject> list = new ArrayList<EObject>(values);
		return Collections.unmodifiableList(list);
	}

	
}

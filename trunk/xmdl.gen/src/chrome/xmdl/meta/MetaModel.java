package chrome.xmdl.meta;

import org.eclipse.emf.common.util.URI;

import chrome.xmdl.XModel;
import chrome.xmdl.XmdlFactory;
import chrome.xmdlbo.XmdlboFactory;
import chrome.xmdldb.XmdldbFactory;
import chrome.xmdlgen.XmdlgenFactory;

/**
 * The enumeration used to define the meta models
 * 
 * @author Hakan Dilek
 * 
 */
public enum MetaModel {

	XMDL(new ModelFactory() {
		@Override
		public XModel create() {
			return XmdlFactory.eINSTANCE.createXMDLModel();
		}
	}, false, "xmdl"),

	XMDL_DB(new ModelFactory() {
		@Override
		public XModel create() {
			return XmdldbFactory.eINSTANCE.createXMDLDBModel();
		}
	}, true, "xmdldb"),

	XMDL_GEN(new ModelFactory() {
		@Override
		public XModel create() {
			return XmdlgenFactory.eINSTANCE.createXMDLGenModel();
		}
	}, true, "xmdlgen"),

	XMDL_BO(new ModelFactory() {
		@Override
		public XModel create() {
			return XmdlboFactory.eINSTANCE.createXMDLBOModel();
		}
	}, true, "xmdlbo"),

	;

	private final ModelFactory factory;

	/** used to denote if meta-model should be initialized */
	private final boolean initialized;

	/** model file extension */
	private final String extension;

	private MetaModel(ModelFactory factory, boolean initialized,
			String extension) {
		this.factory = factory;
		this.initialized = initialized;
		this.extension = extension;
	}

	public XModel createInstance() {
		return factory.create();
	}

	private interface ModelFactory {
		XModel create();
	}

	public boolean isInitialized() {
		return initialized;
	}

	//TODO:still have problems while resolving local project resources on test runs 
	public URI resolveURI(String projectName, URI relURI) {
		URI withoutExtension = relURI.trimFileExtension();
		URI theURI = withoutExtension.appendFileExtension(extension);
		return theURI;
	}

}

package chrome.xmdl.xgen.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import chrome.xmdl.XProject;
import chrome.xmdl.XmdlPackage;
import chrome.xmdlbo.XmdlboPackage;
import chrome.xmdldb.DModel;
import chrome.xmdldb.XmdldbPackage;
import chrome.xmdlgen.XmdlgenPackage;

public class ResourceHelper {
	private static final Logger LOGGER = Logger.getLogger(ResourceHelper.class);

	private static boolean initialized = false;

	@SuppressWarnings("unchecked")
	protected static void initialize() {
		if (!initialized) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"*", new XMIResourceFactoryImpl());
			
			XmdlPackage.eINSTANCE.eClass();
			XmdldbPackage.eINSTANCE.eClass();
			XmdlboPackage.eINSTANCE.eClass();
			XmdlgenPackage.eINSTANCE.eClass();
			
	        XmdlPackage.eINSTANCE.getEFactoryInstance();
            XmdldbPackage.eINSTANCE.getEFactoryInstance();
            XmdlboPackage.eINSTANCE.getEFactoryInstance();
            XmdlgenPackage.eINSTANCE.getEFactoryInstance();

			initialized = true;
		}
	}

	public ResourceHelper() {
		super();
	}

	public static XProject loadProject(String xmdlPath) {		
		LOGGER.debug("Loading project @ " + xmdlPath);
		URI fileURI = URI.createURI(xmdlPath);
		XProject project = loadProject(fileURI);
		return project;
	}

	public static EObject loadResource(URI uri){
		initialize();
		ResourceSet resourceSet = new ResourceSetImpl();
		URIConverter converter = resourceSet.getURIConverter();
		uri = converter.normalize(uri);
		Resource resource = resourceSet.getResource(uri, true);
		EObject object = (EObject) resource.getContents().get(0);
		return object;		
	}
	
	@SuppressWarnings("unchecked")
	public static XProject loadProject(URI fileURI) {
		XProject res = (XProject) loadResource(fileURI);
		return res;
	}

	@SuppressWarnings("unchecked")
	public static DModel loadDModel(URI fileURI) {
		DModel res = (DModel) loadResource(fileURI);
		return res;
	}

	@SuppressWarnings("unchecked")
	public static Resource saveResource(URI uri, EObject root) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URIConverter converter = resourceSet.getURIConverter();
		uri = converter.normalize(uri);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(root);
		resourceSet.getResources().add(resource);

		Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "");
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		resource.save(saveOptions);
		
		return resource;		
	}

	public static Resource saveResource(String path, EObject root) throws IOException {
		LOGGER.debug("Saving resource @ " + path);
		URI uri = URI.createURI(path);
		Resource resource = saveResource(uri, root);
		return resource;
	}	

	public static EObject loadResource(String path) {
		LOGGER.debug("Loading resource @ " + path);
		URI uri = URI.createURI(path);
		EObject object = loadResource(uri);
		return object;
	}

	public static DModel loadDModel(String path) {
		URI uri = URI.createURI(path);
		return loadDModel(uri);		
	}

}

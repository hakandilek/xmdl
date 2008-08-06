package org.xmdl.xgen.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdldb.DModel;

/**
 * Helper class used to access resources.
 * 
 * @author Hakan Dilek
 */
public class ResourceHelper {
	/** the logger */
	private static final Logger LOGGER = Logger.getLogger(ResourceHelper.class);

	/** hidden constructor */
	protected ResourceHelper() {
		super();
	}

	/**
	 * loads the project from the given path
	 * 
	 * @param xmdlPath
	 *            the path to locate project file
	 * @return the loaded project
	 */
	public static XProject loadProject(String xmdlPath) {
		LOGGER.debug("Loading project @ " + xmdlPath);
		URI fileURI = URI.createURI(xmdlPath);
		XProject project = loadProject(fileURI);
		return project;
	}

	/**
	 * loads the resource from the given location
	 * 
	 * @param uri
	 *            location
	 * @return the loaded resource object
	 */
	public static EObject loadResource(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getURIConverter().getURIMap().putAll(
				EcorePlugin.computePlatformURIMap());
		Resource resource = resourceSet.getResource(uri, true);
		EObject object = (EObject) resource.getContents().get(0);
		return object;
	}

	/**
	 * loads the project from the given location
	 * 
	 * @param uri
	 *            location
	 * @return the loaded project
	 */
	public static XProject loadProject(URI fileURI) {
		XProject res = (XProject) loadResource(fileURI);
		return res;
	}

	/**
	 * loads the data model from the given location
	 * 
	 * @param uri
	 *            location
	 * @return the loaded project
	 */
	public static DModel loadDModel(URI fileURI) {
		DModel res = (DModel) loadResource(fileURI);
		return res;
	}

	/**
	 * saves the given object as a resource to the given location
	 * 
	 * @param uri
	 *            the location
	 * @param root
	 *            the root object
	 * @return the final resource
	 * @throws IOException
	 *             on problems
	 */
	public static Resource saveResource(URI uri, EObject root)
			throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		URIConverter converter = resourceSet.getURIConverter();
		uri = converter.normalize(uri);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(root);
		resourceSet.getResources().add(resource);

		Map<String, Object> options = getSaveOptions();
		resource.save(options);
		return resource;
	}

	/**
	 * @return the resource saving options
	 */
	public static Map<String, Object> getSaveOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, "");
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
				Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		/*
		 * this part is added to save type references in the form of
		 * href="platform:/plugin/org.xmdl.model/model/types.xmdl#java.lang.String"
		 */
		options.put(XMLResource.OPTION_URI_HANDLER,
				new URIHandlerImpl.PlatformSchemeAware());
		return options;
	}

	/**
	 * saves the given object as a resource to the given location
	 * 
	 * @param path
	 *            the location
	 * @param root
	 *            the root object
	 * @return the final resource
	 * @throws IOException
	 *             on problems
	 */
	public static Resource saveResource(String path, EObject root)
			throws IOException {
		LOGGER.debug("Saving resource @ " + path);
		URI uri = URI.createURI(path);
		Resource resource = saveResource(uri, root);
		return resource;
	}

	/**
	 * loads the resource from the given path
	 * 
	 * @param path
	 *            path to load resource from
	 * @return the loaded resource
	 */
	public static EObject loadResource(String path) {
		LOGGER.debug("Loading resource @ " + path);
		URI uri = URI.createURI(path);
		EObject object = loadResource(uri);
		return object;
	}

	/**
	 * loads a db model
	 * 
	 * @param path
	 *            path to load model from
	 * @return loaded model
	 */
	public static DModel loadDModel(String path) {
		URI uri = URI.createURI(path);
		return loadDModel(uri);
	}

	/**
	 * saves the given set of resources as a resource set
	 * 
	 * @param resourceMap
	 *            uri-object mapping for saving resources, mapping uri's to the
	 *            root objects to save into resources.
	 * @return the final resource set
	 * @throws IOException
	 *             on problems
	 */
	public static ResourceSet saveResources(Map<URI, EObject> resourceMap)
			throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> options = getSaveOptions();
		EList<Resource> resources = resourceSet.getResources();
		Set<URI> uris = resourceMap.keySet();
		for (URI uri : uris) {
			EObject root = resourceMap.get(uri);
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(root);
			resources.add(resource);
			resource.save(options);
		}

		return resourceSet;
	}

}

package chrome.xmdl;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class XmdlTypes {
	private static Map<String, XType> registry;

	public static final Logger LOGGER = Logger.getLogger(XmdlTypes.class);
	
	public static int init(String uriStr) {
		if (uriStr != null && !"".equals(uriStr.trim())){
			URI uri = URI.createURI(uriStr);
			return init(uri);			
		}
		return init((URI)null);
	}
	
	public static int init(URI uri) {
		if (registry == null){
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"*", new XMIResourceFactoryImpl());
			
			XmdlPackage.eINSTANCE.eClass();

			registry = new HashMap<String, XType>();
			ResourceSet rs = new ResourceSetImpl();
			URI defaultURI = URI.createURI("platform:/plugin/xmdl/model/types.xmdl");
			if (uri == null) uri = defaultURI;
			LOGGER.debug("Registering types from URI : " + uri);
			Resource r = rs.createResource(uri);
			try {
				r.load(Collections.EMPTY_MAP);
			} catch (IOException e) {
				LOGGER.fatal("Unable to load default types ", e);
			}
			Iterator<EObject> it = r.getAllContents();
			while (it.hasNext()) {
				EObject o = it.next();
				if (o instanceof XType) {
					XType type = (XType) o;
					String name = type.getClassName();
					registry.put(name, type);
					LOGGER.info("Type registered : " + name);
				}			
			}
			
			VOID = registry.get("void");
			INT = registry.get("int");
			BOOLEAN = registry.get("boolean");
			DOUBLE = registry.get("double");
			BYTE = registry.get("byte");
			CHAR = registry.get("char");
			FLOAT = registry.get("float");
			SHORT = registry.get("short");
			LONG = registry.get("long");
			
			JAVA_STRING = registry.get("java.lang.String");
			JAVA_INTEGER = registry.get("java.lang.Integer");
			JAVA_BOOLEAN = registry.get("java.lang.Boolean");
			JAVA_DOUBLE = registry.get("java.lang.Double");
			JAVA_DATE = registry.get("java.util.Date");
			JAVA_DATETIME = registry.get("java.util.DateTime");
			JAVA_BYTE = registry.get("java.lang.Byte");
			JAVA_CHARACTER = registry.get("java.lang.Character");
			JAVA_FLOAT = registry.get("java.lang.Float");
			JAVA_SHORT = registry.get("java.lang.Short");
			JAVA_LONG = registry.get("java.lang.Long");
			
		}
		return registry.size();
	}
	
	static {
		init((URI)null);
	}
	
	public static Collection<XType> getRegisteredTypes(){
		if (registry == null || registry.size() == 0) init((URI)null);
		return registry.values();
	}
	
	public static XType VOID;
	public static XType INT;
	public static XType BOOLEAN;
	public static XType DOUBLE;
	public static XType BYTE;
	public static XType CHAR;
	public static XType FLOAT;
	public static XType SHORT;
	public static XType LONG;
	
	public static XType JAVA_STRING;
	public static XType JAVA_INTEGER;
	public static XType JAVA_BOOLEAN;
	public static XType JAVA_DOUBLE;
	public static XType JAVA_DATE;
	public static XType JAVA_DATETIME;
	public static XType JAVA_BYTE;
	public static XType JAVA_CHARACTER;
	public static XType JAVA_FLOAT;
	public static XType JAVA_SHORT;
	public static XType JAVA_LONG;
	
	public static boolean contains(XType type) {
		init("");
		if (registry.containsValue(type)) return true;
		String name = type.getName();
		return registry.containsKey(name);
	}
	
}

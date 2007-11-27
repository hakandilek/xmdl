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

/**
 * The central registry for all standard types used in XMDL.
 * 
 * @author Hakan Dilek
 */
public class XmdlTypes {

    /** the logger */
    public static final Logger LOGGER = Logger.getLogger(XmdlTypes.class);

    /** internal type registry map */
    private final Map<String, XType> registry = new HashMap<String, XType>();

    /** singleton instance */
    private static final XmdlTypes INSTANCE = new XmdlTypes();

    /**
     * Private constructor
     */
    private XmdlTypes() {
        initialize();
    }

    /**
     * @return the singleton instance
     */
    public static XmdlTypes getInstance() {
        return INSTANCE;
    }

    /**
     * initializes the internal registry
     */
    private void initialize() {

        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*",
                new XMIResourceFactoryImpl());

        XmdlPackage.eINSTANCE.eClass();

        ResourceSet rs = new ResourceSetImpl();
        URI defaultURI = URI
                .createURI("platform:/plugin/xmdl/model/types.xmdl");
        URI uri = defaultURI;
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

    }

    /**
     * @param type
     *            type name
     * @return the contained type for the given name from the registry, null
     *         otherwise
     */
    public XType getType(String type) {
        return registry.get(type);
    }

    /**
     * @return all registered types
     */
    protected Collection<XType> getTypes() {
        return registry.values();
    }

    /**
     * Checks for existence of a type
     * 
     * @param type
     *            the type to check
     * @return true if this type is already registered
     */
    protected boolean containsType(XType type) {
        if (registry.containsValue(type))
            return true;
        String name = type.getName();
        return registry.containsKey(name);
    }

    /**
     * @return all registered types
     */
    public static Collection<XType> getRegisteredTypes() {
        return getInstance().getTypes();
    }

    /**
     * Checks for existence of a type
     * 
     * @param type
     *            the type to check
     * @return true if this type is already registered
     */
    public static boolean contains(XType type) {
        return getInstance().containsType(type);
    }

    public static final XType VOID = getInstance().getType("void");
    public static final XType INT = getInstance().getType("int");
    public static final XType BOOLEAN = getInstance().getType("boolean");
    public static final XType DOUBLE = getInstance().getType("double");
    public static final XType BYTE = getInstance().getType("byte");
    public static final XType CHAR = getInstance().getType("char");
    public static final XType FLOAT = getInstance().getType("float");
    public static final XType SHORT = getInstance().getType("short");
    public static final XType LONG = getInstance().getType("long");

    public static final XType JAVA_STRING = getInstance().getType("java.lang.String");
    public static final XType JAVA_INTEGER = getInstance().getType("java.lang.Integer");
    public static final XType JAVA_BOOLEAN = getInstance().getType("java.lang.Boolean");
    public static final XType JAVA_DOUBLE = getInstance().getType("java.lang.Double");
    public static final XType JAVA_DATE = getInstance().getType("java.util.Date");
    public static final XType JAVA_DATETIME = getInstance().getType("java.util.DateTime");
    public static final XType JAVA_BYTE = getInstance().getType("java.lang.Byte");
    public static final XType JAVA_CHARACTER = getInstance().getType("java.lang.Character");
    public static final XType JAVA_FLOAT = getInstance().getType("java.lang.Float");
    public static final XType JAVA_SHORT = getInstance().getType("java.lang.Short");
    public static final XType JAVA_LONG = getInstance().getType("java.lang.Long");

}

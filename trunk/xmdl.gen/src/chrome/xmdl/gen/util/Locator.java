package chrome.xmdl.gen.util;

import java.util.ArrayList;
import java.util.List;

import chrome.xmdl.XAttribute;
import chrome.xmdl.XBase;
import chrome.xmdl.XClass;
import chrome.xmdl.XEnumeration;
import chrome.xmdl.XEnumerationLiteral;
import chrome.xmdl.XException;
import chrome.xmdl.XMethod;
import chrome.xmdl.XPackage;
import chrome.xmdl.XParameter;
import chrome.xmdl.XProject;
import chrome.xmdl.impl.XVisitorBaseImpl;

public class Locator extends XVisitorBaseImpl {

    private final List<String> path;

    private int pathIndex;

    private XBase found;

    public Locator(List<String> path) {
        super();
        this.path = path;
        this.pathIndex = 0;
        this.found = null;
    }

    public Locator(String[] path) {
        this(toList(path));
    }
    
    public Locator(String path) {
        this(toList(path));
    }
    
    private static List<String> toList(String string) {
        String[] strings = string.split("\\s|\\|\\:|\\/");
        return toList(strings);
    }

    public XBase getFound() {
        return found;
    }

    private static List<String> toList(String[] strings) {
        List<String> list = new ArrayList<String>();
        for (String str : strings)
            list.add(str);
        return list;
    }

    private boolean matches(String name) {
        if (name == null) 
            return false;
        
        int size = path.size();
        if (pathIndex < size) {
            String str = path.get(pathIndex);
            return str.matches(name);
        } else {
            return false;
        }
    }

    private boolean isFound(String name, XBase x) {
        if (name == null) 
            return false;
        if (found != null)
            return true;

        int size = path.size();
        if (pathIndex == size - 1) {
            String str = path.get(pathIndex);
            boolean matches = str.matches(name);
            if (matches)
                found = x;//mark found
            return matches;
        } else {
            return false;
        }
    }

    private boolean visit(String name, XBase x) {
        boolean found = isFound(name, x);
        return !found;
    }

    private boolean visitEnter(String name, XBase x) {
        boolean matches = matches(name);
        boolean cont = matches && !isFound(name, x); 
        if (matches) pathIndex++;
        return cont;
    }

    private boolean visitLeave(String name, XBase x) {
        boolean found = isFound(name, x);
        return !found;
    }

    @Override
    public boolean visit(XAttribute x) {
        String name = x.getName();
        return visit(name, x);
    }

    @Override
    public boolean visit(XEnumerationLiteral x) {
        String name = x.getName();
        return visit(name, x);
    }

    @Override
    public boolean visit(XException x) {
        String name = x.getJavaClass().getSimpleName();
        return visit(name, x);
    }

    @Override
    public boolean visit(XParameter x) {
        String name = x.getName();
        return visit(name, x);
    }

    @Override
    public boolean visitEnter(XClass x) {
        String name = x.getName();
        return visitEnter(name, x);
    }

    @Override
    public boolean visitEnter(XEnumeration x) {
        String name = x.getName();
        return visitEnter(name, x);
    }

    @Override
    public boolean visitEnter(XMethod x) {
        String name = x.getName();
        return visitEnter(name, x);
    }

    @Override
    public boolean visitEnter(XPackage x) {
        String name = x.getName();
        return visitEnter(name, x);
    }

    @Override
    public boolean visitEnter(XProject x) {
        String name = x.getName();
        return visitEnter(name, x);
    }

    @Override
    public boolean visitLeave(XClass x) {
        String name = x.getName();
        return visitLeave(name, x);
    }

    @Override
    public boolean visitLeave(XEnumeration x) {
        String name = x.getName();
        return visitLeave(name, x);
    }

    @Override
    public boolean visitLeave(XMethod x) {
        String name = x.getName();
        return visitLeave(name, x);
    }

    @Override
    public boolean visitLeave(XPackage x) {
        String name = x.getName();
        return visitLeave(name, x);
    }

    @Override
    public boolean visitLeave(XProject x) {
        String name = x.getName();
        return visitLeave(name, x);
    }

    public static XBase locate(XProject project, String path) {
        Locator l = new Locator(path);
        project.accept(l);
        XBase f = l.getFound();
        return f;
    }

    public static XAttribute locateAttribute(XProject project, String path) {
        return (XAttribute) locate(project, path);
    }
    
    public static XClass locateClass(XProject project, String path) {
        return (XClass) locate(project, path);
    }

    public static XEnumeration locateEnumeration(XProject project, String path) {
        return (XEnumeration) locate(project, path);
    }

}

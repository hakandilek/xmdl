package org.xmdl.gen.util;

import java.util.*;

import org.eclipse.emf.codegen.util.ImportManager;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XType;


public abstract class ClassHelper implements GenConstants {

	protected ClassHelper() {
		super();
	}
	
	private  Set<String> javaReservedWords;

	protected ImportManager importManager = new ImportManager("");

	private Set<String> javaLangTypes;

	private Set<String> primitiveTypes;

	public ImportManager getImportManager() {
		return importManager;
	}

	public ImportManager makeImportManager(String packageName) {
		importManager = new ImportManager(packageName);
		return importManager;
	}


	/**
	 * Returns a hash of all Java's keywords and textual literals, as of Java
	 * 1.4.
	 */
	public Set<String> getJavaReservedWords() {
		if (javaReservedWords == null) {
			javaReservedWords = new HashSet<String>(100);
			javaReservedWords.add("abstract");
			javaReservedWords.add("assert");
			javaReservedWords.add("boolean");
			javaReservedWords.add("break");
			javaReservedWords.add("byte");
			javaReservedWords.add("case");
			javaReservedWords.add("catch");
			javaReservedWords.add("char");
			javaReservedWords.add("class");
			javaReservedWords.add("const");
			javaReservedWords.add("continue");
			javaReservedWords.add("default");
			javaReservedWords.add("do");
			javaReservedWords.add("double");
			javaReservedWords.add("else");
			javaReservedWords.add("extends");
			javaReservedWords.add("false");
			javaReservedWords.add("final");
			javaReservedWords.add("finally");
			javaReservedWords.add("float");
			javaReservedWords.add("for");
			javaReservedWords.add("goto");
			javaReservedWords.add("if");
			javaReservedWords.add("implements");
			javaReservedWords.add("import");
			javaReservedWords.add("instanceof");
			javaReservedWords.add("int");
			javaReservedWords.add("interface");
			javaReservedWords.add("long");
			javaReservedWords.add("native");
			javaReservedWords.add("new");
			javaReservedWords.add("null");
			javaReservedWords.add("package");
			javaReservedWords.add("private");
			javaReservedWords.add("protected");
			javaReservedWords.add("public");
			javaReservedWords.add("return");
			javaReservedWords.add("short");
			javaReservedWords.add("static");
			javaReservedWords.add("strictfp");
			javaReservedWords.add("super");
			javaReservedWords.add("switch");
			javaReservedWords.add("synchronized");
			javaReservedWords.add("this");
			javaReservedWords.add("throw");
			javaReservedWords.add("throws");
			javaReservedWords.add("transient");
			javaReservedWords.add("true");
			javaReservedWords.add("try");
			javaReservedWords.add("void");
			javaReservedWords.add("volatile");
			javaReservedWords.add("while");
		}
		return javaReservedWords;
	}

	public Set<String> getJavaLangTypes() {
		if (javaLangTypes == null) {
			javaLangTypes = new HashSet<String>(100);
			javaLangTypes.add("AbstractMethodError");
			javaLangTypes.add("ArithmeticException");
			javaLangTypes.add("ArrayIndexOutOfBoundsException");
			javaLangTypes.add("ArrayStoreException");
			javaLangTypes.add("Boolean");
			javaLangTypes.add("Byte");
			javaLangTypes.add("Character");
			javaLangTypes.add("Class");
			javaLangTypes.add("ClassCastException");
			javaLangTypes.add("ClassCircularityError");
			javaLangTypes.add("ClassFormatError");
			javaLangTypes.add("ClassLoader");
			javaLangTypes.add("ClassNotFoundException");
			javaLangTypes.add("CloneNotSupportedException");
			javaLangTypes.add("Cloneable");
			javaLangTypes.add("Comparable");
			javaLangTypes.add("Compiler");
			javaLangTypes.add("Double");
			javaLangTypes.add("Error");
			javaLangTypes.add("Exception");
			javaLangTypes.add("ExceptionInInitializerError");
			javaLangTypes.add("Float");
			javaLangTypes.add("FloatingDecimal");
			javaLangTypes.add("IllegalAccessError");
			javaLangTypes.add("IllegalAccessException");
			javaLangTypes.add("IllegalArgumentException");
			javaLangTypes.add("IllegalMonitorStateException");
			javaLangTypes.add("IllegalStateException");
			javaLangTypes.add("IllegalThreadStateException");
			javaLangTypes.add("IncompatibleClassChangeError");
			javaLangTypes.add("IndexOutOfBoundsException");
			javaLangTypes.add("InheritableThreadLocal");
			javaLangTypes.add("InstantiationError");
			javaLangTypes.add("InstantiationException");
			javaLangTypes.add("Integer");
			javaLangTypes.add("InternalError");
			javaLangTypes.add("InterruptedException");
			javaLangTypes.add("LinkageError");
			javaLangTypes.add("Long");
			javaLangTypes.add("Math");
			javaLangTypes.add("NegativeArraySizeException");
			javaLangTypes.add("NoClassDefFoundError");
			javaLangTypes.add("NoSuchFieldError");
			javaLangTypes.add("NoSuchFieldException");
			javaLangTypes.add("NoSuchMethodError");
			javaLangTypes.add("NoSuchMethodException");
			javaLangTypes.add("NullPointerException");
			javaLangTypes.add("Number");
			javaLangTypes.add("NumberFormatException");
			javaLangTypes.add("Object");
			javaLangTypes.add("OutOfMemoryError");
			javaLangTypes.add("Package");
			javaLangTypes.add("Process");
			javaLangTypes.add("Runnable");
			javaLangTypes.add("Runtime");
			javaLangTypes.add("RuntimeException");
			javaLangTypes.add("RuntimePermission");
			javaLangTypes.add("SecurityException");
			javaLangTypes.add("SecurityManager");
			javaLangTypes.add("Short");
			javaLangTypes.add("StackOverflowError");
			javaLangTypes.add("String");
			javaLangTypes.add("StringBuffer");
			javaLangTypes.add("StringIndexOutOfBoundsException");
			javaLangTypes.add("System");
			javaLangTypes.add("Thread");
			javaLangTypes.add("ThreadDeath");
			javaLangTypes.add("ThreadGroup");
			javaLangTypes.add("ThreadLocal");
			javaLangTypes.add("Throwable");
			javaLangTypes.add("UnknownError");
			javaLangTypes.add("UnsatisfiedLinkError");
			javaLangTypes.add("UnsupportedClassVersionError");
			javaLangTypes.add("UnsupportedOperationException");
			javaLangTypes.add("VerifyError");
			javaLangTypes.add("VirtualMachineError");
			javaLangTypes.add("Void");
			javaLangTypes.add("boolean");
			javaLangTypes.add("byte");
			javaLangTypes.add("char");
			javaLangTypes.add("double");
			javaLangTypes.add("float");
			javaLangTypes.add("int");
			javaLangTypes.add("long");
			javaLangTypes.add("short");
		}
		return javaLangTypes;
	}

	public Set<String> getPrimitiveTypes() {
		if (primitiveTypes == null) {
			primitiveTypes = new HashSet<String>(100);
			primitiveTypes.add("boolean");
			primitiveTypes.add("char");
			primitiveTypes.add("byte");
			primitiveTypes.add("short");
			primitiveTypes.add("int");
			primitiveTypes.add("long");
			primitiveTypes.add("float");
			primitiveTypes.add("double");
			primitiveTypes.add("void");
		}
		return primitiveTypes;
	}

	public static String capName(String name) {
	    if (name == null)
	        return "";
		if (name.length() == 0)
			return name;
		else
			return name.substring(0, 1).toUpperCase(Locale.US) + name.substring(1);
	}

	public static String uncapName(String name) {
	    if (name == null)
	        return "";
		if (name.length() == 0)
			return name;
		else
			return name.substring(0, 1).toLowerCase(Locale.US) + name.substring(1);
	}
	public String capAllName(String name) {
		if (name.length() == 0)
			return name;
		else
			return name.toUpperCase(Locale.US) ;
	}

	public String uncapAllName(String name) {
		if (name.length() == 0)
			return name;
		else
			return name.toLowerCase(Locale.US);
		}

	public String uncapPrefixedName(String name) {
		// lower all except the last upper case character if there are
		// more than one upper case characters in the beginning.
		// e.g. XSDElementContent -> xsdElementContent
		// However if the whole string is uppercase, the whole string
		// is turned into lower case.
		// e.g. CPU -> cpu
		if (name.length() == 0) {
			return name;
		} else {
			String lowerName = name.toLowerCase(Locale.US);
			int i;
			for (i = 0; i < name.length(); i++) {
				if (name.charAt(i) == lowerName.charAt(i)) {
					break;
				}
			}
			if (i > 1 && i < name.length()) {
				--i;
			}
			return name.substring(0, i).toLowerCase(Locale.US) + name.substring(i);
		}
	}

	public String safeName(String name) {
		if (getJavaReservedWords().contains(name))
			return name + "_";
		return name;
	}

	public String format(String name, char separator, String prefix,
			boolean includePrefix) {
		List<String> parsedName = new ArrayList<String>();
		if (prefix != null && name.startsWith(prefix)) {
			name = name.substring(prefix.length());
			if (includePrefix) {
				parsedName = parseName(prefix, '_');
			}
		}
		if (name.length() != 0)
			parsedName.addAll(parseName(name, '_'));
		StringBuffer result = new StringBuffer();
		for (Iterator<String> nameIter = parsedName.iterator(); nameIter.hasNext();) {
			String nameComponent = (String) nameIter.next();
			result.append(nameComponent);
			if (nameIter.hasNext() && nameComponent.length() > 1) {
				result.append(separator);
			}
		}
		return result.length() == 0 && prefix != null ? prefix : result
				.toString();
	}

	/**
	 * This method breaks sourceName into words delimited by sourceSeparator
	 * and/or mixed-case naming.
	 */
	public List<String> parseName(String sourceName, char sourceSeparator) {
		List<String> result = new ArrayList<String>();
		StringBuffer currentWord = new StringBuffer();
		int length = sourceName.length();
		boolean lastIsLower = false;
		for (int index = 0; index < length; index++) {
			char curChar = sourceName.charAt(index);
			if (Character.isUpperCase(curChar)
					|| (!lastIsLower && Character.isDigit(curChar))
					|| curChar == sourceSeparator) {
				if (lastIsLower || curChar == sourceSeparator) {
					result.add(currentWord.toString());
					currentWord = new StringBuffer();
				}
				lastIsLower = false;
			} else {
				if (!lastIsLower) {
					int currentWordLength = currentWord.length();
					if (currentWordLength > 1) {
						char lastChar = currentWord.charAt(--currentWordLength);
						currentWord.setLength(currentWordLength);
						result.add(currentWord.toString());
						currentWord = new StringBuffer();
						currentWord.append(lastChar);
					}
				}
				lastIsLower = true;
			}
			if (curChar != sourceSeparator) {
				currentWord.append(curChar);
			}
		}
		result.add(currentWord.toString());
		return result;
	}
  
	public abstract String getQualifiedName(Object object);
	
	public abstract String getCapName(Object object);
	
	public abstract String getImportedAttributeType(Object object);
	
	public abstract String uncapSafeName(Object object);
	
	public abstract String getDefaultValue(Object object);
	
	public abstract String getExtendsAndImplementsLitteral(Object object);

	public abstract String getExtendsLitteral(Object object);

	public abstract String getAccessorName(Object object);

	public abstract String getGetAccessor(Object object);

	public abstract boolean isBooleanType(Object object);
	
	public abstract String getQualifiedPath(Object object);
	
	
	public abstract String getObjectDAOName(XClass clz );
	
	public abstract String getObjectDAOImplName(XClass clz );
	
	public abstract String getObjectActionName(XClass clz);
	
	public abstract String getObjectFormName(XClass clz);
	
	public abstract String getObjectServiceImplName(XClass clz);
	
	public abstract String getObjectName(XClass clz );
	
	public abstract String getObjectName(XType type);

	public abstract String getObjectImplName(XClass clz );	
	
	public abstract String getObjectImplName(XType type);
}





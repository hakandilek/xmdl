/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import java.util.Arrays;
import java.util.List;

import org.xmdl.wdl.Type;

public enum BasicType {

	VOID(false, "void"),

	STRING(false, "String", "java.lang.String"),

	BOOLEAN(false, "boolean", "Boolean", "java.lang.Boolean"),

	DOUBLE(true, "double", "Double", "java.lang.Double"),

	FLOAT(true, "float", "Float", "java.lang.Float"),

	BYTE(true, "byte", "Byte", "java.lang.Byte"),

	CHAR(true, "char", "Character", "java.lang.Character"),

	SHORT(true, "short", "Short", "java.lang.Short"),

	LONG(true, "long", "Long", "java.lang.Long"),

	INTEGER(true, "int", "Integer", "java.lang.Integer"),

	DATE(true, "Date", "java.util.Date", "java.sql.Date", "java.sql.Time"),
	
	OBJECT(false, "Object", "java.lang.Object"),

	;

	private final boolean comparable;
	
	private final List<String> variations;

	BasicType(boolean comparable, String... variations) {
		this.comparable = comparable;
		this.variations = Arrays.asList(variations);
	}

	public boolean is(Type t) {
		return variations.contains(t.getName());
	}

	public boolean isComparable() {
		return comparable;
	}

}
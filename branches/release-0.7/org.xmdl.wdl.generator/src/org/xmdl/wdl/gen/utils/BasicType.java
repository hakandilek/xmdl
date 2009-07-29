/**
 * 
 */
package org.xmdl.wdl.gen.utils;

import java.util.Arrays;
import java.util.List;

import org.xmdl.wdl.Type;

public enum BasicType {

	VOID("void"),

	STRING("String", "java.lang.String"),

	BOOLEAN("boolean", "Boolean", "java.lang.Boolean"),

	DOUBLE("double", "Double", "java.lang.Double"),

	FLOAT("float", "Float", "java.lang.Float"),

	BYTE("byte", "Byte", "java.lang.Byte"),

	CHAR("char", "Character", "java.lang.Character"),

	SHORT("short", "Short", "java.lang.Short"),

	LONG("long", "Long", "java.lang.Long"),

	INTEGER("int", "Integer", "java.lang.Integer"),

	DATE("Date", "java.util.Date", "java.sql.Date", "java.sql.Time"),
	
	OBJECT("Object", "java.lang.Object"),

	;

	private final List<String> variations;

	BasicType(String... variations) {
		this.variations = Arrays.asList(variations);
	}

	public boolean is(Type t) {
		return variations.contains(t.getName());
	}

}
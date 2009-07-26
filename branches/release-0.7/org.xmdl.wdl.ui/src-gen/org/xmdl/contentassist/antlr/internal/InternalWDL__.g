lexer grammar InternalWDL;
@header {
package org.xmdl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'type' ;
T12 : 'is' ;
T13 : '.' ;
T14 : 'entity' ;
T15 : 'enum' ;
T16 : '{' ;
T17 : '}' ;
T18 : '(' ;
T19 : ')' ;
T20 : 'embed' ;
T21 : 'extends' ;
T22 : '*' ;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1243
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1245
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1247
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1249
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1251
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1253
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 1255
RULE_ANY_OTHER : .;



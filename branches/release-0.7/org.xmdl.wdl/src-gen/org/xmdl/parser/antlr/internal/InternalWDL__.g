lexer grammar InternalWDL;
@header {
package org.xmdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'project' ;
T12 : '{' ;
T13 : 'projectName' ;
T14 : ':' ;
T15 : 'basePackage' ;
T16 : '}' ;
T17 : 'type' ;
T18 : 'is' ;
T19 : '.' ;
T20 : 'entity' ;
T21 : 'extends' ;
T22 : 'embed' ;
T23 : 'enum' ;
T24 : '(' ;
T25 : ')' ;
T26 : 'NONE' ;
T27 : '*' ;
T28 : '#' ;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 839
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 841
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 843
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 845
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 847
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 849
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 851
RULE_ANY_OTHER : .;



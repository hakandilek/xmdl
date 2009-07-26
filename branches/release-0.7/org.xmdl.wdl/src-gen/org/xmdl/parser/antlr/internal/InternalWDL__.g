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
T23 : '*' ;
T24 : 'enum' ;
T25 : '(' ;
T26 : ')' ;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 811
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 813
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 815
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 817
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 819
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 821
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 823
RULE_ANY_OTHER : .;



lexer grammar InternalWDL;
@header {
package org.xmdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'type' ;
T12 : 'is' ;
T13 : '.' ;
T14 : 'entity' ;
T15 : '*' ;
T16 : 'enum' ;
T17 : '{' ;
T18 : '}' ;
T19 : '(' ;
T20 : ')' ;
T21 : 'embed' ;
T22 : 'extends' ;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 671
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 673
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 675
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 677
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 679
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 681
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xmdl.wdl/src-gen/org/xmdl/parser/antlr/internal/InternalWDL.g" 683
RULE_ANY_OTHER : .;



lexer grammar InternalWDL;
@header {
package org.xmdl.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'NONE' ;
T12 : '*' ;
T13 : '#' ;
T14 : '+' ;
T15 : '-' ;
T16 : 'project' ;
T17 : '{' ;
T18 : 'projectName' ;
T19 : ':' ;
T20 : 'basePackage' ;
T21 : '}' ;
T22 : 'type' ;
T23 : 'is' ;
T24 : '.' ;
T25 : 'entity' ;
T26 : 'extends' ;
T27 : 'embed' ;
T28 : 'enum' ;
T29 : '(' ;
T30 : ')' ;
T31 : 'query' ;
T32 : '<' ;
T33 : '>' ;
T34 : 'with' ;
T35 : ',' ;
T36 : '-max' ;
T37 : '-offset' ;
T38 : '-order' ;
T39 : '=' ;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3181
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3183
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3185
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3187
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3189
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3191
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xmdl.wdl.ui/src-gen/org/xmdl/contentassist/antlr/internal/InternalWDL.g" 3193
RULE_ANY_OTHER : .;



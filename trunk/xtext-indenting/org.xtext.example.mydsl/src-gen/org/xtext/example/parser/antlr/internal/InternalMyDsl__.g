lexer grammar InternalMyDsl;
@header {
package org.xtext.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : 'import' ;
T14 : 'type' ;
T15 : 'entity' ;
T16 : 'extends' ;
T17 : 'property' ;
T18 : ':' ;
T19 : '[]' ;

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 466
RULE_INDENT : '{';

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 468
RULE_DEDENT : '}';

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 470
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 472
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 474
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 476
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 478
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 480
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.mydsl/src-gen/org/xtext/example/parser/antlr/internal/InternalMyDsl.g" 482
RULE_ANY_OTHER : .;



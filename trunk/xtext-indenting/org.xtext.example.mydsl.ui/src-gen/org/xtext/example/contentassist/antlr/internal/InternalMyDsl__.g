lexer grammar InternalMyDsl;
@header {
package org.xtext.example.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T13 : 'import' ;
T14 : 'type' ;
T15 : 'entity' ;
T16 : 'extends' ;
T17 : 'property' ;
T18 : ':' ;
T19 : '[]' ;

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 836
RULE_INDENT : '{';

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 838
RULE_DEDENT : '}';

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 840
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 842
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 844
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 846
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 848
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 850
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/contentassist/antlr/internal/InternalMyDsl.g" 852
RULE_ANY_OTHER : .;



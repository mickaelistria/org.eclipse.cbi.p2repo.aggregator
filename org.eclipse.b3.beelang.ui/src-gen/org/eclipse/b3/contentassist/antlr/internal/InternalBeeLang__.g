lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : '=' ;
T18 : '+=' ;
T19 : '-=' ;
T20 : '*=' ;
T21 : '/=' ;
T22 : '%=' ;
T23 : '~=' ;
T24 : '==' ;
T25 : '===' ;
T26 : '!=' ;
T27 : '!==' ;
T28 : '>=' ;
T29 : '<=' ;
T30 : '>' ;
T31 : '<' ;
T32 : 'var' ;
T33 : '+' ;
T34 : '-' ;
T35 : '*' ;
T36 : '/' ;
T37 : '%' ;
T38 : '!' ;
T39 : '++' ;
T40 : '--' ;
T41 : 'input' ;
T42 : 'output' ;
T43 : 'source' ;
T44 : 'properties' ;
T45 : 'builder' ;
T46 : '?' ;
T47 : 'true' ;
T48 : 'false' ;
T49 : '[' ;
T50 : '(' ;
T51 : ']' ;
T52 : ')' ;
T53 : 'super' ;
T54 : 'this' ;
T55 : '.' ;
T56 : '@' ;
T57 : '$' ;
T58 : '&' ;
T59 : ':' ;
T60 : 'public' ;
T61 : 'private' ;
T62 : 'parallel' ;
T63 : 'sequential' ;
T64 : 'repositories' ;
T65 : '{' ;
T66 : '}' ;
T67 : 'import' ;
T68 : ';' ;
T69 : 'as' ;
T70 : 'version' ;
T71 : 'implements' ;
T72 : ',' ;
T73 : 'default' ;
T74 : 'provides' ;
T75 : 'requires' ;
T76 : 'env' ;
T77 : 'containers' ;
T78 : 'when' ;
T79 : 'extends' ;
T80 : 'annotations' ;
T81 : 'with' ;
T82 : 'concern' ;
T83 : '#' ;
T84 : 'precondition' ;
T85 : 'postinputcondition' ;
T86 : 'postcondition' ;
T87 : 'repository' ;
T88 : 'select-first' ;
T89 : 'select-best' ;
T90 : 'select-switch' ;
T91 : 'endswitch' ;
T92 : 'case' ;
T93 : 'container' ;
T94 : 'agent' ;
T95 : 'function' ;
T96 : '=>' ;
T97 : 'cached' ;
T98 : '||' ;
T99 : '&&' ;
T100 : 'context' ;
T101 : 'proceed' ;
T102 : '_' ;
T103 : 'throw' ;
T104 : 'try' ;
T105 : 'endtry' ;
T106 : 'finally' ;
T107 : 'catch' ;
T108 : 'switch' ;
T109 : 'if' ;
T110 : 'then' ;
T111 : 'endif' ;
T112 : 'else' ;
T113 : 'elseif' ;
T114 : 'new' ;
T115 : '|' ;
T116 : 'null' ;
T117 : 'reexport' ;
T118 : 'final' ;
T119 : 'mutable' ;
T120 : '...' ;
T121 : 'val' ;
T122 : 'instanceof' ;
T123 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38247
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38249
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38251
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38253
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38255
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38257
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38259
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38261
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38263
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38265
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38267
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 38269
RULE_ANY_OTHER : .;



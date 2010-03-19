lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'properties' ;
T17 : 'repositories' ;
T18 : '{' ;
T19 : '}' ;
T20 : 'reexport' ;
T21 : 'import' ;
T22 : 'as' ;
T23 : ';' ;
T24 : 'unit' ;
T25 : 'version' ;
T26 : 'implements' ;
T27 : ',' ;
T28 : 'default' ;
T29 : 'source' ;
T30 : '=' ;
T31 : 'output' ;
T32 : 'provides' ;
T33 : 'requires' ;
T34 : 'env' ;
T35 : 'sequential' ;
T36 : 'containers' ;
T37 : 'when' ;
T38 : '(' ;
T39 : ')' ;
T40 : '/' ;
T41 : 'extends' ;
T42 : 'final' ;
T43 : 'mutable' ;
T44 : 'builder' ;
T45 : 'annotations' ;
T46 : '[' ;
T47 : ']' ;
T48 : ':' ;
T49 : 'with' ;
T50 : 'concern' ;
T51 : '#' ;
T52 : '...' ;
T53 : 'precondition' ;
T54 : 'postinputcondition' ;
T55 : 'postcondition' ;
T56 : 'input' ;
T57 : 'repository' ;
T58 : 'select-first' ;
T59 : 'select-best' ;
T60 : 'select-switch' ;
T61 : 'endswitch' ;
T62 : 'case' ;
T63 : 'container' ;
T64 : 'agent' ;
T65 : 'function' ;
T66 : '+=' ;
T67 : '-=' ;
T68 : '*=' ;
T69 : '/=' ;
T70 : '%=' ;
T71 : '~=' ;
T72 : '==' ;
T73 : '===' ;
T74 : '!=' ;
T75 : '!==' ;
T76 : '>=' ;
T77 : '<=' ;
T78 : '>' ;
T79 : '<' ;
T80 : 'var' ;
T81 : 'val' ;
T82 : '=>' ;
T83 : '?' ;
T84 : 'super' ;
T85 : 'cached' ;
T86 : '||' ;
T87 : '&&' ;
T88 : 'instanceof' ;
T89 : '+' ;
T90 : '-' ;
T91 : '*' ;
T92 : '%' ;
T93 : '..' ;
T94 : '!' ;
T95 : '++' ;
T96 : '--' ;
T97 : '.' ;
T98 : 'context' ;
T99 : 'proceed' ;
T100 : '_' ;
T101 : 'throw' ;
T102 : 'try' ;
T103 : 'finally' ;
T104 : 'endtry' ;
T105 : 'catch' ;
T106 : 'switch' ;
T107 : 'if' ;
T108 : 'then' ;
T109 : 'else' ;
T110 : 'endif' ;
T111 : 'elseif' ;
T112 : 'new' ;
T113 : '|' ;
T114 : 'null' ;
T115 : 'true' ;
T116 : 'false' ;
T117 : 'this' ;
T118 : '@' ;
T119 : '$' ;
T120 : '&' ;
T121 : 'public' ;
T122 : 'private' ;
T123 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19387
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19389
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19391
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19393
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19395
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19397
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19399
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19401
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19403
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19405
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19407
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19409
RULE_ANY_OTHER : .;



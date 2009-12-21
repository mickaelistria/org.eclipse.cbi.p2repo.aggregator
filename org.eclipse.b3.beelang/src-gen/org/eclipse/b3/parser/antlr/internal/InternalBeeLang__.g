lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'reexport' ;
T17 : 'import' ;
T18 : 'as' ;
T19 : ';' ;
T20 : 'unit' ;
T21 : 'version' ;
T22 : 'implements' ;
T23 : ',' ;
T24 : '{' ;
T25 : 'default' ;
T26 : 'properties' ;
T27 : 'provides' ;
T28 : '}' ;
T29 : 'requires' ;
T30 : 'env' ;
T31 : 'sequential' ;
T32 : 'repositories' ;
T33 : 'containers' ;
T34 : '/' ;
T35 : 'when' ;
T36 : 'extends' ;
T37 : 'final' ;
T38 : 'unset' ;
T39 : '#' ;
T40 : 'annotations' ;
T41 : '[' ;
T42 : ']' ;
T43 : 'with' ;
T44 : '(' ;
T45 : ')' ;
T46 : 'concern' ;
T47 : 'cached' ;
T48 : 'builder' ;
T49 : '...' ;
T50 : 'input' ;
T51 : 'output' ;
T52 : 'repository' ;
T53 : 'select-first' ;
T54 : 'select-best' ;
T55 : 'container' ;
T56 : 'agent' ;
T57 : 'precondition' ;
T58 : 'postcondition' ;
T59 : 'assert' ;
T60 : 'function' ;
T61 : ':' ;
T62 : '=' ;
T63 : '+=' ;
T64 : '-=' ;
T65 : '*=' ;
T66 : '/=' ;
T67 : '%=' ;
T68 : '~=' ;
T69 : '==' ;
T70 : '===' ;
T71 : '!=' ;
T72 : '!==' ;
T73 : '>=' ;
T74 : '<=' ;
T75 : '>' ;
T76 : '<' ;
T77 : 'var' ;
T78 : 'val' ;
T79 : '=>' ;
T80 : '?' ;
T81 : 'super' ;
T82 : '||' ;
T83 : '&&' ;
T84 : 'instanceof' ;
T85 : '+' ;
T86 : '-' ;
T87 : '*' ;
T88 : '%' ;
T89 : '..' ;
T90 : '!' ;
T91 : '++' ;
T92 : '--' ;
T93 : '.' ;
T94 : '_' ;
T95 : 'throw' ;
T96 : 'try' ;
T97 : 'finally' ;
T98 : 'endtry' ;
T99 : 'catch' ;
T100 : 'switch' ;
T101 : 'endswitch' ;
T102 : 'case' ;
T103 : 'if' ;
T104 : 'then' ;
T105 : 'else' ;
T106 : 'endif' ;
T107 : 'elseif' ;
T108 : 'new' ;
T109 : 'context' ;
T110 : '|' ;
T111 : 'null' ;
T112 : 'true' ;
T113 : 'false' ;
T114 : 'this' ;
T115 : '@' ;
T116 : '$' ;
T117 : '&' ;
T118 : 'public' ;
T119 : 'private' ;
T120 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13269
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13271
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13273
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13275
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13277
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13279
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13281
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13283
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13285
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13287
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13289
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13291
RULE_ANY_OTHER : .;



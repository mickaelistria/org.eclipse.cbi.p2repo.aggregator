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
T36 : 'resolution' ;
T37 : 'containers' ;
T38 : 'when' ;
T39 : '(' ;
T40 : ')' ;
T41 : '/' ;
T42 : 'greedy' ;
T43 : 'requires-min' ;
T44 : 'requires-max' ;
T45 : 'min-required' ;
T46 : 'max-required' ;
T47 : 'extends' ;
T48 : 'final' ;
T49 : 'mutable' ;
T50 : 'builder' ;
T51 : 'annotations' ;
T52 : '[' ;
T53 : ']' ;
T54 : ':' ;
T55 : 'with' ;
T56 : 'concern' ;
T57 : '#' ;
T58 : '...' ;
T59 : 'precondition' ;
T60 : 'postinputcondition' ;
T61 : 'postcondition' ;
T62 : 'input' ;
T63 : 'local' ;
T64 : 'remote' ;
T65 : 'branches' ;
T66 : 'repository' ;
T67 : 'select-first' ;
T68 : 'select-best' ;
T69 : 'select-switch' ;
T70 : 'endswitch' ;
T71 : 'case' ;
T72 : 'container' ;
T73 : 'agent' ;
T74 : 'function' ;
T75 : '+=' ;
T76 : '-=' ;
T77 : '*=' ;
T78 : '/=' ;
T79 : '%=' ;
T80 : '~=' ;
T81 : '==' ;
T82 : '===' ;
T83 : '!=' ;
T84 : '!==' ;
T85 : '>=' ;
T86 : '<=' ;
T87 : '>' ;
T88 : '<' ;
T89 : 'var' ;
T90 : 'val' ;
T91 : '=>' ;
T92 : '?' ;
T93 : 'super' ;
T94 : 'cached' ;
T95 : '||' ;
T96 : '&&' ;
T97 : 'instanceof' ;
T98 : '+' ;
T99 : '-' ;
T100 : '*' ;
T101 : '%' ;
T102 : '..' ;
T103 : '!' ;
T104 : '++' ;
T105 : '--' ;
T106 : '.' ;
T107 : 'context' ;
T108 : 'proceed' ;
T109 : '_' ;
T110 : 'throw' ;
T111 : 'try' ;
T112 : 'finally' ;
T113 : 'endtry' ;
T114 : 'catch' ;
T115 : 'switch' ;
T116 : 'if' ;
T117 : 'then' ;
T118 : 'else' ;
T119 : 'endif' ;
T120 : 'elseif' ;
T121 : 'this' ;
T122 : 'new' ;
T123 : '|' ;
T124 : 'null' ;
T125 : 'true' ;
T126 : 'false' ;
T127 : '@' ;
T128 : '$' ;
T129 : '&' ;
T130 : 'public' ;
T131 : 'private' ;
T132 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20031
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20033
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20035
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20037
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20039
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20041
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20043
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20045
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20047
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20049
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20051
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20053
RULE_ANY_OTHER : .;



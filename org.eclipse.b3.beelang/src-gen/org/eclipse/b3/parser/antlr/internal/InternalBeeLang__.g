lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T16 : 'properties' ;
T17 : 'reexport' ;
T18 : 'import' ;
T19 : 'as' ;
T20 : ';' ;
T21 : 'unit' ;
T22 : 'version' ;
T23 : 'implements' ;
T24 : ',' ;
T25 : '{' ;
T26 : 'default' ;
T27 : 'source' ;
T28 : '=' ;
T29 : 'output' ;
T30 : 'provides' ;
T31 : '}' ;
T32 : 'requires' ;
T33 : 'env' ;
T34 : 'sequential' ;
T35 : 'repositories' ;
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
T61 : 'switch' ;
T62 : 'endswitch' ;
T63 : 'case' ;
T64 : 'container' ;
T65 : 'agent' ;
T66 : 'function' ;
T67 : '+=' ;
T68 : '-=' ;
T69 : '*=' ;
T70 : '/=' ;
T71 : '%=' ;
T72 : '~=' ;
T73 : '==' ;
T74 : '===' ;
T75 : '!=' ;
T76 : '!==' ;
T77 : '>=' ;
T78 : '<=' ;
T79 : '>' ;
T80 : '<' ;
T81 : 'var' ;
T82 : 'val' ;
T83 : '=>' ;
T84 : '?' ;
T85 : 'super' ;
T86 : 'cached' ;
T87 : '||' ;
T88 : '&&' ;
T89 : 'instanceof' ;
T90 : '+' ;
T91 : '-' ;
T92 : '*' ;
T93 : '%' ;
T94 : '..' ;
T95 : '!' ;
T96 : '++' ;
T97 : '--' ;
T98 : '.' ;
T99 : 'context' ;
T100 : 'proceed' ;
T101 : '_' ;
T102 : 'throw' ;
T103 : 'try' ;
T104 : 'finally' ;
T105 : 'endtry' ;
T106 : 'catch' ;
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

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19178
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19180
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19182
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19184
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19186
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19188
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19190
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19192
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19194
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19196
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19198
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19200
RULE_ANY_OTHER : .;



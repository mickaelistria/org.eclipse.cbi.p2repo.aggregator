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
T41 : 'greedy' ;
T42 : 'requires-min' ;
T43 : 'requires-max' ;
T44 : 'min-required' ;
T45 : 'max-required' ;
T46 : 'extends' ;
T47 : 'final' ;
T48 : 'mutable' ;
T49 : 'builder' ;
T50 : 'annotations' ;
T51 : '[' ;
T52 : ']' ;
T53 : ':' ;
T54 : 'with' ;
T55 : 'concern' ;
T56 : '#' ;
T57 : '...' ;
T58 : 'precondition' ;
T59 : 'postinputcondition' ;
T60 : 'postcondition' ;
T61 : 'input' ;
T62 : 'repository' ;
T63 : 'select-first' ;
T64 : 'select-best' ;
T65 : 'select-switch' ;
T66 : 'endswitch' ;
T67 : 'case' ;
T68 : 'container' ;
T69 : 'agent' ;
T70 : 'function' ;
T71 : '+=' ;
T72 : '-=' ;
T73 : '*=' ;
T74 : '/=' ;
T75 : '%=' ;
T76 : '~=' ;
T77 : '==' ;
T78 : '===' ;
T79 : '!=' ;
T80 : '!==' ;
T81 : '>=' ;
T82 : '<=' ;
T83 : '>' ;
T84 : '<' ;
T85 : 'var' ;
T86 : 'val' ;
T87 : '=>' ;
T88 : '?' ;
T89 : 'super' ;
T90 : 'cached' ;
T91 : '||' ;
T92 : '&&' ;
T93 : 'instanceof' ;
T94 : '+' ;
T95 : '-' ;
T96 : '*' ;
T97 : '%' ;
T98 : '..' ;
T99 : '!' ;
T100 : '++' ;
T101 : '--' ;
T102 : '.' ;
T103 : 'context' ;
T104 : 'proceed' ;
T105 : '_' ;
T106 : 'throw' ;
T107 : 'try' ;
T108 : 'finally' ;
T109 : 'endtry' ;
T110 : 'catch' ;
T111 : 'switch' ;
T112 : 'if' ;
T113 : 'then' ;
T114 : 'else' ;
T115 : 'endif' ;
T116 : 'elseif' ;
T117 : 'new' ;
T118 : '|' ;
T119 : 'null' ;
T120 : 'true' ;
T121 : 'false' ;
T122 : 'this' ;
T123 : '@' ;
T124 : '$' ;
T125 : '&' ;
T126 : 'public' ;
T127 : 'private' ;
T128 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19618
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19620
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19622
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19624
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19626
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19628
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19630
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19632
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19634
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19636
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19638
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 19640
RULE_ANY_OTHER : .;



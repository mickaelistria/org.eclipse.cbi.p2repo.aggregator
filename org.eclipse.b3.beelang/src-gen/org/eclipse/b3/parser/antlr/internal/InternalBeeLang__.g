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
T57 : ':' ;
T58 : 'precondition' ;
T59 : 'postcondition' ;
T60 : 'assert' ;
T61 : 'function' ;
T62 : '=' ;
T63 : '+=' ;
T64 : '-=' ;
T65 : '*=' ;
T66 : '/=' ;
T67 : '%=' ;
T68 : '&=' ;
T69 : '^=' ;
T70 : '|=' ;
T71 : '<<=' ;
T72 : '>>=' ;
T73 : '>>>=' ;
T74 : '~=' ;
T75 : '==' ;
T76 : '===' ;
T77 : '!=' ;
T78 : '!==' ;
T79 : '>=' ;
T80 : '<=' ;
T81 : '>' ;
T82 : '<' ;
T83 : 'instanceof' ;
T84 : 'var' ;
T85 : '?' ;
T86 : 'super' ;
T87 : '||' ;
T88 : '&&' ;
T89 : '&' ;
T90 : '^' ;
T91 : '|' ;
T92 : '<<' ;
T93 : '>>' ;
T94 : '>>>' ;
T95 : '+' ;
T96 : '-' ;
T97 : '*' ;
T98 : '%' ;
T99 : '..' ;
T100 : '!' ;
T101 : '~' ;
T102 : '++' ;
T103 : '--' ;
T104 : '.' ;
T105 : '_' ;
T106 : 'throw' ;
T107 : 'try' ;
T108 : 'finally' ;
T109 : 'endtry' ;
T110 : 'catch' ;
T111 : 'switch' ;
T112 : 'endswitch' ;
T113 : 'case' ;
T114 : 'if' ;
T115 : 'then' ;
T116 : 'else' ;
T117 : 'endif' ;
T118 : 'elseif' ;
T119 : 'new' ;
T120 : 'context' ;
T121 : 'true' ;
T122 : 'false' ;
T123 : 'this' ;
T124 : '~~~~~' ;
T125 : '@' ;
T126 : '$' ;
T127 : '**' ;
T128 : 'public' ;
T129 : 'private' ;
T130 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12617
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12619
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12621
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12623
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12625
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12627
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12629
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12631
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12633
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12635
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12637
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 12639
RULE_ANY_OTHER : .;



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
T37 : '(' ;
T38 : ')' ;
T39 : 'final' ;
T40 : '=' ;
T41 : 'mutable' ;
T42 : '#' ;
T43 : 'annotations' ;
T44 : '[' ;
T45 : ']' ;
T46 : 'with' ;
T47 : 'concern' ;
T48 : 'cached' ;
T49 : 'builder' ;
T50 : '...' ;
T51 : 'input' ;
T52 : 'output' ;
T53 : 'repository' ;
T54 : 'select-first' ;
T55 : 'select-best' ;
T56 : 'container' ;
T57 : 'agent' ;
T58 : 'precondition' ;
T59 : 'postcondition' ;
T60 : 'assert' ;
T61 : 'function' ;
T62 : ':' ;
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

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13691
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13693
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13695
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13697
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13699
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13701
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13703
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13705
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13707
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13709
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13711
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 13713
RULE_ANY_OTHER : .;



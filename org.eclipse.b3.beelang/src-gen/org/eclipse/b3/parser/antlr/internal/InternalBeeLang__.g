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
T34 : 'when' ;
T35 : '(' ;
T36 : ')' ;
T37 : '/' ;
T38 : 'extends' ;
T39 : 'final' ;
T40 : '=' ;
T41 : 'mutable' ;
T42 : 'builder' ;
T43 : 'annotations' ;
T44 : '[' ;
T45 : ']' ;
T46 : 'with' ;
T47 : 'concern' ;
T48 : '#' ;
T49 : '...' ;
T50 : 'precondition' ;
T51 : ':' ;
T52 : 'postinputcondition' ;
T53 : 'postcondition' ;
T54 : 'output' ;
T55 : 'input' ;
T56 : 'repository' ;
T57 : 'select-first' ;
T58 : 'select-best' ;
T59 : 'container' ;
T60 : 'agent' ;
T61 : 'function' ;
T62 : '+=' ;
T63 : '-=' ;
T64 : '*=' ;
T65 : '/=' ;
T66 : '%=' ;
T67 : '~=' ;
T68 : '==' ;
T69 : '===' ;
T70 : '!=' ;
T71 : '!==' ;
T72 : '>=' ;
T73 : '<=' ;
T74 : '>' ;
T75 : '<' ;
T76 : 'var' ;
T77 : 'val' ;
T78 : '=>' ;
T79 : '?' ;
T80 : 'super' ;
T81 : 'cached' ;
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
T94 : 'proceed' ;
T95 : '_' ;
T96 : 'throw' ;
T97 : 'try' ;
T98 : 'finally' ;
T99 : 'endtry' ;
T100 : 'catch' ;
T101 : 'switch' ;
T102 : 'endswitch' ;
T103 : 'case' ;
T104 : 'if' ;
T105 : 'then' ;
T106 : 'else' ;
T107 : 'endif' ;
T108 : 'elseif' ;
T109 : 'new' ;
T110 : 'context' ;
T111 : '|' ;
T112 : 'null' ;
T113 : 'true' ;
T114 : 'false' ;
T115 : 'this' ;
T116 : '@' ;
T117 : '$' ;
T118 : '&' ;
T119 : 'public' ;
T120 : 'private' ;
T121 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18320
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18322
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18324
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18326
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18328
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18330
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18332
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18334
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18336
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18338
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18340
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18342
RULE_ANY_OTHER : .;



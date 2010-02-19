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
T48 : 'with' ;
T49 : 'concern' ;
T50 : '#' ;
T51 : '...' ;
T52 : 'precondition' ;
T53 : ':' ;
T54 : 'postinputcondition' ;
T55 : 'postcondition' ;
T56 : 'input' ;
T57 : 'repository' ;
T58 : 'select-first' ;
T59 : 'select-best' ;
T60 : 'container' ;
T61 : 'agent' ;
T62 : 'function' ;
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
T82 : 'cached' ;
T83 : '||' ;
T84 : '&&' ;
T85 : 'instanceof' ;
T86 : '+' ;
T87 : '-' ;
T88 : '*' ;
T89 : '%' ;
T90 : '..' ;
T91 : '!' ;
T92 : '++' ;
T93 : '--' ;
T94 : '.' ;
T95 : 'proceed' ;
T96 : '_' ;
T97 : 'throw' ;
T98 : 'try' ;
T99 : 'finally' ;
T100 : 'endtry' ;
T101 : 'catch' ;
T102 : 'switch' ;
T103 : 'endswitch' ;
T104 : 'case' ;
T105 : 'if' ;
T106 : 'then' ;
T107 : 'else' ;
T108 : 'endif' ;
T109 : 'elseif' ;
T110 : 'new' ;
T111 : 'context' ;
T112 : '|' ;
T113 : 'null' ;
T114 : 'true' ;
T115 : 'false' ;
T116 : 'this' ;
T117 : '@' ;
T118 : '$' ;
T119 : '&' ;
T120 : 'public' ;
T121 : 'private' ;
T122 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18720
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18722
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18724
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18726
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18728
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18730
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18732
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18734
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18736
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18738
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18740
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 18742
RULE_ANY_OTHER : .;



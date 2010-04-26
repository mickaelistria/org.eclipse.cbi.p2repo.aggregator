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
T66 : 'update-policy' ;
T67 : 'include' ;
T68 : 'exclude' ;
T69 : 'repository' ;
T70 : 'select-first' ;
T71 : 'select-best' ;
T72 : 'select-switch' ;
T73 : 'endswitch' ;
T74 : 'case' ;
T75 : 'container' ;
T76 : 'agent' ;
T77 : 'function' ;
T78 : '+=' ;
T79 : '-=' ;
T80 : '*=' ;
T81 : '/=' ;
T82 : '%=' ;
T83 : '~=' ;
T84 : '==' ;
T85 : '===' ;
T86 : '!=' ;
T87 : '!==' ;
T88 : '>=' ;
T89 : '<=' ;
T90 : '>' ;
T91 : '<' ;
T92 : 'var' ;
T93 : 'val' ;
T94 : '=>' ;
T95 : '?' ;
T96 : 'super' ;
T97 : 'cached' ;
T98 : '||' ;
T99 : '&&' ;
T100 : 'instanceof' ;
T101 : '+' ;
T102 : '-' ;
T103 : '*' ;
T104 : '%' ;
T105 : '..' ;
T106 : '!' ;
T107 : '++' ;
T108 : '--' ;
T109 : '.' ;
T110 : 'context' ;
T111 : 'proceed' ;
T112 : '_' ;
T113 : 'throw' ;
T114 : 'try' ;
T115 : 'finally' ;
T116 : 'endtry' ;
T117 : 'catch' ;
T118 : 'switch' ;
T119 : 'if' ;
T120 : 'then' ;
T121 : 'else' ;
T122 : 'endif' ;
T123 : 'elseif' ;
T124 : 'this' ;
T125 : 'new' ;
T126 : '|' ;
T127 : 'null' ;
T128 : 'true' ;
T129 : 'false' ;
T130 : '@' ;
T131 : '$' ;
T132 : '&' ;
T133 : 'latest' ;
T134 : 'revision' ;
T135 : 'tag' ;
T136 : 'timestamp' ;
T137 : 'fail-modified' ;
T138 : 'keep-modified' ;
T139 : 'merge-modified' ;
T140 : 'no-update' ;
T141 : 'replace-modified' ;
T142 : 'public' ;
T143 : 'private' ;
T144 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20477
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20479
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20481
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20483
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20485
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20487
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20489
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20491
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20493
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20495
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20497
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 20499
RULE_ANY_OTHER : .;



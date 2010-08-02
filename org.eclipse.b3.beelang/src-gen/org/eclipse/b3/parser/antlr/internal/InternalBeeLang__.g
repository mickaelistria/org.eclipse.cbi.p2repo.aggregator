lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T18 : 'reexport' ;
T19 : 'use' ;
T20 : 'as' ;
T21 : ';' ;
T22 : 'unit' ;
T23 : 'version' ;
T24 : 'is' ;
T25 : ',' ;
T26 : '{' ;
T27 : 'source' ;
T28 : ':' ;
T29 : 'output' ;
T30 : 'provides' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'requires' ;
T34 : 'select-required' ;
T35 : 'env' ;
T36 : 'platform-filter' ;
T37 : '}' ;
T38 : 'fragment-host' ;
T39 : 'capability' ;
T40 : 'when' ;
T41 : 'name' ;
T42 : 'name-space' ;
T43 : 'greedy' ;
T44 : 'requires-min' ;
T45 : 'requires-max' ;
T46 : 'properties' ;
T47 : 'extends' ;
T48 : 'load-from' ;
T49 : 'default-properties' ;
T50 : '(' ;
T51 : ')' ;
T52 : 'final' ;
T53 : '=' ;
T54 : 'mutable' ;
T55 : 'sequential' ;
T56 : 'builder' ;
T57 : 'annotations' ;
T58 : '/' ;
T59 : 'with' ;
T60 : 'concern' ;
T61 : '.' ;
T62 : '...' ;
T63 : 'input' ;
T64 : 'result' ;
T65 : '@precondition' ;
T66 : '@postcondition' ;
T67 : '@postinputcondition' ;
T68 : 'repository' ;
T69 : 'connection' ;
T70 : 'branches' ;
T71 : 'true' ;
T72 : 'false' ;
T73 : 'default' ;
T74 : 'branch' ;
T75 : 'policy' ;
T76 : 'checkout-content' ;
T77 : 'accept-dirty' ;
T78 : 'update-content' ;
T79 : 'on-merge-conflict' ;
T80 : 'replace-content' ;
T81 : 'exclude' ;
T82 : 'include' ;
T83 : 'resolution' ;
T84 : 'select-first' ;
T85 : 'select-best' ;
T86 : 'select-switch' ;
T87 : 'endswitch' ;
T88 : 'case' ;
T89 : 'container' ;
T90 : 'function' ;
T91 : '+=' ;
T92 : '-=' ;
T93 : '*=' ;
T94 : '/=' ;
T95 : '%=' ;
T96 : '~=' ;
T97 : '==' ;
T98 : '===' ;
T99 : '!=' ;
T100 : '!==' ;
T101 : '>=' ;
T102 : '<=' ;
T103 : '>' ;
T104 : '<' ;
T105 : 'var' ;
T106 : 'val' ;
T107 : '=>' ;
T108 : '?' ;
T109 : 'super' ;
T110 : 'cached' ;
T111 : '||' ;
T112 : '&&' ;
T113 : 'instanceof' ;
T114 : '+' ;
T115 : '-' ;
T116 : '*' ;
T117 : '%' ;
T118 : '..' ;
T119 : '!' ;
T120 : '++' ;
T121 : '--' ;
T122 : 'context' ;
T123 : 'proceed' ;
T124 : '_' ;
T125 : 'throw' ;
T126 : 'try' ;
T127 : 'finally' ;
T128 : 'endtry' ;
T129 : 'catch' ;
T130 : 'switch' ;
T131 : 'if' ;
T132 : 'then' ;
T133 : 'else' ;
T134 : 'endif' ;
T135 : 'elseif' ;
T136 : 'this' ;
T137 : 'modify' ;
T138 : 'new' ;
T139 : 'unit-context' ;
T140 : 'select-units' ;
T141 : 'modify-selected' ;
T142 : 'builder-context' ;
T143 : 'select-builders' ;
T144 : 'having-parameters' ;
T145 : 'conditions' ;
T146 : 'precondition' ;
T147 : 'postinputcondition' ;
T148 : 'postcondition' ;
T149 : 'called-builder' ;
T150 : '|' ;
T151 : 'null' ;
T152 : '@' ;
T153 : '$' ;
T154 : '&' ;
T155 : 'latest' ;
T156 : 'revision' ;
T157 : 'tag' ;
T158 : 'timestamp' ;
T159 : 'public' ;
T160 : 'private' ;
T161 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23365
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23367
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23369
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23371
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23373
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23375
RULE_TEXT : '\u00AB' ( options {greedy=false;} : . )*'\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23377
RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23379
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23381
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23383
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23385
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23387
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23389
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23391
RULE_ANY_OTHER : .;



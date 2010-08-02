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
T36 : '}' ;
T37 : 'fragment-host' ;
T38 : 'capability' ;
T39 : 'when' ;
T40 : 'name' ;
T41 : 'name-space' ;
T42 : 'greedy' ;
T43 : 'requires-min' ;
T44 : 'requires-max' ;
T45 : 'properties' ;
T46 : 'extends' ;
T47 : 'load-from' ;
T48 : 'default-properties' ;
T49 : '(' ;
T50 : ')' ;
T51 : 'final' ;
T52 : '=' ;
T53 : 'mutable' ;
T54 : 'sequential' ;
T55 : 'builder' ;
T56 : 'annotations' ;
T57 : '/' ;
T58 : 'with' ;
T59 : 'concern' ;
T60 : '.' ;
T61 : '...' ;
T62 : 'input' ;
T63 : 'result' ;
T64 : '@precondition' ;
T65 : '@postcondition' ;
T66 : '@postinputcondition' ;
T67 : 'repository' ;
T68 : 'connection' ;
T69 : 'branches' ;
T70 : 'true' ;
T71 : 'false' ;
T72 : 'default' ;
T73 : 'branch' ;
T74 : 'policy' ;
T75 : 'checkout-content' ;
T76 : 'accept-dirty' ;
T77 : 'update-content' ;
T78 : 'on-merge-conflict' ;
T79 : 'replace-content' ;
T80 : 'exclude' ;
T81 : 'include' ;
T82 : 'resolution' ;
T83 : 'select-first' ;
T84 : 'select-best' ;
T85 : 'select-switch' ;
T86 : 'endswitch' ;
T87 : 'case' ;
T88 : 'container' ;
T89 : 'function' ;
T90 : '+=' ;
T91 : '-=' ;
T92 : '*=' ;
T93 : '/=' ;
T94 : '%=' ;
T95 : '~=' ;
T96 : '==' ;
T97 : '===' ;
T98 : '!=' ;
T99 : '!==' ;
T100 : '>=' ;
T101 : '<=' ;
T102 : '>' ;
T103 : '<' ;
T104 : 'var' ;
T105 : 'val' ;
T106 : '=>' ;
T107 : '?' ;
T108 : 'super' ;
T109 : 'cached' ;
T110 : '||' ;
T111 : '&&' ;
T112 : 'instanceof' ;
T113 : '+' ;
T114 : '-' ;
T115 : '*' ;
T116 : '%' ;
T117 : '..' ;
T118 : '!' ;
T119 : '++' ;
T120 : '--' ;
T121 : 'context' ;
T122 : 'proceed' ;
T123 : '_' ;
T124 : 'throw' ;
T125 : 'try' ;
T126 : 'finally' ;
T127 : 'endtry' ;
T128 : 'catch' ;
T129 : 'switch' ;
T130 : 'if' ;
T131 : 'then' ;
T132 : 'else' ;
T133 : 'endif' ;
T134 : 'elseif' ;
T135 : 'this' ;
T136 : 'modify' ;
T137 : 'new' ;
T138 : 'unit-context' ;
T139 : 'select-units' ;
T140 : 'modify-selected' ;
T141 : 'builder-context' ;
T142 : 'select-builders' ;
T143 : 'having-parameters' ;
T144 : 'conditions' ;
T145 : 'precondition' ;
T146 : 'postinputcondition' ;
T147 : 'postcondition' ;
T148 : 'called-builder' ;
T149 : '|' ;
T150 : 'null' ;
T151 : '@' ;
T152 : '$' ;
T153 : '&' ;
T154 : 'latest' ;
T155 : 'revision' ;
T156 : 'tag' ;
T157 : 'timestamp' ;
T158 : 'public' ;
T159 : 'private' ;
T160 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23298
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23300
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23302
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23304
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23306
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23308
RULE_TEXT : '\u00AB' ( options {greedy=false;} : . )*'\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23310
RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23312
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23314
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23316
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23318
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23320
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23322
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23324
RULE_ANY_OTHER : .;



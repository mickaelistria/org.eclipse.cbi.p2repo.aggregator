lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T21 : 'reexport' ;
T22 : 'use' ;
T23 : 'as' ;
T24 : ';' ;
T25 : 'unit' ;
T26 : 'version' ;
T27 : 'is' ;
T28 : ',' ;
T29 : '{' ;
T30 : 'source' ;
T31 : ':' ;
T32 : 'output' ;
T33 : 'provides' ;
T34 : '[' ;
T35 : ']' ;
T36 : 'requires' ;
T37 : 'select-required' ;
T38 : 'env' ;
T39 : 'platform-filter' ;
T40 : '}' ;
T41 : 'fragment-host' ;
T42 : 'capability' ;
T43 : 'when' ;
T44 : 'name' ;
T45 : 'name-space' ;
T46 : 'greedy' ;
T47 : 'requires-min' ;
T48 : 'requires-max' ;
T49 : 'properties' ;
T50 : 'extends' ;
T51 : 'load-from' ;
T52 : 'default-properties' ;
T53 : '(' ;
T54 : ')' ;
T55 : 'final' ;
T56 : '=' ;
T57 : 'mutable' ;
T58 : 'sequential' ;
T59 : 'builder' ;
T60 : 'annotations' ;
T61 : '/' ;
T62 : 'with' ;
T63 : 'concern' ;
T64 : '.' ;
T65 : '...' ;
T66 : '@precondition' ;
T67 : '@postcondition' ;
T68 : 'input' ;
T69 : '@postinputcondition' ;
T70 : 'result' ;
T71 : 'val' ;
T72 : 'repository' ;
T73 : 'connection' ;
T74 : 'branches' ;
T75 : 'true' ;
T76 : 'false' ;
T77 : 'default' ;
T78 : 'branch' ;
T79 : 'policy' ;
T80 : 'checkout-content' ;
T81 : 'accept-dirty' ;
T82 : 'update-content' ;
T83 : 'on-merge-conflict' ;
T84 : 'replace-content' ;
T85 : 'exclude' ;
T86 : 'include' ;
T87 : 'resolution' ;
T88 : 'select-first' ;
T89 : 'select-best' ;
T90 : 'select-switch' ;
T91 : 'endswitch' ;
T92 : 'case' ;
T93 : 'container' ;
T94 : 'function' ;
T95 : '+=' ;
T96 : '-=' ;
T97 : '*=' ;
T98 : '/=' ;
T99 : '%=' ;
T100 : '~=' ;
T101 : '==' ;
T102 : '===' ;
T103 : '!=' ;
T104 : '!==' ;
T105 : '!~' ;
T106 : '>=' ;
T107 : '<=' ;
T108 : '>' ;
T109 : '<' ;
T110 : 'var' ;
T111 : '=>' ;
T112 : '?' ;
T113 : 'super' ;
T114 : 'cached' ;
T115 : '||' ;
T116 : '&&' ;
T117 : 'instanceof' ;
T118 : '+' ;
T119 : '-' ;
T120 : '*' ;
T121 : '%' ;
T122 : '..' ;
T123 : '!' ;
T124 : '++' ;
T125 : '--' ;
T126 : 'context' ;
T127 : 'proceed' ;
T128 : '_' ;
T129 : 'throw' ;
T130 : 'try' ;
T131 : 'finally' ;
T132 : 'endtry' ;
T133 : 'catch' ;
T134 : 'switch' ;
T135 : 'if' ;
T136 : 'then' ;
T137 : 'else' ;
T138 : 'endif' ;
T139 : 'elseif' ;
T140 : 'this' ;
T141 : 'modify' ;
T142 : 'new' ;
T143 : 'unit-context' ;
T144 : 'select-units' ;
T145 : 'modify-selected' ;
T146 : 'builder-context' ;
T147 : 'select-builders' ;
T148 : 'having-parameters' ;
T149 : 'conditions' ;
T150 : 'precondition' ;
T151 : 'postinputcondition' ;
T152 : 'postcondition' ;
T153 : 'called-builder' ;
T154 : '|' ;
T155 : 'null' ;
T156 : '@' ;
T157 : '$' ;
T158 : '&' ;
T159 : '#[' ;
T160 : '##[' ;
T161 : 'latest' ;
T162 : 'revision' ;
T163 : 'tag' ;
T164 : 'timestamp' ;
T165 : 'public' ;
T166 : 'private' ;
T167 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24406
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24408
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24410
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24412
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24414
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24416
RULE_TEXT : '\u00AB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24418
RULE_TEXTSTART : '\u00AB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00AB' '{';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24420
RULE_TEXTEND : '}' '\u00BB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24422
RULE_TEXTMID : '}' '\u00BB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00AB' '{';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24424
RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24426
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24428
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24430
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24432
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24434
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24436
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24438
RULE_ANY_OTHER : .;



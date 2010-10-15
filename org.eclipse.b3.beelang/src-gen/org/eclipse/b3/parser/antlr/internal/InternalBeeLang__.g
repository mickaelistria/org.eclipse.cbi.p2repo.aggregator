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
T105 : '>=' ;
T106 : '<=' ;
T107 : '>' ;
T108 : '<' ;
T109 : 'var' ;
T110 : '=>' ;
T111 : '?' ;
T112 : 'super' ;
T113 : 'cached' ;
T114 : '||' ;
T115 : '&&' ;
T116 : 'instanceof' ;
T117 : '+' ;
T118 : '-' ;
T119 : '*' ;
T120 : '%' ;
T121 : '..' ;
T122 : '!' ;
T123 : '++' ;
T124 : '--' ;
T125 : 'context' ;
T126 : 'proceed' ;
T127 : '_' ;
T128 : 'throw' ;
T129 : 'try' ;
T130 : 'finally' ;
T131 : 'endtry' ;
T132 : 'catch' ;
T133 : 'switch' ;
T134 : 'if' ;
T135 : 'then' ;
T136 : 'else' ;
T137 : 'endif' ;
T138 : 'elseif' ;
T139 : 'this' ;
T140 : 'modify' ;
T141 : 'new' ;
T142 : 'unit-context' ;
T143 : 'select-units' ;
T144 : 'modify-selected' ;
T145 : 'builder-context' ;
T146 : 'select-builders' ;
T147 : 'having-parameters' ;
T148 : 'conditions' ;
T149 : 'precondition' ;
T150 : 'postinputcondition' ;
T151 : 'postcondition' ;
T152 : 'called-builder' ;
T153 : '|' ;
T154 : 'null' ;
T155 : '@' ;
T156 : '$' ;
T157 : '&' ;
T158 : 'latest' ;
T159 : 'revision' ;
T160 : 'tag' ;
T161 : 'timestamp' ;
T162 : 'public' ;
T163 : 'private' ;
T164 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24037
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24039
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24041
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24043
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24045
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24047
RULE_TEXT : '\u00AB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24049
RULE_TEXTSTART : '\u00AB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00AB' '{';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24051
RULE_TEXTEND : '}' '\u00BB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24053
RULE_TEXTMID : '}' '\u00BB' (('}' ~('\u00BB')|'\u00AB' ~('{'))|~(('}'|'\u00AB'|'\u00BB')))* '\u00AB' '{';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24055
RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24057
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24059
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24061
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24063
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24065
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24067
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 24069
RULE_ANY_OTHER : .;



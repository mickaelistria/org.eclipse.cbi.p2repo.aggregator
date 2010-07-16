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
T37 : 'capability' ;
T38 : 'when' ;
T39 : 'name' ;
T40 : 'name-space' ;
T41 : 'greedy' ;
T42 : 'requires-min' ;
T43 : 'requires-max' ;
T44 : 'properties' ;
T45 : 'extends' ;
T46 : 'load-from' ;
T47 : 'default-properties' ;
T48 : '(' ;
T49 : ')' ;
T50 : 'final' ;
T51 : '=' ;
T52 : 'mutable' ;
T53 : 'sequential' ;
T54 : 'builder' ;
T55 : 'annotations' ;
T56 : '/' ;
T57 : 'with' ;
T58 : 'concern' ;
T59 : '.' ;
T60 : '...' ;
T61 : 'input' ;
T62 : 'result' ;
T63 : '@precondition' ;
T64 : '@postcondition' ;
T65 : '@postinputcondition' ;
T66 : 'repository' ;
T67 : 'connection' ;
T68 : 'branches' ;
T69 : 'true' ;
T70 : 'false' ;
T71 : 'default' ;
T72 : 'branch' ;
T73 : 'policy' ;
T74 : 'checkout-content' ;
T75 : 'accept-dirty' ;
T76 : 'update-content' ;
T77 : 'on-merge-conflict' ;
T78 : 'replace-content' ;
T79 : 'exclude' ;
T80 : 'include' ;
T81 : 'resolution' ;
T82 : 'select-first' ;
T83 : 'select-best' ;
T84 : 'select-switch' ;
T85 : 'endswitch' ;
T86 : 'case' ;
T87 : 'container' ;
T88 : 'function' ;
T89 : '+=' ;
T90 : '-=' ;
T91 : '*=' ;
T92 : '/=' ;
T93 : '%=' ;
T94 : '~=' ;
T95 : '==' ;
T96 : '===' ;
T97 : '!=' ;
T98 : '!==' ;
T99 : '>=' ;
T100 : '<=' ;
T101 : '>' ;
T102 : '<' ;
T103 : 'var' ;
T104 : 'val' ;
T105 : '=>' ;
T106 : '?' ;
T107 : 'super' ;
T108 : 'cached' ;
T109 : '||' ;
T110 : '&&' ;
T111 : 'instanceof' ;
T112 : '+' ;
T113 : '-' ;
T114 : '*' ;
T115 : '%' ;
T116 : '..' ;
T117 : '!' ;
T118 : '++' ;
T119 : '--' ;
T120 : 'context' ;
T121 : 'proceed' ;
T122 : '_' ;
T123 : 'throw' ;
T124 : 'try' ;
T125 : 'finally' ;
T126 : 'endtry' ;
T127 : 'catch' ;
T128 : 'switch' ;
T129 : 'if' ;
T130 : 'then' ;
T131 : 'else' ;
T132 : 'endif' ;
T133 : 'elseif' ;
T134 : 'this' ;
T135 : 'modify' ;
T136 : 'new' ;
T137 : 'unit-context' ;
T138 : 'select-units' ;
T139 : 'modify-selected' ;
T140 : 'builder-context' ;
T141 : 'select-builders' ;
T142 : 'having-parameters' ;
T143 : 'conditions' ;
T144 : 'precondition' ;
T145 : 'postinputcondition' ;
T146 : 'postcondition' ;
T147 : 'called-builder' ;
T148 : '|' ;
T149 : 'null' ;
T150 : '@' ;
T151 : '$' ;
T152 : '&' ;
T153 : 'latest' ;
T154 : 'revision' ;
T155 : 'tag' ;
T156 : 'timestamp' ;
T157 : 'public' ;
T158 : 'private' ;
T159 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23139
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23141
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23143
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23145
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23147
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23149
RULE_TEXT : '\u00AB' ( options {greedy=false;} : . )*'\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23151
RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23153
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23155
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23157
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23159
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23161
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23163
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 23165
RULE_ANY_OTHER : .;



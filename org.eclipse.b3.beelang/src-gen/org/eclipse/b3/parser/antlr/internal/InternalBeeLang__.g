lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T17 : 'reexport' ;
T18 : 'import' ;
T19 : 'as' ;
T20 : ';' ;
T21 : 'unit' ;
T22 : 'version' ;
T23 : 'implements' ;
T24 : ',' ;
T25 : '{' ;
T26 : 'source' ;
T27 : ':' ;
T28 : 'output' ;
T29 : 'provides' ;
T30 : '[' ;
T31 : ']' ;
T32 : 'requires' ;
T33 : 'env' ;
T34 : '}' ;
T35 : 'capability' ;
T36 : 'when' ;
T37 : 'name' ;
T38 : 'name-space' ;
T39 : 'greedy' ;
T40 : 'requires-min' ;
T41 : 'requires-max' ;
T42 : 'properties' ;
T43 : 'extends' ;
T44 : 'load-from' ;
T45 : 'default-properties' ;
T46 : '(' ;
T47 : ')' ;
T48 : 'final' ;
T49 : '=' ;
T50 : 'mutable' ;
T51 : 'sequential' ;
T52 : 'builder' ;
T53 : 'annotations' ;
T54 : '/' ;
T55 : 'with' ;
T56 : 'concern' ;
T57 : '.' ;
T58 : '...' ;
T59 : 'input' ;
T60 : 'result' ;
T61 : '@precondition' ;
T62 : '@postcondition' ;
T63 : '@postinputcondition' ;
T64 : 'repository' ;
T65 : 'connection' ;
T66 : 'branches' ;
T67 : 'branch' ;
T68 : 'update-policy' ;
T69 : 'exclude' ;
T70 : 'include' ;
T71 : 'resolution' ;
T72 : 'select-first' ;
T73 : 'select-best' ;
T74 : 'select-switch' ;
T75 : 'endswitch' ;
T76 : 'case' ;
T77 : 'default' ;
T78 : 'container' ;
T79 : 'function' ;
T80 : '@callguard' ;
T81 : '+=' ;
T82 : '-=' ;
T83 : '*=' ;
T84 : '/=' ;
T85 : '%=' ;
T86 : '~=' ;
T87 : '==' ;
T88 : '===' ;
T89 : '!=' ;
T90 : '!==' ;
T91 : '>=' ;
T92 : '<=' ;
T93 : '>' ;
T94 : '<' ;
T95 : 'var' ;
T96 : 'val' ;
T97 : '=>' ;
T98 : '?' ;
T99 : 'super' ;
T100 : 'cached' ;
T101 : '||' ;
T102 : '&&' ;
T103 : 'instanceof' ;
T104 : '+' ;
T105 : '-' ;
T106 : '*' ;
T107 : '%' ;
T108 : '..' ;
T109 : '!' ;
T110 : '++' ;
T111 : '--' ;
T112 : 'context' ;
T113 : 'proceed' ;
T114 : '_' ;
T115 : 'throw' ;
T116 : 'try' ;
T117 : 'finally' ;
T118 : 'endtry' ;
T119 : 'catch' ;
T120 : 'switch' ;
T121 : 'if' ;
T122 : 'then' ;
T123 : 'else' ;
T124 : 'endif' ;
T125 : 'elseif' ;
T126 : 'this' ;
T127 : 'new' ;
T128 : 'unit-context' ;
T129 : 'select-units' ;
T130 : 'modify-selected' ;
T131 : 'builder-context' ;
T132 : 'select-builders' ;
T133 : 'having-parameters' ;
T134 : 'conditions' ;
T135 : 'precondition' ;
T136 : 'postinputcondition' ;
T137 : 'postcondition' ;
T138 : '|' ;
T139 : 'null' ;
T140 : 'true' ;
T141 : 'false' ;
T142 : '@' ;
T143 : '$' ;
T144 : '&' ;
T145 : 'latest' ;
T146 : 'revision' ;
T147 : 'tag' ;
T148 : 'timestamp' ;
T149 : 'fail-modified' ;
T150 : 'keep-modified' ;
T151 : 'merge-modified' ;
T152 : 'no-update' ;
T153 : 'replace-modified' ;
T154 : 'public' ;
T155 : 'private' ;
T156 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22485
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22487
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22489
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22491
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22493
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22495
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22497
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22499
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22501
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22503
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22505
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22507
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22509
RULE_ANY_OTHER : .;



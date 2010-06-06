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
T127 : 'modify' ;
T128 : 'new' ;
T129 : 'unit-context' ;
T130 : 'select-units' ;
T131 : 'modify-selected' ;
T132 : 'builder-context' ;
T133 : 'select-builders' ;
T134 : 'having-parameters' ;
T135 : 'conditions' ;
T136 : 'precondition' ;
T137 : 'postinputcondition' ;
T138 : 'postcondition' ;
T139 : '|' ;
T140 : 'null' ;
T141 : 'true' ;
T142 : 'false' ;
T143 : '@' ;
T144 : '$' ;
T145 : '&' ;
T146 : 'latest' ;
T147 : 'revision' ;
T148 : 'tag' ;
T149 : 'timestamp' ;
T150 : 'fail-modified' ;
T151 : 'keep-modified' ;
T152 : 'merge-modified' ;
T153 : 'no-update' ;
T154 : 'replace-modified' ;
T155 : 'public' ;
T156 : 'private' ;
T157 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22433
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22435
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22437
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22439
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22441
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22443
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22445
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22447
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22449
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22451
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22453
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22455
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22457
RULE_ANY_OTHER : .;



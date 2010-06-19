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
T67 : 'true' ;
T68 : 'false' ;
T69 : 'default' ;
T70 : 'branch' ;
T71 : 'policy' ;
T72 : 'checkout-content' ;
T73 : 'accept-dirty' ;
T74 : 'update-content' ;
T75 : 'on-merge-conflict' ;
T76 : 'replace-content' ;
T77 : 'exclude' ;
T78 : 'include' ;
T79 : 'resolution' ;
T80 : 'select-first' ;
T81 : 'select-best' ;
T82 : 'select-switch' ;
T83 : 'endswitch' ;
T84 : 'case' ;
T85 : 'container' ;
T86 : 'function' ;
T87 : '@callguard' ;
T88 : '+=' ;
T89 : '-=' ;
T90 : '*=' ;
T91 : '/=' ;
T92 : '%=' ;
T93 : '~=' ;
T94 : '==' ;
T95 : '===' ;
T96 : '!=' ;
T97 : '!==' ;
T98 : '>=' ;
T99 : '<=' ;
T100 : '>' ;
T101 : '<' ;
T102 : 'var' ;
T103 : 'val' ;
T104 : '=>' ;
T105 : '?' ;
T106 : 'super' ;
T107 : 'cached' ;
T108 : '||' ;
T109 : '&&' ;
T110 : 'instanceof' ;
T111 : '+' ;
T112 : '-' ;
T113 : '*' ;
T114 : '%' ;
T115 : '..' ;
T116 : '!' ;
T117 : '++' ;
T118 : '--' ;
T119 : 'context' ;
T120 : 'proceed' ;
T121 : '_' ;
T122 : 'throw' ;
T123 : 'try' ;
T124 : 'finally' ;
T125 : 'endtry' ;
T126 : 'catch' ;
T127 : 'switch' ;
T128 : 'if' ;
T129 : 'then' ;
T130 : 'else' ;
T131 : 'endif' ;
T132 : 'elseif' ;
T133 : 'this' ;
T134 : 'modify' ;
T135 : 'new' ;
T136 : 'unit-context' ;
T137 : 'select-units' ;
T138 : 'modify-selected' ;
T139 : 'builder-context' ;
T140 : 'select-builders' ;
T141 : 'having-parameters' ;
T142 : 'conditions' ;
T143 : 'precondition' ;
T144 : 'postinputcondition' ;
T145 : 'postcondition' ;
T146 : 'called-builder' ;
T147 : '|' ;
T148 : 'null' ;
T149 : '@' ;
T150 : '$' ;
T151 : '&' ;
T152 : 'latest' ;
T153 : 'revision' ;
T154 : 'tag' ;
T155 : 'timestamp' ;
T156 : 'public' ;
T157 : 'private' ;
T158 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22848
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22850
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22852
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22854
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22856
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22858
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22860
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22862
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22864
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22866
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22868
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22870
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22872
RULE_ANY_OTHER : .;



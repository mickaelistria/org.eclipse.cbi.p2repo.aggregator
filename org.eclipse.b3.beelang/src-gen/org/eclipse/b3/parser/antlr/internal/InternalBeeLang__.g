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
T87 : '+=' ;
T88 : '-=' ;
T89 : '*=' ;
T90 : '/=' ;
T91 : '%=' ;
T92 : '~=' ;
T93 : '==' ;
T94 : '===' ;
T95 : '!=' ;
T96 : '!==' ;
T97 : '>=' ;
T98 : '<=' ;
T99 : '>' ;
T100 : '<' ;
T101 : 'var' ;
T102 : 'val' ;
T103 : '=>' ;
T104 : '?' ;
T105 : 'super' ;
T106 : 'cached' ;
T107 : '||' ;
T108 : '&&' ;
T109 : 'instanceof' ;
T110 : '+' ;
T111 : '-' ;
T112 : '*' ;
T113 : '%' ;
T114 : '..' ;
T115 : '!' ;
T116 : '++' ;
T117 : '--' ;
T118 : 'context' ;
T119 : 'proceed' ;
T120 : '_' ;
T121 : 'throw' ;
T122 : 'try' ;
T123 : 'finally' ;
T124 : 'endtry' ;
T125 : 'catch' ;
T126 : 'switch' ;
T127 : 'if' ;
T128 : 'then' ;
T129 : 'else' ;
T130 : 'endif' ;
T131 : 'elseif' ;
T132 : 'this' ;
T133 : 'modify' ;
T134 : 'new' ;
T135 : 'unit-context' ;
T136 : 'select-units' ;
T137 : 'modify-selected' ;
T138 : 'builder-context' ;
T139 : 'select-builders' ;
T140 : 'having-parameters' ;
T141 : 'conditions' ;
T142 : 'precondition' ;
T143 : 'postinputcondition' ;
T144 : 'postcondition' ;
T145 : 'called-builder' ;
T146 : '|' ;
T147 : 'null' ;
T148 : '@' ;
T149 : '$' ;
T150 : '&' ;
T151 : 'latest' ;
T152 : 'revision' ;
T153 : 'tag' ;
T154 : 'timestamp' ;
T155 : 'public' ;
T156 : 'private' ;
T157 : 'parallel' ;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22609
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22611
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22613
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22615
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22617
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22619
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22621
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22623
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22625
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22627
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22629
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22631
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22633
RULE_ANY_OTHER : .;



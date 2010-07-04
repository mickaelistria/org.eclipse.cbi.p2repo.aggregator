lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T18 : 'reexport' ;
T19 : 'import' ;
T20 : 'as' ;
T21 : ';' ;
T22 : 'unit' ;
T23 : 'version' ;
T24 : 'implements' ;
T25 : ',' ;
T26 : '{' ;
T27 : 'source' ;
T28 : ':' ;
T29 : 'output' ;
T30 : 'provides' ;
T31 : '[' ;
T32 : ']' ;
T33 : 'requires' ;
T34 : 'env' ;
T35 : '}' ;
T36 : 'capability' ;
T37 : 'when' ;
T38 : 'name' ;
T39 : 'name-space' ;
T40 : 'greedy' ;
T41 : 'requires-min' ;
T42 : 'requires-max' ;
T43 : 'properties' ;
T44 : 'extends' ;
T45 : 'load-from' ;
T46 : 'default-properties' ;
T47 : '(' ;
T48 : ')' ;
T49 : 'final' ;
T50 : '=' ;
T51 : 'mutable' ;
T52 : 'sequential' ;
T53 : 'builder' ;
T54 : 'annotations' ;
T55 : '/' ;
T56 : 'with' ;
T57 : 'concern' ;
T58 : '.' ;
T59 : '...' ;
T60 : 'input' ;
T61 : 'result' ;
T62 : '@precondition' ;
T63 : '@postcondition' ;
T64 : '@postinputcondition' ;
T65 : 'repository' ;
T66 : 'connection' ;
T67 : 'branches' ;
T68 : 'true' ;
T69 : 'false' ;
T70 : 'default' ;
T71 : 'branch' ;
T72 : 'policy' ;
T73 : 'checkout-content' ;
T74 : 'accept-dirty' ;
T75 : 'update-content' ;
T76 : 'on-merge-conflict' ;
T77 : 'replace-content' ;
T78 : 'exclude' ;
T79 : 'include' ;
T80 : 'resolution' ;
T81 : 'select-first' ;
T82 : 'select-best' ;
T83 : 'select-switch' ;
T84 : 'endswitch' ;
T85 : 'case' ;
T86 : 'container' ;
T87 : 'function' ;
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

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22732
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22734
RULE_PID : '$' '{' RULE_ID ('.' RULE_ID)* '}';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22736
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22738
RULE_SIMPLE_PATTERN : '~' RULE_STRING;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22740
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22742
RULE_TEXT : '\u00AB' ( options {greedy=false;} : . )*'\u00BB';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22744
RULE_JAVADOC : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22746
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22748
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22750
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22752
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22754
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22756
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang/src-gen/org/eclipse/b3/parser/antlr/internal/InternalBeeLang.g" 22758
RULE_ANY_OTHER : .;



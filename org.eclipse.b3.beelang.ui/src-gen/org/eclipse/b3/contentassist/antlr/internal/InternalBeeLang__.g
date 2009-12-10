lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'input' ;
T17 : 'output' ;
T18 : '~~~~~' ;
T19 : 'select-first' ;
T20 : 'select-best' ;
T21 : '=' ;
T22 : '+=' ;
T23 : '-=' ;
T24 : '*=' ;
T25 : '/=' ;
T26 : '%=' ;
T27 : '&=' ;
T28 : '^=' ;
T29 : '|=' ;
T30 : '<<=' ;
T31 : '>>=' ;
T32 : '>>>=' ;
T33 : '~=' ;
T34 : '==' ;
T35 : '===' ;
T36 : '!=' ;
T37 : '!==' ;
T38 : '>=' ;
T39 : '<=' ;
T40 : '>' ;
T41 : '<' ;
T42 : 'instanceof' ;
T43 : 'var' ;
T44 : '&' ;
T45 : '^' ;
T46 : '|' ;
T47 : '<<' ;
T48 : '>>' ;
T49 : '>>>' ;
T50 : '+' ;
T51 : '-' ;
T52 : '*' ;
T53 : '/' ;
T54 : '%' ;
T55 : '!' ;
T56 : '~' ;
T57 : '++' ;
T58 : '--' ;
T59 : 'properties' ;
T60 : 'unit' ;
T61 : 'true' ;
T62 : 'false' ;
T63 : '[' ;
T64 : '(' ;
T65 : ']' ;
T66 : ')' ;
T67 : 'super' ;
T68 : 'this' ;
T69 : '.' ;
T70 : '@' ;
T71 : '$' ;
T72 : ':' ;
T73 : '?' ;
T74 : '..' ;
T75 : '**' ;
T76 : 'public' ;
T77 : 'private' ;
T78 : 'parallel' ;
T79 : 'sequential' ;
T80 : 'import' ;
T81 : ';' ;
T82 : 'as' ;
T83 : '{' ;
T84 : '}' ;
T85 : 'version' ;
T86 : 'implements' ;
T87 : ',' ;
T88 : 'default' ;
T89 : 'provides' ;
T90 : 'requires' ;
T91 : 'env' ;
T92 : 'repositories' ;
T93 : 'containers' ;
T94 : 'when' ;
T95 : 'extends' ;
T96 : 'unset' ;
T97 : '#' ;
T98 : 'annotations' ;
T99 : 'with' ;
T100 : 'concern' ;
T101 : 'builder' ;
T102 : '...' ;
T103 : 'repository' ;
T104 : 'container' ;
T105 : 'agent' ;
T106 : 'precondition' ;
T107 : 'postcondition' ;
T108 : 'assert' ;
T109 : 'function' ;
T110 : '||' ;
T111 : '&&' ;
T112 : '_' ;
T113 : 'throw' ;
T114 : 'try' ;
T115 : 'endtry' ;
T116 : 'finally' ;
T117 : 'catch' ;
T118 : 'switch' ;
T119 : 'endswitch' ;
T120 : 'case' ;
T121 : 'if' ;
T122 : 'then' ;
T123 : 'endif' ;
T124 : 'else' ;
T125 : 'elseif' ;
T126 : 'new' ;
T127 : 'context' ;
T128 : 'reexport' ;
T129 : 'final' ;
T130 : 'cached' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22339
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22341
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22343
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22345
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22347
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22349
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22351
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22353
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22355
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22357
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22359
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 22361
RULE_ANY_OTHER : .;



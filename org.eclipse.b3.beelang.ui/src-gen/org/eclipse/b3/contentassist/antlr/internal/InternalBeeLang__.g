lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'unit' ;
T17 : '=' ;
T18 : '+=' ;
T19 : '-=' ;
T20 : '*=' ;
T21 : '/=' ;
T22 : '%=' ;
T23 : '~=' ;
T24 : '==' ;
T25 : '===' ;
T26 : '!=' ;
T27 : '!==' ;
T28 : '>=' ;
T29 : '<=' ;
T30 : '>' ;
T31 : '<' ;
T32 : 'var' ;
T33 : '+' ;
T34 : '-' ;
T35 : '*' ;
T36 : '/' ;
T37 : '%' ;
T38 : '!' ;
T39 : '++' ;
T40 : '--' ;
T41 : 'input' ;
T42 : 'output' ;
T43 : 'source' ;
T44 : 'properties' ;
T45 : 'builder' ;
T46 : '?' ;
T47 : 'true' ;
T48 : 'false' ;
T49 : '[' ;
T50 : '(' ;
T51 : ']' ;
T52 : ')' ;
T53 : 'super' ;
T54 : 'this' ;
T55 : '.' ;
T56 : '@' ;
T57 : '$' ;
T58 : '&' ;
T59 : ':' ;
T60 : 'public' ;
T61 : 'private' ;
T62 : 'parallel' ;
T63 : 'sequential' ;
T64 : 'import' ;
T65 : ';' ;
T66 : 'as' ;
T67 : '{' ;
T68 : '}' ;
T69 : 'version' ;
T70 : 'implements' ;
T71 : ',' ;
T72 : 'default' ;
T73 : 'provides' ;
T74 : 'requires' ;
T75 : 'env' ;
T76 : 'repositories' ;
T77 : 'containers' ;
T78 : 'when' ;
T79 : 'extends' ;
T80 : 'annotations' ;
T81 : 'with' ;
T82 : 'concern' ;
T83 : '#' ;
T84 : 'precondition' ;
T85 : 'postinputcondition' ;
T86 : 'postcondition' ;
T87 : 'repository' ;
T88 : 'select-first' ;
T89 : 'select-best' ;
T90 : 'container' ;
T91 : 'agent' ;
T92 : 'function' ;
T93 : '=>' ;
T94 : 'cached' ;
T95 : '||' ;
T96 : '&&' ;
T97 : 'context' ;
T98 : 'proceed' ;
T99 : '_' ;
T100 : 'throw' ;
T101 : 'try' ;
T102 : 'endtry' ;
T103 : 'finally' ;
T104 : 'catch' ;
T105 : 'switch' ;
T106 : 'endswitch' ;
T107 : 'case' ;
T108 : 'if' ;
T109 : 'then' ;
T110 : 'endif' ;
T111 : 'else' ;
T112 : 'elseif' ;
T113 : 'new' ;
T114 : '|' ;
T115 : 'null' ;
T116 : 'reexport' ;
T117 : 'final' ;
T118 : 'mutable' ;
T119 : '...' ;
T120 : 'val' ;
T121 : 'instanceof' ;
T122 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37364
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37366
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37368
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37370
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37372
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37374
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37376
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37378
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37380
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37382
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37384
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 37386
RULE_ANY_OTHER : .;



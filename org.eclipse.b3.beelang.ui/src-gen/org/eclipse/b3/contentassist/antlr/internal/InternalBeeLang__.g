lexer grammar InternalBeeLang;
@header {
package org.eclipse.b3.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T16 : 'input' ;
T17 : 'output' ;
T18 : 'property' ;
T19 : 'select-first' ;
T20 : 'select-best' ;
T21 : '=' ;
T22 : '+=' ;
T23 : '-=' ;
T24 : '*=' ;
T25 : '/=' ;
T26 : '%=' ;
T27 : '~=' ;
T28 : '==' ;
T29 : '===' ;
T30 : '!=' ;
T31 : '!==' ;
T32 : '>=' ;
T33 : '<=' ;
T34 : '>' ;
T35 : '<' ;
T36 : 'var' ;
T37 : '+' ;
T38 : '-' ;
T39 : '*' ;
T40 : '/' ;
T41 : '%' ;
T42 : '!' ;
T43 : '++' ;
T44 : '--' ;
T45 : 'properties' ;
T46 : 'unit' ;
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
T60 : '?' ;
T61 : 'public' ;
T62 : 'private' ;
T63 : 'parallel' ;
T64 : 'sequential' ;
T65 : 'import' ;
T66 : ';' ;
T67 : 'as' ;
T68 : '{' ;
T69 : '}' ;
T70 : 'version' ;
T71 : 'implements' ;
T72 : ',' ;
T73 : 'default' ;
T74 : 'provides' ;
T75 : 'requires' ;
T76 : 'env' ;
T77 : 'repositories' ;
T78 : 'containers' ;
T79 : 'when' ;
T80 : 'extends' ;
T81 : '#' ;
T82 : 'annotations' ;
T83 : 'with' ;
T84 : 'concern' ;
T85 : 'builder' ;
T86 : '...' ;
T87 : 'repository' ;
T88 : 'container' ;
T89 : 'agent' ;
T90 : 'precondition' ;
T91 : 'postcondition' ;
T92 : 'assert' ;
T93 : 'function' ;
T94 : '=>' ;
T95 : 'cached' ;
T96 : '||' ;
T97 : '&&' ;
T98 : '_' ;
T99 : 'throw' ;
T100 : 'try' ;
T101 : 'endtry' ;
T102 : 'finally' ;
T103 : 'catch' ;
T104 : 'switch' ;
T105 : 'endswitch' ;
T106 : 'case' ;
T107 : 'if' ;
T108 : 'then' ;
T109 : 'endif' ;
T110 : 'else' ;
T111 : 'elseif' ;
T112 : 'new' ;
T113 : 'context' ;
T114 : '|' ;
T115 : 'null' ;
T116 : 'reexport' ;
T117 : 'final' ;
T118 : 'mutable' ;
T119 : 'val' ;
T120 : 'instanceof' ;
T121 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24384
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24386
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24388
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24390
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24392
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24394
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24396
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24398
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24400
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24402
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24404
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 24406
RULE_ANY_OTHER : .;



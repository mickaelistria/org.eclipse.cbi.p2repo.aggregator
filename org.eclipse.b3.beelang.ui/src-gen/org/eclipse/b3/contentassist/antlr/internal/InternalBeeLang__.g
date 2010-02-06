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
T43 : 'properties' ;
T44 : '?' ;
T45 : 'true' ;
T46 : 'false' ;
T47 : '[' ;
T48 : '(' ;
T49 : ']' ;
T50 : ')' ;
T51 : 'super' ;
T52 : 'this' ;
T53 : '.' ;
T54 : '@' ;
T55 : '$' ;
T56 : '&' ;
T57 : ':' ;
T58 : 'public' ;
T59 : 'private' ;
T60 : 'parallel' ;
T61 : 'sequential' ;
T62 : 'import' ;
T63 : ';' ;
T64 : 'as' ;
T65 : '{' ;
T66 : '}' ;
T67 : 'version' ;
T68 : 'implements' ;
T69 : ',' ;
T70 : 'default' ;
T71 : 'provides' ;
T72 : 'requires' ;
T73 : 'env' ;
T74 : 'repositories' ;
T75 : 'containers' ;
T76 : 'when' ;
T77 : 'extends' ;
T78 : 'builder' ;
T79 : 'annotations' ;
T80 : 'with' ;
T81 : 'concern' ;
T82 : '#' ;
T83 : 'precondition' ;
T84 : 'postinputcondition' ;
T85 : 'postcondition' ;
T86 : 'repository' ;
T87 : 'select-first' ;
T88 : 'select-best' ;
T89 : 'container' ;
T90 : 'agent' ;
T91 : 'function' ;
T92 : '=>' ;
T93 : 'cached' ;
T94 : '||' ;
T95 : '&&' ;
T96 : 'proceed' ;
T97 : '_' ;
T98 : 'throw' ;
T99 : 'try' ;
T100 : 'endtry' ;
T101 : 'finally' ;
T102 : 'catch' ;
T103 : 'switch' ;
T104 : 'endswitch' ;
T105 : 'case' ;
T106 : 'if' ;
T107 : 'then' ;
T108 : 'endif' ;
T109 : 'else' ;
T110 : 'elseif' ;
T111 : 'new' ;
T112 : 'context' ;
T113 : '|' ;
T114 : 'null' ;
T115 : 'reexport' ;
T116 : 'final' ;
T117 : 'mutable' ;
T118 : '...' ;
T119 : 'val' ;
T120 : 'instanceof' ;
T121 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35622
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35624
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35626
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35628
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35630
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35632
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35634
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35636
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35638
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35640
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35642
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 35644
RULE_ANY_OTHER : .;



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
T71 : 'source' ;
T72 : 'provides' ;
T73 : 'requires' ;
T74 : 'env' ;
T75 : 'repositories' ;
T76 : 'containers' ;
T77 : 'when' ;
T78 : 'extends' ;
T79 : 'builder' ;
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
T97 : 'proceed' ;
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
T119 : '...' ;
T120 : 'val' ;
T121 : 'instanceof' ;
T122 : '..' ;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36888
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36890
RULE_PID : '$' RULE_ID ('.' RULE_ID)*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36892
RULE_REGULAR_EXPR : '~/' ('\\' ~(('\t'|'\r'|'\n'))|~(('\\'|'/'|' '|'\t'|'\r'|'\n')))* '/' ('u'|'m'|'i'|'c'|'d')*;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36894
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'"'|'\r'|'\n')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'x'|'0'|'"'|'\''|'\\')|~(('\\'|'\''|'\r'|'\n')))* '\'');

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36896
RULE_DOCUMENTATION : '/**' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36898
RULE_ML_COMMENT : '/*' ~('*') ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36900
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36902
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36904
RULE_HEX : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36906
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36908
RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

// $ANTLR src "../org.eclipse.b3.beelang.ui/src-gen/org/eclipse/b3/contentassist/antlr/internal/InternalBeeLang.g" 36910
RULE_ANY_OTHER : .;



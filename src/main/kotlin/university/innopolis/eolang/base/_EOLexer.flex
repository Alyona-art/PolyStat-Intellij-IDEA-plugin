package university.innopolis.eolang.base;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static university.innopolis.eolang.base.psi.EOTypes.*;

%%

%{
  public _EOLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _EOLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\n
WHITE_SPACE=\s+
NAME=[a-z][ˆ␣]*
ANY=[^\n.]*
TAB=\t
UNTAB=\t
BYTE=[\dA-F][\dA-F]
STRING=\"[ˆ\"]*\"
INTEGER=[+-]?\d+|0x[a-f\d]+
CHAR='([ˆ']|\\\d+)'
REGEX=[/].+[/][a-z]*
FLOAT=[+-]?\d+(\.\d+)?[/]
EXP=e(\+|-)?\d+[/]


%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "eol"              { return EOL; }
  "any"              { return ANY; }
  "NAME"             { return NAME; }
  "tab"              { return TAB; }
  "untab"            { return UNTAB; }
  "BYTE"             { return BYTE; }
  "STRING"           { return STRING; }
  "INTEGER"          { return INTEGER; }
  "CHAR"             { return CHAR; }
  "REGEX"            { return REGEX; }
  "FLOAT"            { return FLOAT; }
  "EXPRESSION"       { return EXP; }


}

[^] { return BAD_CHARACTER; }

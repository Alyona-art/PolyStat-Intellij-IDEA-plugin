package university.innopolis.eolang.base;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static university.innopolis.eolang.base.psi.EOTypes.*;

%%

%{
  public EOLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class EOLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=[\r\n\f]+
WHITE_SPACE=[ ]+
NAME=[a-z]+
BYTE=[\dA-F][\dA-F]
STRING=\"[ˆ\"]*\"
INTEGER=[+-]?\d+|0x[a-f\d]+
CHAR='([ˆ']|\\\d+)'
REGEX=\/.+\/[a-z]*
FLOAT=[+-]?\d+(\.\d+)?
EXP=e(\+|\-)?\d+
INDENT=\t
DEDENT=\b

%%
<YYINITIAL> {
  {EOL}              { return EOL; }
  {WHITE_SPACE}      { return SPACE; }
  {NAME}             { return NAME; }
  {STRING}           { return STRING; }
  {INTEGER}          { return INTEGER; }
  {CHAR}             { return CHAR; }
  {FLOAT}            { return FLOAT; }
  {REGEX}            { return REGEX; }
  {BYTE}             { return BYTE; }
  {INDENT}           { return INDENT; }
  {DEDENT}           { return DEDENT; }
}

[^] { return BAD_CHARACTER; }

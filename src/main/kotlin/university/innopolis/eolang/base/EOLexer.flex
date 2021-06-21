package university.innopolis.eolang.base;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.util.logging.Logger;import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static university.innopolis.eolang.base.psi.EOTypes.*;

%%

%{
  public EOLexer() {
    this((java.io.Reader)null);
  }
  private int spaces = 0;
  private boolean isEol = false;
%}

%public
%class EOLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\r|\n|\r\n
SPACE=[ ]+

COMMENT={HASH}[^\r\n]*
METANAME={SPACE}[^\r\n]+

REGEX={SLASH}[^\r\n]+{SLASH}[a-z]*

STAR=\*
DOTS=\.\.\.
CONST=\!
SLASH=\/
COLON=:
ARROW=>
SELF=\$
PLUS=\+
MINUS=-
DOT=\.
LSQ="["
RSQ="]"
LB=\(
RB=\)
AT=@
PARENT=\^
HASH=#
BYTE=[0-9A-F][0-9A-F]
BOOL=true|false
CHAR= \'[0-9a-zA-Z]\'
STRING= \"(\\\" | ~\")*\"
INT=({PLUS}|{MINUS})? [0-9]+
FLOAT=({PLUS}|{MINUS})? [0-9]+ {DOT} [0-9]+
HEX=0x[0-9a-f]+
NAME=[a-z][a-z0-9_A-Z\-]*
%state TABULATION
%%
<YYINITIAL> {
  {BOOL}             { return BOOL; }
  {COMMENT}          { return COMMENT; }
  {PLUS}             { return PLUS; }
  {NAME}             { return NAME; }
  {METANAME}         { return METANAME; }
  {SLASH}            { return SLASH; }
  {LSQ}              { return LSQ; }
  {RSQ}              { return RSQ; }
  {AT}               { return AT; }
  {DOTS}             { return DOTS; }
  {ARROW}            { return ARROW; }
  {CONST}            { return CONST; }
  {DOT}              { return DOT; }
  {PARENT}           { return PARENT; }
  {LB}               { return LB; }
  {RB}               { return RB; }
  {SELF}             { return SELF; }
  {STAR}             { return STAR; }
  {COLON}            { return COLON; }
  {STRING}           { return STRING; }
  {INT}              { return INT; }
  {FLOAT}            { return FLOAT; }
  {HEX}              { return HEX; }
  {CHAR}             { return CHAR; }
  {REGEX}            { return REGEX; }
  {BYTE}             { return BYTE; }
  {MINUS}            { return MINUS; }
       {EOL}              {
                  System.out.println("EOL");
                  yybegin(TABULATION);
                  return EOL;
              }
  {SPACE}            {
          return WHITE_SPACE;
  }

}

<TABULATION> {
    {SPACE} {
          int currentSpaces = yytext().length();
          currentSpaces = currentSpaces - currentSpaces % 2;
          int delta = currentSpaces - spaces;
          if (delta != 0) {
              if (delta > 0) {
                  spaces += 2;
                  yypushback(yytext().length());
                  System.out.println("TAB");
                  return TAB;
              } else {
                  spaces -= 2;
                  yypushback(yytext().length());
                  System.out.println("UNTAB");
                  return UNTAB;
              }
          }
          yybegin(YYINITIAL);
          yypushback(yytext().length() - currentSpaces);
       }
   [^] { yybegin(YYINITIAL); }
}

[^] { return BAD_CHARACTER; }

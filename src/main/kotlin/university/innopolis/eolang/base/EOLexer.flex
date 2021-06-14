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

%{
    private boolean isStart = true;
    private int indentStep = 2;
    private int currentWhiteSpaces = 0;
    private int currentIndent = 0;

    private IElementType checkForIndent(IElementType element) {
        if (isStart) {
            isStart = false;
        }
        if (currentWhiteSpaces >= currentIndent) return element;
        currentIndent -= indentStep;
        yypushback(yylength());
        System.out.println("DEDENT " + currentIndent);
        return DEDENT;
    }
%}
//%type IElementType
//%eofval{
//        if (currentWhiteSpaces >= currentIndent) return EOF;
//        currentIndent -= indentStep;
//        zzEOFDone = false;
//        System.out.println("DEDENT " + currentIndent);
//        return DEDENT;
//%eofval}
EOL=(\r|\n|\r\n)+
WHITE_SPACE=[ ]
NAME=[a-z]+
BYTE=[\dA-F][\dA-F]
STRING=\"[ˆ\"]*\"
INTEGER=[+-]?\d+|0x[a-f\d]+
CHAR='([ˆ']|\\\d+)'
REGEX=\/.+\/[a-z]*
FLOAT=[+-]?\d+(\.\d+)?
EXP=e(\+|\-)?\d+
INDENT=[\t]

%%
<YYINITIAL> {

  {EOL}              {
 if (currentWhiteSpaces >= currentIndent) {

     isStart = true;
                   currentWhiteSpaces = 0;
                   return EOL;
 }
        currentIndent -= indentStep;
        yypushback(yylength());
        System.out.println("DEDENT " + currentIndent);
        return DEDENT;


      }

  {NAME}             {
          IElementType e = checkForIndent(NAME);
          if (e != null) return e;
      }
  {STRING}           {
      IElementType e = checkForIndent(STRING);
                if (e != null) return e;}
  {INTEGER}          {
      IElementType e = checkForIndent(INTEGER);
                if (e != null) return e;}
  {CHAR}             {
      IElementType e = checkForIndent(CHAR);
                if (e != null) return e;}
  {FLOAT}            {
      IElementType e = checkForIndent(FLOAT);
                if (e != null) return e;}
  {REGEX}            {
      IElementType e = checkForIndent(REGEX);
                if (e != null) return e;}
  {BYTE}             {
      IElementType e = checkForIndent(BYTE);
                if (e != null) return e;}
  {INDENT}           {

      }
       {WHITE_SPACE}      {
            if (isStart) {
                currentWhiteSpaces++;
                if (currentWhiteSpaces > currentIndent) {
                    currentIndent = currentWhiteSpaces;
                    System.out.println(currentWhiteSpaces + " " + currentIndent + " " + indentStep);

                    if (indentStep != 0 && currentIndent % indentStep == 0)
                        return INDENT;
                }
            } else {
                return SPACE;
            }
      }
}

[^] { return BAD_CHARACTER; }

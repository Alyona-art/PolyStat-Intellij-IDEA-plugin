// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static university.innopolis.eolang.base.psi.EOTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class EOParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return program(b, l + 1);
  }

  /* ********************************************************** */
  // attributes [ suffix [ space '/' name ] ]
  public static boolean abstraction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACTION, "<abstraction>");
    r = attributes(b, l + 1);
    r = r && abstraction_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ suffix [ space '/' name ] ]
  private static boolean abstraction_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_1")) return false;
    abstraction_1_0(b, l + 1);
    return true;
  }

  // suffix [ space '/' name ]
  private static boolean abstraction_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix(b, l + 1);
    r = r && abstraction_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ space '/' name ]
  private static boolean abstraction_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_1_0_1")) return false;
    abstraction_1_0_1_0(b, l + 1);
    return true;
  }

  // space '/' name
  private static boolean abstraction_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && consumeToken(b, "/");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string | integer | char | float | regex | byte | name
  public static boolean any(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "any")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ANY, "<any>");
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, REGEX);
    if (!r) r = consumeToken(b, BYTE);
    if (!r) r = consumeToken(b, NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // head [ htail ]
  public static boolean application(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APPLICATION, "<application>");
    r = head(b, l + 1);
    r = r && application_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ htail ]
  private static boolean application_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_1")) return false;
    htail(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '@' | name [ '...' ]
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, "<attribute>");
    r = consumeToken(b, "@");
    if (!r) r = attribute_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name [ '...' ]
  private static boolean attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && attribute_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ '...' ]
  private static boolean attribute_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_1_1")) return false;
    consumeToken(b, "...");
    return true;
  }

  /* ********************************************************** */
  // '[' attribute [{ space attribute }] ']'
  public static boolean attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTES, "<attributes>");
    r = consumeToken(b, "[");
    r = r && attribute(b, l + 1);
    r = r && attributes_2(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [{ space attribute }]
  private static boolean attributes_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_2")) return false;
    attributes_2_0(b, l + 1);
    return true;
  }

  // space attribute
  private static boolean attributes_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // byte { '-' byte }
  public static boolean bytes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bytes")) return false;
    if (!nextTokenIs(b, BYTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BYTE);
    r = r && bytes_1(b, l + 1);
    exit_section_(b, m, BYTES, r);
    return r;
  }

  // '-' byte
  private static boolean bytes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bytes_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    r = r && consumeToken(b, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '#' any eol
  public static boolean comment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMENT, "<comment>");
    r = consumeToken(b, "#");
    r = r && any(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // bytes | string | integer
  //         | char | float [ exp ] | regex
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA, "<data>");
    r = bytes(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INTEGER);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = data_4(b, l + 1);
    if (!r) r = consumeToken(b, REGEX);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // float [ exp ]
  private static boolean data_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FLOAT);
    r = r && data_4_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ exp ]
  private static boolean data_4_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_4_1")) return false;
    consumeToken(b, EXP);
    return true;
  }

  /* ********************************************************** */
  // [ tail ] [{ vtail }]
  public static boolean details(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "details")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DETAILS, "<details>");
    r = details_0(b, l + 1);
    r = r && details_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [ tail ]
  private static boolean details_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "details_0")) return false;
    tail(b, l + 1);
    return true;
  }

  // [{ vtail }]
  private static boolean details_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "details_1")) return false;
    details_1_0(b, l + 1);
    return true;
  }

  // { vtail }
  private static boolean details_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "details_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vtail(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // name '.' | name | data | '@' | '$'
  //         | '^' | '*' | '(' application ')'
  public static boolean head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "head")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD, "<head>");
    r = head_0(b, l + 1);
    if (!r) r = consumeToken(b, NAME);
    if (!r) r = data(b, l + 1);
    if (!r) r = consumeToken(b, "@");
    if (!r) r = consumeToken(b, "$");
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = head_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name '.'
  private static boolean head_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "head_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && consumeToken(b, ".");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' application ')'
  private static boolean head_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "head_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && application(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // space application [method]
  //            | space application ':' name
  //            | suffix
  //            | space application space application
  public static boolean htail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail")) return false;
    if (!nextTokenIs(b, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = htail_0(b, l + 1);
    if (!r) r = htail_1(b, l + 1);
    if (!r) r = suffix(b, l + 1);
    if (!r) r = htail_3(b, l + 1);
    exit_section_(b, m, HTAIL, r);
    return r;
  }

  // space application [method]
  private static boolean htail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && application(b, l + 1);
    r = r && htail_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [method]
  private static boolean htail_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_0_2")) return false;
    method(b, l + 1);
    return true;
  }

  // space application ':' name
  private static boolean htail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && application(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  // space application space application
  private static boolean htail_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && application(b, l + 1);
    r = r && consumeToken(b, SPACE);
    r = r && application(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // { comment }
  public static boolean license(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "license")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LICENSE, "<license>");
    r = comment(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+' name space any eol
  public static boolean metaa(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metaa")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METAA, "<metaa>");
    r = consumeToken(b, "+");
    r = r && consumeTokens(b, 0, NAME, SPACE);
    r = r && any(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // { metaa }
  public static boolean metas(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metas")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METAS, "<metas>");
    r = metaa(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '.' ( name | '^' )
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD, "<method>");
    r = consumeToken(b, ".");
    r = r && method_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name | '^'
  private static boolean method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_1")) return false;
    boolean r;
    r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, "^");
    return r;
  }

  /* ********************************************************** */
  // ( abstraction | application ) details
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    r = object_0(b, l + 1);
    r = r && details(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // abstraction | application
  private static boolean object_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_0")) return false;
    boolean r;
    r = abstraction(b, l + 1);
    if (!r) r = application(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // [ license ] [ metas ] { object eol }
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_0(b, l + 1);
    r = r && program_1(b, l + 1);
    r = r && program_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [ license ]
  private static boolean program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_0")) return false;
    license(b, l + 1);
    return true;
  }

  // [ metas ]
  private static boolean program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_1")) return false;
    metas(b, l + 1);
    return true;
  }

  // object eol
  private static boolean program_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // space '>' space ( '@' | name ) [ '!' ]
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    if (!nextTokenIs(b, SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SPACE);
    r = r && consumeToken(b, ">");
    r = r && consumeToken(b, SPACE);
    r = r && suffix_3(b, l + 1);
    r = r && suffix_4(b, l + 1);
    exit_section_(b, m, SUFFIX, r);
    return r;
  }

  // '@' | name
  private static boolean suffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_3")) return false;
    boolean r;
    r = consumeToken(b, "@");
    if (!r) r = consumeToken(b, NAME);
    return r;
  }

  // [ '!' ]
  private static boolean suffix_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_4")) return false;
    consumeToken(b, "!");
    return true;
  }

  /* ********************************************************** */
  // eol indent { object eol } dedent
  public static boolean tail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tail")) return false;
    if (!nextTokenIs(b, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EOL, INDENT);
    r = r && tail_2(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, TAIL, r);
    return r;
  }

  // object eol
  private static boolean tail_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tail_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // eol method [ htail ] [ suffix ] [ tail ]
  public static boolean vtail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vtail")) return false;
    if (!nextTokenIs(b, EOL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    r = r && method(b, l + 1);
    r = r && vtail_2(b, l + 1);
    r = r && vtail_3(b, l + 1);
    r = r && vtail_4(b, l + 1);
    exit_section_(b, m, VTAIL, r);
    return r;
  }

  // [ htail ]
  private static boolean vtail_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vtail_2")) return false;
    htail(b, l + 1);
    return true;
  }

  // [ suffix ]
  private static boolean vtail_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vtail_3")) return false;
    suffix(b, l + 1);
    return true;
  }

  // [ tail ]
  private static boolean vtail_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vtail_4")) return false;
    tail(b, l + 1);
    return true;
  }

}

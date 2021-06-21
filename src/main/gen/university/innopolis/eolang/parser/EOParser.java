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
  // [{comment eol}] attributes [suffix [slash name]]
  public static boolean abstraction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction")) return false;
    if (!nextTokenIs(b, "<abstraction>", COMMENT, LSQ)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACTION, "<abstraction>");
    r = abstraction_0(b, l + 1);
    r = r && attributes(b, l + 1);
    r = r && abstraction_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [{comment eol}]
  private static boolean abstraction_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_0")) return false;
    abstraction_0_0(b, l + 1);
    return true;
  }

  // comment eol
  private static boolean abstraction_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMENT, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // [suffix [slash name]]
  private static boolean abstraction_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_2")) return false;
    abstraction_2_0(b, l + 1);
    return true;
  }

  // suffix [slash name]
  private static boolean abstraction_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix(b, l + 1);
    r = r && abstraction_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [slash name]
  private static boolean abstraction_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstraction_2_0_1")) return false;
    parseTokens(b, 0, SLASH, NAME);
    return true;
  }

  /* ********************************************************** */
  // attributes htail
  public static boolean anonymous(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous")) return false;
    if (!nextTokenIs(b, LSQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributes(b, l + 1);
    r = r && htail(b, l + 1);
    exit_section_(b, m, ANONYMOUS, r);
    return r;
  }

  /* ********************************************************** */
  // head [htail] [method [htail] | has [htail] | suffix [htail]]
  //                 | LB application RB [htail]
  public static boolean application(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, APPLICATION, "<application>");
    r = application_0(b, l + 1);
    if (!r) r = application_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // head [htail] [method [htail] | has [htail] | suffix [htail]]
  private static boolean application_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = head(b, l + 1);
    r = r && application_0_1(b, l + 1);
    r = r && application_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [htail]
  private static boolean application_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_1")) return false;
    htail(b, l + 1);
    return true;
  }

  // [method [htail] | has [htail] | suffix [htail]]
  private static boolean application_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2")) return false;
    application_0_2_0(b, l + 1);
    return true;
  }

  // method [htail] | has [htail] | suffix [htail]
  private static boolean application_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = application_0_2_0_0(b, l + 1);
    if (!r) r = application_0_2_0_1(b, l + 1);
    if (!r) r = application_0_2_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // method [htail]
  private static boolean application_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method(b, l + 1);
    r = r && application_0_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [htail]
  private static boolean application_0_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0_0_1")) return false;
    htail(b, l + 1);
    return true;
  }

  // has [htail]
  private static boolean application_0_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = has(b, l + 1);
    r = r && application_0_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [htail]
  private static boolean application_0_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0_1_1")) return false;
    htail(b, l + 1);
    return true;
  }

  // suffix [htail]
  private static boolean application_0_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = suffix(b, l + 1);
    r = r && application_0_2_0_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [htail]
  private static boolean application_0_2_0_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_0_2_0_2_1")) return false;
    htail(b, l + 1);
    return true;
  }

  // LB application RB [htail]
  private static boolean application_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && application(b, l + 1);
    r = r && consumeToken(b, RB);
    r = r && application_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [htail]
  private static boolean application_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "application_1_3")) return false;
    htail(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // label
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, "<attribute>", AT, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTRIBUTE, "<attribute>");
    r = label(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LSQ [attribute [{attribute}]] RSQ
  public static boolean attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes")) return false;
    if (!nextTokenIs(b, LSQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQ);
    r = r && attributes_1(b, l + 1);
    r = r && consumeToken(b, RSQ);
    exit_section_(b, m, ATTRIBUTES, r);
    return r;
  }

  // [attribute [{attribute}]]
  private static boolean attributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1")) return false;
    attributes_1_0(b, l + 1);
    return true;
  }

  // attribute [{attribute}]
  private static boolean attributes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    r = r && attributes_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [{attribute}]
  private static boolean attributes_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_1")) return false;
    attributes_1_0_1_0(b, l + 1);
    return true;
  }

  // {attribute}
  private static boolean attributes_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // byte [{minus byte}]
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

  // [{minus byte}]
  private static boolean bytes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bytes_1")) return false;
    bytes_1_0(b, l + 1);
    return true;
  }

  // minus byte
  private static boolean bytes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bytes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, MINUS, BYTE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // bytes
  //            |bool
  //            |string
  //            |int
  //            |float
  //            |hex
  //            |char
  //            |regex
  public static boolean data(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DATA, "<data>");
    r = bytes(b, l + 1);
    if (!r) r = consumeToken(b, BOOL);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, INT);
    if (!r) r = consumeToken(b, FLOAT);
    if (!r) r = consumeToken(b, HEX);
    if (!r) r = consumeToken(b, CHAR);
    if (!r) r = consumeToken(b, REGEX);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // colon name
  public static boolean has(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "has")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COLON, NAME);
    exit_section_(b, m, HAS, r);
    return r;
  }

  /* ********************************************************** */
  // at
  //            |parent
  //            |self
  //            |star
  //            |name
  //            |name dot
  //            |data
  public static boolean head(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "head")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEAD, "<head>");
    r = consumeToken(b, AT);
    if (!r) r = consumeToken(b, PARENT);
    if (!r) r = consumeToken(b, SELF);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, NAME);
    if (!r) r = parseTokens(b, 0, NAME, DOT);
    if (!r) r = data(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // head
  //           |application method
  //           |LB application RB
  //           |application has
  //           |application suffix
  //           |anonymous
  public static boolean htail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HTAIL, "<htail>");
    r = head(b, l + 1);
    if (!r) r = htail_1(b, l + 1);
    if (!r) r = htail_2(b, l + 1);
    if (!r) r = htail_3(b, l + 1);
    if (!r) r = htail_4(b, l + 1);
    if (!r) r = anonymous(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // application method
  private static boolean htail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = application(b, l + 1);
    r = r && method(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LB application RB
  private static boolean htail_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LB);
    r = r && application(b, l + 1);
    r = r && consumeToken(b, RB);
    exit_section_(b, m, null, r);
    return r;
  }

  // application has
  private static boolean htail_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = application(b, l + 1);
    r = r && has(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // application suffix
  private static boolean htail_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "htail_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = application(b, l + 1);
    r = r && suffix(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // at|name [dots]
  public static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    if (!nextTokenIs(b, "<label>", AT, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABEL, "<label>");
    r = consumeToken(b, AT);
    if (!r) r = label_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // name [dots]
  private static boolean label_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && label_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [dots]
  private static boolean label_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label_1_1")) return false;
    consumeToken(b, DOTS);
    return true;
  }

  /* ********************************************************** */
  // [{comment eol}]
  public static boolean license(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "license")) return false;
    Marker m = enter_section_(b, l, _NONE_, LICENSE, "<license>");
    license_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // comment eol
  private static boolean license_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "license_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMENT, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [{plus name [metaname] eol}]
  public static boolean metas(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metas")) return false;
    Marker m = enter_section_(b, l, _NONE_, METAS, "<metas>");
    metas_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // plus name [metaname] eol
  private static boolean metas_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metas_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PLUS, NAME);
    r = r && metas_0_2(b, l + 1);
    r = r && consumeToken(b, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // [metaname]
  private static boolean metas_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "metas_0_2")) return false;
    consumeToken(b, METANAME);
    return true;
  }

  /* ********************************************************** */
  // dot(name|parent)
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    if (!nextTokenIs(b, DOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && method_1(b, l + 1);
    exit_section_(b, m, METHOD, r);
    return r;
  }

  // name|parent
  private static boolean method_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_1")) return false;
    boolean r;
    r = consumeToken(b, NAME);
    if (!r) r = consumeToken(b, PARENT);
    return r;
  }

  /* ********************************************************** */
  // anonymous
  //            | (abstraction | application) [eol tail] [{method  [htail] [suffix] [tail]}]
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT, "<object>");
    r = anonymous(b, l + 1);
    if (!r) r = object_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (abstraction | application) [eol tail] [{method  [htail] [suffix] [tail]}]
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object_1_0(b, l + 1);
    r = r && object_1_1(b, l + 1);
    r = r && object_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // abstraction | application
  private static boolean object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0")) return false;
    boolean r;
    r = abstraction(b, l + 1);
    if (!r) r = application(b, l + 1);
    return r;
  }

  // [eol tail]
  private static boolean object_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_1")) return false;
    object_1_1_0(b, l + 1);
    return true;
  }

  // eol tail
  private static boolean object_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    r = r && tail(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [{method  [htail] [suffix] [tail]}]
  private static boolean object_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_2")) return false;
    object_1_2_0(b, l + 1);
    return true;
  }

  // method  [htail] [suffix] [tail]
  private static boolean object_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = method(b, l + 1);
    r = r && object_1_2_0_1(b, l + 1);
    r = r && object_1_2_0_2(b, l + 1);
    r = r && object_1_2_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [htail]
  private static boolean object_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_2_0_1")) return false;
    htail(b, l + 1);
    return true;
  }

  // [suffix]
  private static boolean object_1_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_2_0_2")) return false;
    suffix(b, l + 1);
    return true;
  }

  // [tail]
  private static boolean object_1_2_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_2_0_3")) return false;
    tail(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [{comment eol}] object [{eol object}]
  public static boolean objects(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objects")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECTS, "<objects>");
    r = objects_0(b, l + 1);
    r = r && object(b, l + 1);
    r = r && objects_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // [{comment eol}]
  private static boolean objects_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objects_0")) return false;
    objects_0_0(b, l + 1);
    return true;
  }

  // comment eol
  private static boolean objects_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objects_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMENT, EOL);
    exit_section_(b, m, null, r);
    return r;
  }

  // [{eol object}]
  private static boolean objects_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objects_2")) return false;
    objects_2_0(b, l + 1);
    return true;
  }

  // eol object
  private static boolean objects_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "objects_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EOL);
    r = r && object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [license] [metas] objects
  static boolean program(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = program_0(b, l + 1);
    r = r && program_1(b, l + 1);
    r = r && objects(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [license]
  private static boolean program_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_0")) return false;
    license(b, l + 1);
    return true;
  }

  // [metas]
  private static boolean program_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_1")) return false;
    metas(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // arrow label [const]
  public static boolean suffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix")) return false;
    if (!nextTokenIs(b, ARROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ARROW);
    r = r && label(b, l + 1);
    r = r && suffix_2(b, l + 1);
    exit_section_(b, m, SUFFIX, r);
    return r;
  }

  // [const]
  private static boolean suffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "suffix_2")) return false;
    consumeToken(b, CONST);
    return true;
  }

  /* ********************************************************** */
  // TAB {object} UNTAB
  public static boolean tail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tail")) return false;
    if (!nextTokenIs(b, TAB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TAB);
    r = r && tail_1(b, l + 1);
    r = r && consumeToken(b, UNTAB);
    exit_section_(b, m, TAIL, r);
    return r;
  }

  // {object}
  private static boolean tail_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tail_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}

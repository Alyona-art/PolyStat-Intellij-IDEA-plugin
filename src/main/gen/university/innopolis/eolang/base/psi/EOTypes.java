// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.base.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import university.innopolis.eolang.base.psi.impl.*;

public interface EOTypes {

  IElementType ABSTRACTION = new EOElementType("ABSTRACTION");
  IElementType ANONYMOUS = new EOElementType("ANONYMOUS");
  IElementType APPLICATION = new EOElementType("APPLICATION");
  IElementType ATTRIBUTE = new EOElementType("ATTRIBUTE");
  IElementType ATTRIBUTES = new EOElementType("ATTRIBUTES");
  IElementType BYTES = new EOElementType("BYTES");
  IElementType DATA = new EOElementType("DATA");
  IElementType HAS = new EOElementType("HAS");
  IElementType HEAD = new EOElementType("HEAD");
  IElementType HTAIL = new EOElementType("HTAIL");
  IElementType LABEL = new EOElementType("LABEL");
  IElementType LICENSE = new EOElementType("LICENSE");
  IElementType METAS = new EOElementType("METAS");
  IElementType METHOD = new EOElementType("METHOD");
  IElementType OBJECT = new EOElementType("OBJECT");
  IElementType OBJECTS = new EOElementType("OBJECTS");
  IElementType SUFFIX = new EOElementType("SUFFIX");
  IElementType TAIL = new EOElementType("TAIL");

  IElementType ARROW = new EOTokenType("arrow");
  IElementType AT = new EOTokenType("at");
  IElementType BOOL = new EOTokenType("bool");
  IElementType BYTE = new EOTokenType("byte");
  IElementType CHAR = new EOTokenType("char");
  IElementType COLON = new EOTokenType("colon");
  IElementType COMMENT = new EOTokenType("comment");
  IElementType CONST = new EOTokenType("const");
  IElementType DOT = new EOTokenType("dot");
  IElementType DOTS = new EOTokenType("dots");
  IElementType EOL = new EOTokenType("eol");
  IElementType FLOAT = new EOTokenType("float");
  IElementType HEX = new EOTokenType("hex");
  IElementType INT = new EOTokenType("int");
  IElementType LB = new EOTokenType("LB");
  IElementType LSQ = new EOTokenType("LSQ");
  IElementType METANAME = new EOTokenType("metaname");
  IElementType MINUS = new EOTokenType("minus");
  IElementType NAME = new EOTokenType("name");
  IElementType PARENT = new EOTokenType("parent");
  IElementType PLUS = new EOTokenType("plus");
  IElementType RB = new EOTokenType("RB");
  IElementType REGEX = new EOTokenType("regex");
  IElementType RSQ = new EOTokenType("RSQ");
  IElementType SELF = new EOTokenType("self");
  IElementType SLASH = new EOTokenType("slash");
  IElementType STAR = new EOTokenType("star");
  IElementType STRING = new EOTokenType("string");
  IElementType TAB = new EOTokenType("TAB");
  IElementType UNTAB = new EOTokenType("UNTAB");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACTION) {
        return new EOAbstractionImpl(node);
      }
      else if (type == ANONYMOUS) {
        return new EOAnonymousImpl(node);
      }
      else if (type == APPLICATION) {
        return new EOApplicationImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new EOAttributeImpl(node);
      }
      else if (type == ATTRIBUTES) {
        return new EOAttributesImpl(node);
      }
      else if (type == BYTES) {
        return new EOBytesImpl(node);
      }
      else if (type == DATA) {
        return new EODataImpl(node);
      }
      else if (type == HAS) {
        return new EOHasImpl(node);
      }
      else if (type == HEAD) {
        return new EOHeadImpl(node);
      }
      else if (type == HTAIL) {
        return new EOHtailImpl(node);
      }
      else if (type == LABEL) {
        return new EOLabelImpl(node);
      }
      else if (type == LICENSE) {
        return new EOLicenseImpl(node);
      }
      else if (type == METAS) {
        return new EOMetasImpl(node);
      }
      else if (type == METHOD) {
        return new EOMethodImpl(node);
      }
      else if (type == OBJECT) {
        return new EOObjectImpl(node);
      }
      else if (type == OBJECTS) {
        return new EOObjectsImpl(node);
      }
      else if (type == SUFFIX) {
        return new EOSuffixImpl(node);
      }
      else if (type == TAIL) {
        return new EOTailImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

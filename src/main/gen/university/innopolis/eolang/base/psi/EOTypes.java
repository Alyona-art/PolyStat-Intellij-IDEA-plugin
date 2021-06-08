// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.base.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import university.innopolis.eolang.base.psi.impl.*;

public interface EOTypes {

  IElementType ABSTRACTION = new EOElementType("ABSTRACTION");
  IElementType APPLICATION = new EOElementType("APPLICATION");
  IElementType ATTRIBUTE = new EOElementType("ATTRIBUTE");
  IElementType ATTRIBUTES = new EOElementType("ATTRIBUTES");
  IElementType BYTES = new EOElementType("BYTES");
  IElementType COMMENT = new EOElementType("COMMENT");
  IElementType DATA = new EOElementType("DATA");
  IElementType DETAILS = new EOElementType("DETAILS");
  IElementType HEAD = new EOElementType("HEAD");
  IElementType HTAIL = new EOElementType("HTAIL");
  IElementType LICENSE = new EOElementType("LICENSE");
  IElementType METAS = new EOElementType("METAS");
  IElementType METHOD = new EOElementType("METHOD");
  IElementType OBJECT = new EOElementType("OBJECT");
  IElementType ONE_META = new EOElementType("ONE_META");
  IElementType SUFFIX = new EOElementType("SUFFIX");
  IElementType TAIL = new EOElementType("TAIL");
  IElementType VTAIL = new EOElementType("VTAIL");

  IElementType ANY = new EOTokenType("any");
  IElementType BYTE = new EOTokenType("BYTE");
  IElementType CHAR = new EOTokenType("CHAR");
  IElementType EOL = new EOTokenType("eol");
  IElementType EXP = new EOTokenType("EXP");
  IElementType FLOAT = new EOTokenType("FLOAT");
  IElementType INTEGER = new EOTokenType("INTEGER");
  IElementType NAME = new EOTokenType("NAME");
  IElementType REGEX = new EOTokenType("REGEX");
  IElementType STRING = new EOTokenType("STRING");
  IElementType TAB = new EOTokenType("tab");
  IElementType UNTAB = new EOTokenType("untab");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACTION) {
        return new EOAbstractionImpl(node);
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
      else if (type == COMMENT) {
        return new EOCommentImpl(node);
      }
      else if (type == DATA) {
        return new EODataImpl(node);
      }
      else if (type == DETAILS) {
        return new EODetailsImpl(node);
      }
      else if (type == HEAD) {
        return new EOHeadImpl(node);
      }
      else if (type == HTAIL) {
        return new EOHtailImpl(node);
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
      else if (type == ONE_META) {
        return new EOOneMetaImpl(node);
      }
      else if (type == SUFFIX) {
        return new EOSuffixImpl(node);
      }
      else if (type == TAIL) {
        return new EOTailImpl(node);
      }
      else if (type == VTAIL) {
        return new EOVtailImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}

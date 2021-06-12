// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.base.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import university.innopolis.eolang.base.psi.impl.*;

public interface EOTypes {

  IElementType ABSTRACTION = new EOElementType("ABSTRACTION");
  IElementType ANY = new EOElementType("ANY");
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
  IElementType METAA = new EOElementType("METAA");
  IElementType METAS = new EOElementType("METAS");
  IElementType METHOD = new EOElementType("METHOD");
  IElementType OBJECT = new EOElementType("OBJECT");
  IElementType SUFFIX = new EOElementType("SUFFIX");
  IElementType TAIL = new EOElementType("TAIL");
  IElementType VTAIL = new EOElementType("VTAIL");

  IElementType BYTE = new EOTokenType("byte");
  IElementType CHAR = new EOTokenType("char");
  IElementType DEDENT = new EOTokenType("dedent");
  IElementType EOL = new EOTokenType("eol");
  IElementType EXP = new EOTokenType("exp");
  IElementType FLOAT = new EOTokenType("float");
  IElementType INDENT = new EOTokenType("indent");
  IElementType INTEGER = new EOTokenType("integer");
  IElementType NAME = new EOTokenType("name");
  IElementType REGEX = new EOTokenType("regex");
  IElementType SPACE = new EOTokenType("space");
  IElementType STRING = new EOTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ABSTRACTION) {
        return new EOAbstractionImpl(node);
      }
      else if (type == ANY) {
        return new EOAnyImpl(node);
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
      else if (type == METAA) {
        return new EOMetaaImpl(node);
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

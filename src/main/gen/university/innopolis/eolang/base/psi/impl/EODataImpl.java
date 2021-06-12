// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.base.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static university.innopolis.eolang.base.psi.EOTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import university.innopolis.eolang.base.psi.*;

public class EODataImpl extends ASTWrapperPsiElement implements EOData {

  public EODataImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EOVisitor visitor) {
    visitor.visitData(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EOVisitor) accept((EOVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public EOBytes getBytes() {
    return findChildByClass(EOBytes.class);
  }

}

// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.base.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EOObject extends PsiElement {

  @Nullable
  EOAbstraction getAbstraction();

  @Nullable
  EOAnonymous getAnonymous();

  @Nullable
  EOApplication getApplication();

  @Nullable
  EOHtail getHtail();

  @Nullable
  EOMethod getMethod();

  @Nullable
  EOSuffix getSuffix();

  @NotNull
  List<EOTail> getTailList();

}

// This is a generated file. Not intended for manual editing.
package university.innopolis.eolang.base.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface EOApplication extends PsiElement {

  @Nullable
  EOApplication getApplication();

  @Nullable
  EOHas getHas();

  @Nullable
  EOHead getHead();

  @NotNull
  List<EOHtail> getHtailList();

  @Nullable
  EOMethod getMethod();

  @Nullable
  EOSuffix getSuffix();

}

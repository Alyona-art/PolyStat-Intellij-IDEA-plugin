package university.innopolis.eolang.base;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import university.innopolis.eolang.base.psi.EOTypes;
import org.jetbrains.annotations.NotNull;

public class EOCompletionContributor extends CompletionContributor {

    public EOCompletionContributor() {

        extend(CompletionType.BASIC, PlatformPatterns.psiElement(EOTypes.SUFFIX),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create(" > "));
                    }
                }
        );
        extend(CompletionType.BASIC, PlatformPatterns.psiElement(EOTypes.ATTRIBUTES),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               @NotNull ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("[x...]"));
                    }
                }
        );
    }

}

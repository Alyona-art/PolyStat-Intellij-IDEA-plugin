package university.innopolis.eolang.base

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider

class EOFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, EOLanguage) {
    override fun getFileType(): FileType = EOFileType

    override fun toString(): String = "EO File"
}
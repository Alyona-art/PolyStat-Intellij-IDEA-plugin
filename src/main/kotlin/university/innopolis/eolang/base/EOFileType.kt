package university.innopolis.eolang.base

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object EOFileType : LanguageFileType(EOLanguage) {
    override fun getName(): String = "EO File"
    override fun getDescription(): String = "EOLANG file"
    override fun getDefaultExtension(): String = "eo"

    override fun getIcon(): Icon = EOIcons.FILE
}


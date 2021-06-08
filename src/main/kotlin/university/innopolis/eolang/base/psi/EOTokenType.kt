package university.innopolis.eolang.base.psi

import com.intellij.psi.tree.IElementType
import university.innopolis.eolang.base.EOLanguage

class EOTokenType(debugName: String) : IElementType(debugName, EOLanguage) {
    override fun toString(): String {
        return "psi.EOTokenType." + super.toString()
    }
}
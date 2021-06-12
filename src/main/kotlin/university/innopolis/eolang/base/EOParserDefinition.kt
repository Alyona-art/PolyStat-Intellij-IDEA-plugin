package university.innopolis.eolang.base

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.FlexAdapter
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import university.innopolis.eolang.base.psi.EOTypes
import university.innopolis.eolang.parser.EOParser


class EOParserDefinition : ParserDefinition {
    companion object {
        val WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE)
        val COMMENTS = TokenSet.create(EOTypes.COMMENT)
        val STRINGS = TokenSet.create(EOTypes.STRING)

        val FILE = IFileElementType(EOLanguage)

    }

    override fun createLexer(project: Project?): Lexer = FlexAdapter(EOLexer())
    override fun getWhitespaceTokens(): TokenSet = WHITE_SPACES
    override fun createParser(project: Project?): PsiParser = EOParser()

    override fun getFileNodeType(): IFileElementType = FILE

    override fun getCommentTokens(): TokenSet = COMMENTS
    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements {
        return ParserDefinition.SpaceRequirements.MAY
    }

    override fun getStringLiteralElements(): TokenSet = STRINGS

    override fun createElement(node: ASTNode): PsiElement = EOTypes.Factory.createElement(node)

    override fun createFile(viewProvider: FileViewProvider): PsiFile = EOFile(viewProvider)
}
package kotlinx.kover.examples.html.example2.formatter

import kotlinx.kover.examples.html.example2.formatter.utils.FormatUtils

object SecretFormatter {
    fun format(greeting: String): String {
        return FormatUtils().replaceChars(greeting, '*')
    }
}
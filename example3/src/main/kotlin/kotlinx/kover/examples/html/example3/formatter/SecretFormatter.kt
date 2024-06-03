package kotlinx.kover.examples.html.example3.formatter

import kotlinx.kover.examples.html.example3.formatter.utils.FormatUtils

object SecretFormatter {
    fun format(greeting: String): String {
        return FormatUtils().replaceChars(greeting, '*')
    }
}
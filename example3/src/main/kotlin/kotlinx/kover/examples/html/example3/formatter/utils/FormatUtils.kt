package kotlinx.kover.examples.html.example3.formatter.utils

class FormatUtils {
    fun replaceChars(text: String, replacement: Char): String {
        val count = text.length
        return replacement.toString().repeat(count)
    }
}
package kotlinx.kover.examples.html.example1.formatter.utils

class FormatUtils {
    fun replaceChars(text: String, replacement: Char): String {
        val count = text.length
        return replacement.toString().repeat(count)
    }
}
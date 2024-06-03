package kotlinx.kover.examples.html.example3.formatter

object GreetingFormatter {

    fun format(greeting: String, id: String? = null): String {
        return if (id != null) {
            "Greeting from $id: $greeting"
        } else {
            "Greeting: $greeting"
        }
    }

    fun formatRow(greeting: String): String {
        return greeting
    }
}
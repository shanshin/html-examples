package kotlinx.kover.examples.html.example2

interface AbstractGreeter {
    val id: String?

    fun greet(): String {
        return "..."
    }
}

data class OtherCommonClass(val value: Int)

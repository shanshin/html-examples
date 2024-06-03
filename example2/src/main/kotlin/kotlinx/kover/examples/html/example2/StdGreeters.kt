package kotlinx.kover.examples.html.example2

data class SilentGreeter(override val id: String?): AbstractGreeter

class HelloClass: AbstractGreeter {
    override val id: String = "Simple Hello"

    override fun greet(): String {
        println("LOG: HelloClass#greet")
        return "Hello!"
    }
}
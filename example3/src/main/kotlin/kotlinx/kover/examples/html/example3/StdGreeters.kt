package kotlinx.kover.examples.html.example3

data class SilentGreeter(override val id: String? = null): AbstractGreeter

class HelloClass: AbstractGreeter {
    override val id: String = "Simple Hello"

    override fun greet(): String {
        println("LOG: HelloClass#greet")
        return "Hello!"
    }
}
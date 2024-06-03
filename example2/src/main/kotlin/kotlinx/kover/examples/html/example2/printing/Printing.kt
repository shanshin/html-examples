package kotlinx.kover.examples.html.example2.printing

import kotlinx.kover.examples.html.example2.AbstractGreeter
import kotlinx.kover.examples.html.example2.HelloClass
import kotlinx.kover.examples.html.example2.formatter.GreetingFormatter

class Printing {
    companion object {
        fun classLabel(): String {
            return "Subclass"
        }
    }

    private fun printText(block: () -> String) {
        println("Printer '${classLabel()}'${PrintingUtility().tab}${block()}")
    }

    fun doPrint(greeter: AbstractGreeter) {
        printText {
            GreetingFormatter.format(greeter.greet(), greeter.id)
        }
    }

}

class PrintingUtility {
    val tab: Char get() = '\t'

    fun unused() {
        println("unused function")
    }
}

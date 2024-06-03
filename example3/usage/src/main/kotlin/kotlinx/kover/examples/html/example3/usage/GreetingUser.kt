package kotlinx.kover.examples.html.example3.usage

import kotlinx.kover.examples.html.example3.HelloClass
import kotlinx.kover.examples.html.example3.SilentGreeter
import kotlinx.kover.examples.html.example3.formatter.SecretFormatter
import kotlinx.kover.examples.html.example3.printing.Printing

class GreetingUser {
    fun printHello() {
        Printing().doPrint(HelloClass())
    }

    fun printSilent() {
        Printing().doPrint(SilentGreeter())
    }

    fun secretHello(): String {
        return SecretFormatter.format(HelloClass().greet())
    }

}
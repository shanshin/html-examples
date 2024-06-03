package kotlinx.kover.examples.html.example3

import kotlinx.kover.examples.html.example3.printing.Printing
import kotlinx.kover.examples.html.example3.HelloClass
import kotlin.test.Test

class Tests {

    @Test
    fun test() {
        println(Printing().doPrint(HelloClass()))
    }
}
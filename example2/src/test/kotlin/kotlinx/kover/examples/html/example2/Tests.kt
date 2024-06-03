package kotlinx.kover.examples.html.example2

import kotlinx.kover.examples.html.example2.printing.Printing
import kotlinx.kover.examples.html.example2.HelloClass
import kotlin.test.Test

class Tests {

    @Test
    fun test() {
        println(Printing().doPrint(HelloClass()))
    }
}
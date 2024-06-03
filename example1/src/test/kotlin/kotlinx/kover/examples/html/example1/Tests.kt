package kotlinx.kover.examples.html.example1

import kotlinx.kover.examples.html.example1.printing.Printing
import kotlin.test.Test

class Tests {

    @Test
    fun test() {
        println(Printing().doPrint(HelloClass()))
    }
}
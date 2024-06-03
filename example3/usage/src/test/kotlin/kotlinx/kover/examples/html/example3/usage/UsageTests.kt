package kotlinx.kover.examples.html.example3.usage

import kotlin.test.Test

class UsageTests {
    @Test
    fun testSilent() {
        GreetingUser().printSilent()
    }

    @Test
    fun testSecret() {
        println(GreetingUser().secretHello())
    }
}
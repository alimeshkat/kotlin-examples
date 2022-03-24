package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FunctionsAndLambdas {

    @Test
    fun `functions and lambdas`() {
        assertEquals("Lambda done", doSomethingWithSomething("Lambda", doSomethingLambda)())
        assertEquals("Function reference done", doSomethingWithSomething("Function reference", ::doSomething)())
    }

}

val doSomethingLambda: (String) -> String = { "$it done" }
fun doSomething(something: String): String {
    return "$something done"
}

fun doSomethingWithSomething(something: String, somethingFunction: (String) -> String): () -> String {
    return TODO("print result of somethingFunction and return a new function")
}

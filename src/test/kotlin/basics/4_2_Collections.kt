package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

val r1 = Response(listOf(Data("Apple")), Status.PROCESSED)
val r2 = Response(listOf(Data("Tesla")), Status.NOT_PROCESSED)
val r3 = Response(listOf(Data("Things")), Status.PROCESSED)
val r4 = Response(listOf(Data("Stuff")), Status.NOT_PROCESSED)

class CollectionsOperations {

    @Test
    fun `collection operations`() {

        val expected = mapOf<String, Int>("Apple" to 0, "Things" to 1)
        assertEquals(expected, filterFlatMapMapAssociate())
    }
}

fun filterFlatMapMapAssociate(): Map<String, Int> {

    listOf<Response>(r1, r2, r3, r4)
    TODO()
}

// filter map -> flatmap -> associate

data class Response(val data: List<Data>, val status: Status)

// map value

data class Data(val value: String)

// filter PROCESSED
enum class Status() {
    PROCESSED, NOT_PROCESSED
}

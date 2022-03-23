package basics

import org.junit.jupiter.api.Test

val mutableList: MutableList<String> = mutableListOf("A", "B", "C")
val list: List<String> = listOf("A", "B", "C")

class Collections {

    @Test
    fun `mutable vs immutable`() {
//        mutableList.add("D")
//        list.add("D") // Wont compile!
    }
}


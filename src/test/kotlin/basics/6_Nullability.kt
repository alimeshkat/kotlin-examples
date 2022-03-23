package basics

import kotlin.test.Test

class Nullability {

    @Test
    fun `no more null pointers`() {

        val data = Dto("Some data")
//        data.metadata.value // The compiler enforces the null check!

    }
}

data class Dto(val payload: String, var metadata: MetaData? = null)

data class MetaData(val value: String)


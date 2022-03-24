package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ControlFlow {

    @Test
    fun `Control flow the easy way`() {
        assertTrue(yesOrNo("Am I getting it?"))
        assertEquals("t-shirt", chooseClothes(Weather.WARM))
    }
}

//if else

fun yesOrNo(question: String): Boolean {
    TODO("return the if else statement")
}


//when WARM -> "t-shirt"
//when COLD -> "Jacket"
//when RAINY -> "Rain coat"

fun chooseClothes(temp: Weather) = when (temp) {
    TODO("implement when statement") -> ""
}

sealed class Weather(val value: String) {
    object WARM : Weather("20 degree Celsius")
    object COLD : Weather("10 degree Celsius")
    object RAINY : Weather("15 degree Celsius")
}

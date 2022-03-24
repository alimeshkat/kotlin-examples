import org.junit.jupiter.api.Test
import kotlin.test.assertIs

class ObjectAndClasses {

    @Test
    fun `Robin is an animal`() {
        assertIs<Animal>(Robin)
//        assertEquals("Robin", Robin.name)
//        assertEquals(50, Robin.speed())

    }

}

interface Animal {
    fun speed(): Int
}

// Bird implements Animal
open class Bird(val name: String)

// Robin extends Bird
object Robin

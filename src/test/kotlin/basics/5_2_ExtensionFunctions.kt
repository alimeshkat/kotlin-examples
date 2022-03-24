package basics

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class ExtensionFunctions {

    @Test
    fun `Extend all the things!`() {
        val achmed = Person("Achmed", 29)
        val angel = Person("Angel", 29)
        val frank = Person("Frank", 88)
        val siebert = Person("Siebert", 70)

        val actual = getOldestPerson(Persons(listOf(achmed, angel, frank, siebert)))

        assertEquals(frank.age, actual)
    }

}

//Turn in to an extension function
fun getOldestPerson(persons: Persons): Int = persons.persons.maxOf { it.age }

data class Persons(val persons: List<Person>)
data class Person(val name: String, val age: Int)

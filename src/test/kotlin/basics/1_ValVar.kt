package basics

import kotlin.test.Test

const val constant = "ReadOnly"
var variable: String = "Re-assignable"

class ValVar {


    @Test
    fun `val vs var`() {
//        constant = "new value" //Wont compile
//        variable = "new value"
    }
}

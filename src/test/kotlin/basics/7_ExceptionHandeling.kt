package basics

import org.junit.jupiter.api.Test
import java.net.http.HttpConnectTimeoutException

class ExceptionHandeling {

    @Test
    fun `Exceptions shouldn't be used in controle flow`() {
//        assertNull(someHttpClient().getOrNull())
    }
}

// catch exception but return a Result

fun someHttpClient(): ApiResponse =
    try {
        someHttpCall("https://www.youtube.com/watch?v=xvFZjo5PgG0")
    } catch (e: HttpConnectTimeoutException) {
        throw ApiClientExceptionWrapper(e.message, e)
    }


fun someHttpCall(s: String): ApiResponse {
    throw HttpConnectTimeoutException("Oops! We couldn't reach the api :(")
}

data class ApiResponse(val payload: String, val status: String)

class ApiClientExceptionWrapper(message: String?, cause: Throwable?) : Exception(message, cause)

package ca.cpp

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.Test
import kotlin.test.assertEquals

class OwnerRequestTest {

    private val jackson = ObjectMapper()
        .findAndRegisterModules()

    @Test
    fun testOwnerDeserialization() {
        val value: OwnerRequest = jackson.readValue(
            """
					{
						"org": "Wayne Industries"
					}
				""".trimIndent(),
            OwnerRequest::class.java
        )
        assertEquals("Wayne Industries", value.org)
        assertEquals("OwnerRequest(org=Wayne Industries, isOrg=true)", value.toString())
    }


}

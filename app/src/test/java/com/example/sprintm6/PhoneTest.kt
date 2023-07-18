package com.example.sprintm6
import com.example.sprintm6.model.Phone
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PhoneTest {

    private lateinit var phone: Phone

    @Before
    fun setUp() {
        // Configurar el entorno de prueba
        val id = 1
        val phoneName = "Example Phone"
        val phonePrice = 999
        val phoneImage = "example_image.jpg"
        val phoneDescription = "This is an example phone"
        val phoneLastPrice = 899
        val phoneCredit = true

        phone = Phone(
            id = id,
            phoneName = phoneName,
            phonePrice = phonePrice,
            phoneImage = phoneImage,
            phoneDescription = phoneDescription,
            phoneLastPrice = phoneLastPrice,
            phoneCredit = phoneCredit
        )
    }

    @After
    fun tearDown() {
        // Limpiar el entorno de prueba si es necesario
    }

    @Test
    fun testPhoneConstructor() {
        // Assert
        assertEquals(1, phone.id)
        assertEquals("Example Phone", phone.phoneName)
        assertEquals(999, phone.phonePrice)
        assertEquals("example_image.jpg", phone.phoneImage)
        assertEquals("This is an example phone", phone.phoneDescription)
        assertEquals(899, phone.phoneLastPrice)
        assertTrue(phone.phoneCredit)
    }

    // Otros tests unitarios para métodos adicionales de la clase Phone

}
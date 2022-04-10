package com.example.lambda.test

import com.example.lambda.api.HandlerInput
import com.example.lambda.api.HandlerOutput
import com.example.lambda.app.App
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AppTest {

    @Test
    fun `test app phrases`() {
        val classTest = App()
        val input = HandlerInput()
        input.message = "Bom dia"
        val expected = HandlerOutput("Bom dia", "Ohayô gozaimasu")
        val output = classTest.handleRequest(input, null)
        assertEquals(expected, output)
    }

    @Test
    fun `test app japanese phrases2`() {
        val classTest = App()
        val input = HandlerInput()
        input.message = "Bem vindo de volta"
        val expected = HandlerOutput(input.message, "Okaerinassai")
        val output = classTest.handleRequest(input, null)
        assertEquals(expected, output)

    }
}
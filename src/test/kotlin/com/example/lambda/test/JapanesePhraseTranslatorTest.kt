package com.example.lambda.test

import com.example.lambda.api.DefaultJapaneseTranslator
import com.example.lambda.api.JapanesePhraseTranslator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JapanesePhraseTranslatorTest {

    @Test
    fun `test japanese phrases translator`() {
        val classTest: JapanesePhraseTranslator = DefaultJapaneseTranslator()
        assertEquals("Konnichiwa, Kadoya san", classTest.translate("Boa tarde, Kadoya san"))
        assertEquals("Okaerinassai", classTest.translate("Bem vindo de volta"))
    }
}

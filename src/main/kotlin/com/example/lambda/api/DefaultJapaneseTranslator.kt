package com.example.lambda.api

import java.time.LocalTime

class DefaultJapaneseTranslator : JapanesePhraseTranslator {

    private val replacements = mapOf(
        "Bom dia" to "Ohayô gozaimasu",
        "bom dia" to "Ohayô gozaimasu",
        "Boa tarde" to "Konnichiwa",
        "Boa noite" to checkHour(),
        "boa noite" to checkHour(),
        "Bem vindo de volta" to "Okaerinassai",
        "bem vindo de volta" to "Okaerinassai",
        "Feliz ano novo" to "Akemashite Omedetou Gozaimasu",
        "feliz ano novo" to "Akemashite Omedetou Gozaimasu",
        "Um feliz ano novo" to "Akemashite Omedetou Gozaimasu",
        "um feliz ano novo" to "Akemashite Omedetou Gozaimasu"
    )

    override fun translate(message: String): String {
        var result = message
        replacements.forEach{ (k, v) -> result = result.replace(k, v)  }
        return result
    }

    private fun checkHour(): String {
        return if (LocalTime.now() > LocalTime.of(22, 59,59)) "Oyasuminasai" else "Konbanwa"
    }
}
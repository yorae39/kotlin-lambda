package com.example.lambda.api

interface JapanesePhraseTranslator {
    fun translate(message: String): String
}
package com.example.lambda.app

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.example.lambda.api.DefaultJapaneseTranslator
import com.example.lambda.api.HandlerInput
import com.example.lambda.api.HandlerOutput
import com.example.lambda.api.JapanesePhraseTranslator

class App : RequestHandler<HandlerInput, HandlerOutput> {

    private val translator: JapanesePhraseTranslator = DefaultJapaneseTranslator()

    override fun handleRequest(input: HandlerInput?, context: Context?): HandlerOutput {
        input?.let {
            return HandlerOutput(it.message, translator.translate(it.message))
        }
        return HandlerOutput("", "")
    }
}
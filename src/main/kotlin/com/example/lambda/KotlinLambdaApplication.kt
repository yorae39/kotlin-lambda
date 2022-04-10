package com.example.lambda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinLambdaApplication

fun main(args: Array<String>) {
    runApplication<KotlinLambdaApplication>(*args)
}

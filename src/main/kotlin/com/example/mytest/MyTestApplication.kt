package com.example.mytest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyTestApplication

fun main(args: Array<String>) {
	runApplication<MyTestApplication>(*args)
}

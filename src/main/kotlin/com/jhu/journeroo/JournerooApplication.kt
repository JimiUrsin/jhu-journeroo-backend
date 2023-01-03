package com.jhu.journeroo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JournerooApplication

fun main(args: Array<String>) {
	runApplication<JournerooApplication>(*args)
}

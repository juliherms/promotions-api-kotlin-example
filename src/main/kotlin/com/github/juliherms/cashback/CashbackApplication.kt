package com.github.juliherms.cashback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CashbackApplication

fun main(args: Array<String>) {
	runApplication<CashbackApplication>(*args)
}

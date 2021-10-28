package ru.sberned.domclick.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinHibernateApplication

fun main(args: Array<String>) {
	runApplication<SpringKotlinHibernateApplication>(*args)
}

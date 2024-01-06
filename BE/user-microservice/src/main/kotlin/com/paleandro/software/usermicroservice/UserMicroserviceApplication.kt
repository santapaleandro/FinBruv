package com.paleandro.software.usermicroservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class UserMicroserviceApplication

fun main(args: Array<String>) {
    runApplication<UserMicroserviceApplication>(*args)
}

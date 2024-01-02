package com.paleandro.software.usermicroservice.service

import com.paleandro.software.usermicroservice.model.User
import reactor.core.publisher.Mono
import java.util.UUID

interface UserService {
    fun getById(id: UUID): Mono<User>
    fun greet(id: UUID)
}
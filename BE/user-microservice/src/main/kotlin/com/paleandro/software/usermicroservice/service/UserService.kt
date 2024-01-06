package com.paleandro.software.usermicroservice.service

import com.paleandro.software.usermicroservice.dto.UserCreateDTO
import com.paleandro.software.usermicroservice.dto.UserDTO
import com.paleandro.software.usermicroservice.dto.UserUpdateDTO
import com.paleandro.software.usermicroservice.model.User
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

interface UserService {
    fun getById(id: UUID): Mono<User>
    fun create(user: UserCreateDTO): Mono<User>
    fun update(user: UserUpdateDTO): Mono<User>
    fun getAll(): Flux<UserDTO>
    fun delete(id: UUID): Mono<Unit>
}
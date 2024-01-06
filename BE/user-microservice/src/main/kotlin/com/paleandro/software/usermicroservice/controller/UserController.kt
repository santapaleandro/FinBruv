package com.paleandro.software.usermicroservice.controller

import com.paleandro.software.usermicroservice.dto.UserCreateDTO
import com.paleandro.software.usermicroservice.dto.UserDTO
import com.paleandro.software.usermicroservice.model.User
import com.paleandro.software.usermicroservice.service.UserService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

@RestController
class UserController(private val userService: UserService) {

    @GetMapping
    fun getById(@RequestParam id: UUID): Mono<User> {
        return userService.getById(id)
            .switchIfEmpty(Mono.error(NoSuchElementException("User not found with id: $id")))
    }

    @GetMapping("/greet")
    fun greet(@RequestParam id: UUID): Mono<String> {
        return userService.getById(id)
            .map(User::name)
            .switchIfEmpty(Mono.error(NoSuchElementException("User not found with id: $id")))
    }

    @GetMapping("/all")
    fun getAll(): Flux<UserDTO> {
        return userService.getAll()
    }



    @PostMapping("/create")
    fun create(@RequestBody user: UserCreateDTO): Mono<User> {
        return userService.create(user)
    }
}
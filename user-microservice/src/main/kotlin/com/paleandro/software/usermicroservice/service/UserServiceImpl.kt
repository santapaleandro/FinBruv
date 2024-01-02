package com.paleandro.software.usermicroservice.service

import com.paleandro.software.usermicroservice.model.User
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import java.util.*

@Service
class UserServiceImpl: UserService {
    override fun getById(id: UUID): Mono<User> {
        TODO("Not yet implemented")
    }

    override fun greet(id: UUID) {
        TODO("Not yet implemented")
    }
}
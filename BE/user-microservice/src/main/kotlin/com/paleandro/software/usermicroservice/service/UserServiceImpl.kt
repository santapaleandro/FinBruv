package com.paleandro.software.usermicroservice.service

import com.paleandro.software.usermicroservice.dto.UserCreateDTO
import com.paleandro.software.usermicroservice.dto.UserDTO
import com.paleandro.software.usermicroservice.dto.UserUpdateDTO
import com.paleandro.software.usermicroservice.model.User
import com.paleandro.software.usermicroservice.repository.UserRepository
import com.paleandro.software.usermicroservice.mapper.user.UserMapper
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
    private val userMapper: UserMapper): UserService {

    override fun getById(id: UUID): Mono<User> {
        return userRepository.findById(id)
    }

    override fun create(user: UserCreateDTO): Mono<User> {
        return userRepository.save(userMapper.createToUser(user))
    }

    override fun update(user: UserUpdateDTO): Mono<User> {
        return userRepository.save(userMapper.updateToUser(user))
    }

    override fun getAll(): Flux<UserDTO> {
        return userRepository.findAll().map { user -> userMapper.toUserDto(user) }
    }

    override fun delete(id: UUID): Mono<Unit> {
        return userRepository.deleteById(id).then(Mono.just(Unit))
    }
}
package com.paleandro.software.usermicroservice.mapper.user

import com.paleandro.software.usermicroservice.dto.UserCreateDTO
import com.paleandro.software.usermicroservice.dto.UserDTO
import com.paleandro.software.usermicroservice.dto.UserUpdateDTO
import com.paleandro.software.usermicroservice.model.User
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface UserMapper {
    fun toDto(user: User): UserDTO
    fun updateToUser(user: UserUpdateDTO): User
    fun createToUser(userCreateDTO: UserCreateDTO): User
    fun toUserDto(user: User): UserDTO
}
package com.paleandro.software.usermicroservice.dto

import com.google.type.PhoneNumber

data class UserDTO(
    val name: String,
    val email: String,
    val phone: PhoneNumber
)
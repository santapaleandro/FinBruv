package com.paleandro.software.usermicroservice.dto

import com.google.type.PhoneNumber
import java.util.UUID

data class UserUpdateDTO(
    val id: UUID,
    val name: String,
    val email: String,
    val phone: PhoneNumber
)

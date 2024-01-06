package com.paleandro.software.usermicroservice.model

import com.google.type.PhoneNumber
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.UUID

@Table("users")
data class User(
    @Id
    val id: UUID,
    val name: String,
    val phone: PhoneNumber
)
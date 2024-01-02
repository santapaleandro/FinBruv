package com.paleandro.software.usermicroservice.model

import com.google.type.PhoneNumberOrBuilder
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.annotation.Id
import java.util.UUID

@EntityScan
data class User(
    @Id
    private var id: UUID,
    val name: String,
    private val phoneNumberOrBuilder: PhoneNumberOrBuilder
)
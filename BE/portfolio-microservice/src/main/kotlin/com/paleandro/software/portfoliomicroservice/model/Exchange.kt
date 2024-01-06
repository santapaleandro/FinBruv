package com.paleandro.software.portfoliomicroservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("exchanges")
data class Exchange(
    @Id val id: Long = 0,
    val name: String,
    val location: String
)

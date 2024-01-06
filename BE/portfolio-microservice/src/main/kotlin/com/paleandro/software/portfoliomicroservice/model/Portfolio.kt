package com.paleandro.software.portfoliomicroservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("portfolios")
data class Portfolio(
    @Id val id: UUID = UUID.randomUUID(),
    val name: String,
    val ownerId: UUID
)

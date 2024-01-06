package com.paleandro.software.portfoliomicroservice.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate
import java.util.*

@Table("performances")
data class Performance(
    @Id val id: Long = 0,
    val portfolioId: UUID, // Reference to the Portfolio
    val date: LocalDate,
    val value: Double  // Performance value or metric
)

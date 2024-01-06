package com.paleandro.software.portfoliomicroservice.model

import com.paleandro.software.portfoliomicroservice.enums.Exchange
import com.paleandro.software.portfoliomicroservice.enums.InstrumentType
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("instruments")
data class Instrument(
    @Id
    val id: Long,
    val type: InstrumentType,
    val exchange: Exchange,
    val ticker: String,
    val quantity: Double
)

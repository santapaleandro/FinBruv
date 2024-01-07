package com.paleandro.software.portfoliomicroservice.repository

import com.paleandro.software.portfoliomicroservice.model.Portfolio
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import java.util.*

@Repository
interface PortfolioRepository : R2dbcRepository<Portfolio, Long> {
    fun getPortfoliosOfUser(userId: UUID): Flux<Portfolio>
}
package com.paleandro.software.portfoliomicroservice.service

import com.paleandro.software.portfoliomicroservice.model.Portfolio
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.UUID

interface PortfolioService {
    fun getPortfolioByUserId(userUUID: UUID): (Flux<Portfolio>)
    fun getPortfolioById(id: Long): Mono<Portfolio>
}

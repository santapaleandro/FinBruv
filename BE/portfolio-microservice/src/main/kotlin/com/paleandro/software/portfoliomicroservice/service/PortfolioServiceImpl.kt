package com.paleandro.software.portfoliomicroservice.service

import com.paleandro.software.portfoliomicroservice.model.Portfolio
import com.paleandro.software.portfoliomicroservice.repository.PortfolioRepository
import com.paleandro.software.grpc.PortfolioService.PortfolioServiceGrpc
import com.paleandro.software.grpc.PortfolioService.PortfolioServiceOuterClass.*
import io.grpc.stub.StreamObserver
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@Service
class PortfolioServiceImpl(private val portfolioRepository: PortfolioRepository) : PortfolioServiceGrpc.PortfolioServiceImplBase(), PortfolioService {

//    override fun getPortfoliosOfUserGRPC(userIdReq: UserIdReq, responseObserver: StreamObserver<UserPortfoliosResponse>) {
//        val userId = userIdReq.userId
//        val portfoliosFlux: Flux<Portfolio> = getPortfolioByUserId(UUID.fromString(userId))
//    }

    override fun getPortfolioByUserId(userUUID: UUID): Flux<Portfolio> {
        return portfolioRepository.getPortfoliosOfUser(userUUID)
    }

    override fun getPortfolioById(id: Long): Mono<Portfolio> {
        return portfolioRepository.findById(id)
    }
}
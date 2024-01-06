//package com.paleandro.software.usermicroservice.service
//
//import io.grpc.ManagedChannelBuilder
//import java.util.UUID
//
//class PortfolioManagementClientService {
//    private val channel = ManagedChannelBuilder.forAddress("portfolio-management-microservice", 8082).usePlaintext().build()
//    private val stub = PortfolioManagementServiceGrpc.newBlockingStub(channel)
//
//    fun getPortfolio(userId: UUID): PortfolioManagementResponse {
//        val request = PortfolioManagementRequest.newBuilder().setUserId(userId).build()
//        return stub.getPortfolio(request)
//    }
//}
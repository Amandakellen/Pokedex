package com.example.domain.usecase

interface UseCase<in Input, out Output> {
    suspend operator fun invoke(params: Input): Output
}
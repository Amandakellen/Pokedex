package com.example.coroutines.usecase

interface UseCase<in Input, out Output> {
    suspend operator fun invoke(params: Input): Output
}


object None
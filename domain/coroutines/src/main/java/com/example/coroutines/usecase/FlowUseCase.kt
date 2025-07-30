package com.example.coroutines.usecase

import kotlinx.coroutines.flow.Flow

interface FlowUseCase<in Input, out Output> {
    operator fun invoke(input: Input): Flow<Output>
}

object None


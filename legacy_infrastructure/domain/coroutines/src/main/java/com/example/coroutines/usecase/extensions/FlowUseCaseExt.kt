package com.example.coroutines.usecase.extensions

import com.example.coroutines.usecase.FlowUseCase
import kotlinx.coroutines.flow.Flow

fun <T> FlowUseCase<Unit, T>.invoke(): Flow<T> = invoke(Unit)

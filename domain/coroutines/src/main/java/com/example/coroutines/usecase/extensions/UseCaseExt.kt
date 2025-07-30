package com.example.coroutines.usecase.extensions

import com.example.coroutines.usecase.None
import com.example.coroutines.usecase.UseCase

suspend fun <T> UseCase<None, T>.invoke(): T = invoke(None)

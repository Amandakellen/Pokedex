package com.example.create_account.domain.repository

interface AuthRepository {
    suspend fun registerWithEmail(email: String, password: String): Result<Unit>
}
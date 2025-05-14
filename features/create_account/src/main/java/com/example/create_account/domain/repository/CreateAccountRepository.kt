package com.example.create_account.domain.repository

interface CreateAccountRepository {
    suspend fun registerWithEmail(email: String, password: String): Result<Unit>
}
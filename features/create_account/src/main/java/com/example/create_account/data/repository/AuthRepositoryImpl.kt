package com.example.create_account.data.repository

import com.example.create_account.data.datasource.remote.FirebaseAuthDataSource
import com.example.create_account.domain.repository.AuthRepository

class AuthRepositoryImpl(
    private val authDataSource: FirebaseAuthDataSource
): AuthRepository {

    override suspend fun registerWithEmail(email: String, password: String): Result<Unit> {
        return authDataSource.register(email, password)
    }
}
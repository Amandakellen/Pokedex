package com.example.create_account.data.repository

import com.example.create_account.data.datasource.remote.FirebaseAuthDataSource

class AuthRepository(
    private val authDataSource: FirebaseAuthDataSource
) {

    suspend fun registerWithEmail(email: String, password: String): Result<Unit> {
        return authDataSource.register(email, password)
    }
}
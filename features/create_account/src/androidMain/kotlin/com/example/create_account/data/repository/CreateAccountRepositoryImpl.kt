package com.example.create_account.data.repository

import com.example.create_account.data.datasource.remote.FirebaseAuthDataSource
import com.example.create_account.domain.repository.CreateAccountRepository

class CreateAccountRepositoryImpl(
    private val authDataSource: FirebaseAuthDataSource
): CreateAccountRepository {

    override suspend fun registerWithEmail(email: String, password: String): Result<Unit> {
        return authDataSource.register(email, password)
    }

    override suspend fun setUserName(name: String): Result<Unit> {
        return authDataSource.setUserName(name)
    }
}
package com.example.create_account.domain.repository

import com.google.firebase.auth.FirebaseAuth

interface CreateAccountRepository {
    suspend fun registerWithEmail(email: String, password: String): Result<Unit>
    suspend fun setUserName(name: String): Result<Unit>
}
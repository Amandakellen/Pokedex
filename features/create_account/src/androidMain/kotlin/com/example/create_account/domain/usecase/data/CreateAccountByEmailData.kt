package com.example.create_account.domain.data

data class CreateAccountByEmailData(
    val email: String,
    val password: String,
    val name: String
)
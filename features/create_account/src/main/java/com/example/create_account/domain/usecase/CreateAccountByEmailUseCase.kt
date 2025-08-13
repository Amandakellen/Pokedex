package com.example.create_account.domain.usecase

import com.example.coroutines.usecase.UseCase
import com.example.create_account.domain.data.CreateAccountByEmailData
import com.example.create_account.domain.repository.CreateAccountRepository
import android.util.Patterns
import com.example.create_account.domain.validation.model.RegistrationValidationException.FailedToCreateAccount
import com.example.create_account.domain.validation.model.RegistrationValidationException.InvalidEmail
import com.example.create_account.domain.validation.model.RegistrationValidationException.NameIsBlank
import com.example.create_account.domain.validation.model.RegistrationValidationException.PasswordTooShort
import com.google.firebase.auth.userProfileChangeRequest
import kotlinx.coroutines.tasks.await

private const val MIN_PASSWORD_LENGTH = 8

class CreateAccountByEmailUseCase(val repository: CreateAccountRepository) :
    UseCase<CreateAccountByEmailData, Unit> {
    override suspend fun invoke(params: CreateAccountByEmailData): Unit {
        if (!isEmailValid(params.email)) {
            throw InvalidEmail
        }
        if (!isPasswordValid(params.password)) {
            throw PasswordTooShort
        }

        if (!isNameValid(params.name)) {
            throw NameIsBlank
        }

        try {
            repository.registerWithEmail(params.email, params.password)
            repository.setUserName(params.name)
        } catch (e: Exception) {
            throw FailedToCreateAccount
        }

    }

    private fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun isPasswordValid(password: String): Boolean {
        return password.length >= MIN_PASSWORD_LENGTH
    }

    private fun isNameValid(name: String): Boolean {
        return name.isNotBlank()
    }
}
package com.example.create_account.domain.validation.model

sealed class RegistrationValidationException(message: String) : Exception(message) {
    object InvalidEmail : RegistrationValidationException("E-mail inválido.")
    object PasswordTooShort : RegistrationValidationException("Senha muito curta.")
    object NameIsBlank : RegistrationValidationException("Nome não pode estar em branco.")
    object FailedToCreateAccount : RegistrationValidationException("Falha ao criar conta. Tente novamente mais tarde.")
}

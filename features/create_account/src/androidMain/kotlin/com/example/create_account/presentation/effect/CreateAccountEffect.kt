package com.example.create_account.presentation.effect

sealed class CreateAccountEffect {
    data object GoToRegisterPassword : CreateAccountEffect()
    data object GoToRegisterName : CreateAccountEffect()
    data object BackPress : CreateAccountEffect()
    data object GoToRegisterSuccess : CreateAccountEffect()

}
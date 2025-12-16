package com.example.create_account.presentation.state

sealed class CreateAccountState {
    data object Resume: CreateAccountState()
    data object Error : CreateAccountState()
    data object Loading : CreateAccountState()
    data object Success : CreateAccountState()
}

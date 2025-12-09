package com.example.create_account.presentation.action

interface CreateAccountAction {
    fun sendAction(action: Action)
    sealed class Action {
        data object ClickBackPress : Action()
        data class ClickCreateAccountButton(
            val step: Int,
            val email: String,
            val name: String,
            val password: String
        ) : Action()
    }
}
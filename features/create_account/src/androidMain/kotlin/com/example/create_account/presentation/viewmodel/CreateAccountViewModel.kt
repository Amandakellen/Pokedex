package com.example.create_account.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.create_account.domain.data.CreateAccountByEmailData
import com.example.create_account.domain.usecase.CreateAccountByEmailUseCase
import com.example.create_account.presentation.action.CreateAccountAction
import com.example.create_account.presentation.effect.CreateAccountEffect
import com.example.create_account.presentation.state.CreateAccountState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class CreateAccountViewModel(private val createAccountByEmailUseCase: CreateAccountByEmailUseCase) :
    ViewModel(),
    CreateAccountAction {

    private val _state = MutableStateFlow<CreateAccountState>(CreateAccountState.Resume)
    val state = _state

    private val _effect = MutableStateFlow<CreateAccountEffect?>(null)
    val effect = _effect

    override fun sendAction(action: CreateAccountAction.Action) {
        when (action) {
            is CreateAccountAction.Action.ClickBackPress -> {
                _effect.value = CreateAccountEffect.BackPress
            }

            is CreateAccountAction.Action.ClickCreateAccountButton -> {
                checkCreateAccountStep(action.step, action.email, action.name, action.password)
            }
        }
    }

    fun checkCreateAccountStep(step: Int, email: String, name: String, password: String) {
        when (step) {
            2 -> {
                _effect.value = CreateAccountEffect.GoToRegisterPassword
            }

            3 -> {
                _effect.value = CreateAccountEffect.GoToRegisterName
            }

            4 -> {
                _state.value = CreateAccountState.Loading
                createAccountByEmail(email = email, name = name, password = password)
            }
        }
    }

    fun createAccountByEmail(email: String, password: String, name: String) {
        viewModelScope.launch {
            try {
                createAccountByEmailUseCase.invoke(
                    CreateAccountByEmailData(
                        email = email,
                        password = password,
                        name = name
                    )
                )
                _state.value = CreateAccountState.Success
                _effect.value = CreateAccountEffect.GoToRegisterSuccess
            } catch (e: Exception) {
                _state.value = CreateAccountState.Error
                return@launch
            }
        }
    }
}
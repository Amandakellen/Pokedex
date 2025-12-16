package com.example.create_account.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.create_account.domain.repository.CreateAccountRepository
import com.example.create_account.presentation.action.CreateAccountAction
import com.example.create_account.presentation.effect.CreateAccountEffect
import com.example.create_account.presentation.effect.CreateAccountEffect.*
import com.example.create_account.presentation.state.CreateAccountState
import com.example.create_account.presentation.state.CreateAccountState.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class CreateAccountViewModel(private val repository: CreateAccountRepository) : ViewModel(),
    CreateAccountAction {

    private val _state = MutableStateFlow<CreateAccountState>(Resume)
    val state = _state

    private val _effect = MutableStateFlow<CreateAccountEffect?>(null)
    val effect = _effect

    override fun sendAction(action: CreateAccountAction.Action) {
        when (action) {
            is CreateAccountAction.Action.ClickBackPress -> {
                _effect.value = BackPress
            }

            is CreateAccountAction.Action.ClickCreateAccountButton -> {
                checkCreateAccountStep(action.step, action.email, action.name, action.password)
            }
        }
    }

    fun checkCreateAccountStep(step: Int, email: String, name: String, password: String) {
        when (step) {
            2 -> {
                _effect.value = GoToRegisterPassword
            }

            3 -> {
                _effect.value = GoToRegisterName
            }

            4 -> {
                _state.value = Loading
                register(email = email, name =  name, password = password)
            }
        }
    }


    fun register(email: String, password: String, name: String) {
        viewModelScope.launch {
            val result = repository.registerWithEmail(email, password)
            if (!result.isSuccess) {
                _state.value = Error
            } else{
                _state.value = Success
                _effect.value = GoToRegisterSuccess
            }
        }
    }
}
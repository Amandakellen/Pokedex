package com.example.onboarding.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.features.onboarding.presentation.state.OnboardingState
import com.example.onboarding.presentation.action.OnboardingAction
import com.example.onboarding.presentation.action.OnboardingAction.*
import com.example.onboarding.presentation.action.OnboardingAction.Action.*
import com.example.onboarding.presentation.effect.OnboardingEffect
import kotlinx.coroutines.flow.MutableStateFlow

class OnboardingViewModel: ViewModel(), OnboardingAction {
    private val _state = MutableStateFlow<OnboardingState>(OnboardingState.Loading)
    val state = _state

    private val _effect = MutableStateFlow<OnboardingEffect?>(null)
    val effect = _effect

    override fun sendAction(action: Action) {
        when (action){
             GoToNextScreen -> {
                 _effect.value = OnboardingEffect.GoToFirstScreen
                 _state.value = OnboardingState.Resume
             }
             ClickContinueButton, ClickStartButton -> {
                 _effect.value = OnboardingEffect.NextScreen
             }
             ClickCreateAccountButton -> {
                 _effect.value = OnboardingEffect.GoToCreateAccountScreen
             }
             ClickLoginButton -> {
                 _effect.value = OnboardingEffect.GoToLoginScreen
             }
        }
    }
}
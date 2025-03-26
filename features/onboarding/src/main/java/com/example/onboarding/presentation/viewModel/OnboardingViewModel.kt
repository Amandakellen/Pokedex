package com.example.onboarding.presentation.viewModel

import androidx.lifecycle.ViewModel
import com.example.features.onboarding.presentation.state.OnboardingState
import com.example.features.onboarding.presentation.state.OnboardingState.*
import com.example.onboarding.presentation.action.OnboardingAction
import com.example.onboarding.presentation.action.OnboardingAction.*
import com.example.onboarding.presentation.action.OnboardingAction.Action.*
import com.example.onboarding.presentation.effect.OnboardingEffect
import com.example.onboarding.presentation.view.informative.FIRST_STEP
import com.example.onboarding.presentation.view.informative.PAGER_SIZE
import kotlinx.coroutines.flow.MutableStateFlow

class OnboardingViewModel : ViewModel(), OnboardingAction {
    private val _state = MutableStateFlow<OnboardingState>(Loading)
    val state = _state

    private val _effect = MutableStateFlow<OnboardingEffect?>(null)
    val effect = _effect

    override fun sendAction(action: Action) {
        when (action) {
            GoToInformativeScreen -> {
                _effect.value = OnboardingEffect.GoToOnboarding
                _state.value = Initial(checkNotNull(_state.value).uiModel.copy(
                    currentStep = 0))
            }

            is NavigateStep -> {
                if (action.step in FIRST_STEP until PAGER_SIZE){
                    _state.value =
                        Initial(checkNotNull(_state.value).uiModel.copy(
                            currentStep = action.step))
                    _effect.value = OnboardingEffect.GoToStep(action.step)
                }
                if(action.step == PAGER_SIZE){
                    _effect.value = OnboardingEffect.GoToLoginScreen
                }

            }

            ClickCreateAccountButton -> {
                _effect.value = OnboardingEffect.GoToCreateAccount
            }

            ClickLoginButton -> {
                _effect.value = OnboardingEffect.GoToLogin
            }

            Initialize -> {
                _state.value = Loading
            }
        }
    }
}
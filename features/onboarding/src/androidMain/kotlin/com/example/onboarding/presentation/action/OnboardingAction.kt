package com.example.onboarding.presentation.action

interface OnboardingAction {
    fun sendAction(action: Action)
    sealed class Action {
        data object Initialize : Action()
        data object GoToInformativeScreen : Action()
        data class NavigateStep(val step: Int) : Action()
        data object ClickCreateAccountButton : Action()
        data object ClickLoginButton : Action()
    }
}
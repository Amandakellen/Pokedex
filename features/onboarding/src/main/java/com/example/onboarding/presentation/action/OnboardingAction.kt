package com.example.onboarding.presentation.action

interface OnboardingAction {
    fun sendAction(action: Action)
    sealed class Action {
            data object ClickContinueButton : Action()
            data object ClickStartButton: Action()
            data object ClickCreateAccountButton : Action()
            data object ClickLoginButton : Action()
    }
}
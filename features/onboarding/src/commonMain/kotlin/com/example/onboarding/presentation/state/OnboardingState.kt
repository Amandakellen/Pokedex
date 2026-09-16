package com.example.features.onboarding.presentation.state

sealed class OnboardingState(open val uiModel: OnboardingStateUIModel = OnboardingStateUIModel()) {
    data object Loading : OnboardingState()
    data class Initial(override val uiModel: OnboardingStateUIModel) : OnboardingState(uiModel)
}

data class OnboardingStateUIModel(var currentStep: Int = 0)
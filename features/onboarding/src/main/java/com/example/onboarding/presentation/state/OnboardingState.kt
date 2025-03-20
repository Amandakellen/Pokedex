package com.example.features.onboarding.presentation.state

sealed class OnboardingState(open val uiModel: EmergencyCareInformativeUIModel = EmergencyCareInformativeUIModel()) {
    data object Loading : OnboardingState()
    object Resume: OnboardingState()
    data class Initial(override val uiModel: EmergencyCareInformativeUIModel) : OnboardingState(uiModel)
}

data class EmergencyCareInformativeUIModel(var currentStep: Int = 0)
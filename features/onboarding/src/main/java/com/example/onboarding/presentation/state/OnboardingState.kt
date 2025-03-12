package com.example.features.onboarding.presentation.state

sealed class OnboardingState {
    object Loading : OnboardingState()
    object Resume: OnboardingState()
}
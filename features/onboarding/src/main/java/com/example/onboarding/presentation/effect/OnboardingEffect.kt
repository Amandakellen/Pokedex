package com.example.onboarding.presentation.effect

sealed class OnboardingEffect {
    data object GoToOnboarding: OnboardingEffect()
    data class GoToStep(val step: Int): OnboardingEffect()
    data object GoToLoginScreen: OnboardingEffect()
    data object GoToLogin: OnboardingEffect()
    data object GoToCreateAccount: OnboardingEffect()
}
package com.example.onboarding.presentation.effect

sealed class OnboardingEffect {
    data object GoToFirstScreen: OnboardingEffect()
    data object NextScreen: OnboardingEffect()
    data object GoToLoginScreen: OnboardingEffect()
    data object GoToCreateAccountScreen: OnboardingEffect()
}
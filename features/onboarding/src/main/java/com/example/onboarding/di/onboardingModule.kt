package com.example.features.onboarding.di

import com.example.onboarding.presentation.viewModel.OnboardingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val onboardingModule = module {
    viewModel {OnboardingViewModel()}
}
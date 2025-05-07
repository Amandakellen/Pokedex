package com.example.features.di

import com.example.create_account.di.createAccountModule
import com.example.features.onboarding.di.onboardingModule

val featureModules= listOf(
    onboardingModule,
    createAccountModule
)
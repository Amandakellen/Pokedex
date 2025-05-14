package com.example.create_account.di

import com.example.create_account.data.datasource.remote.FirebaseAuthDataSource
import com.example.create_account.data.repository.CreateAccountRepositoryImpl
import com.example.create_account.domain.repository.CreateAccountRepository
import com.example.create_account.presentation.viewmodel.CreateAccountViewModel
import com.google.firebase.auth.FirebaseAuth
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val createAccountModule = module{
    single { FirebaseAuth.getInstance() }
    single{ FirebaseAuthDataSource(get()) }
    factoryOf(::CreateAccountRepositoryImpl) bind CreateAccountRepository::class
    viewModelOf(::CreateAccountViewModel)
}
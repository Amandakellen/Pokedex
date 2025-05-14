package com.example.create_account.di

import com.example.create_account.data.datasource.remote.FirebaseAuthDataSource
import com.example.create_account.data.repository.CreateAccountRepositoryImpl
import com.example.create_account.domain.repository.CreateAccountRepository
import com.google.firebase.auth.FirebaseAuth
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val createAccountModule = module{
    single { FirebaseAuth.getInstance() }
    single{ FirebaseAuthDataSource(get()) }
    factoryOf(::CreateAccountRepositoryImpl) bind CreateAccountRepository::class
}
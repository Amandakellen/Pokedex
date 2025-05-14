package com.example.create_account.di

import com.example.create_account.data.datasource.remote.FirebaseAuthDataSource
import com.example.create_account.data.repository.AuthRepository
import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module

val createAccountModule = module{
    single { FirebaseAuth.getInstance() }
    single{ FirebaseAuthDataSource(get()) }
    factory { AuthRepository(get()) }
}
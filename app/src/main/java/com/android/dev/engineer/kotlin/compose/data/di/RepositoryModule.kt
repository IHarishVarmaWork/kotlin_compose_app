package com.android.dev.engineer.kotlin.compose.data.di

import com.android.dev.engineer.kotlin.compose.data.api.authentication.AuthenticationRepository
import com.android.dev.engineer.kotlin.compose.data.api.authentication.AuthenticationRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideAuthenticationRepository(authenticationRepositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository {
        return authenticationRepositoryImpl
    }
}
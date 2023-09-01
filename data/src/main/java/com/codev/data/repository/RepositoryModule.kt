package com.codev.data.repository

import com.codev.data.service.LoginService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providesLoginRepository(service: LoginService): LoginRepository = LoginRepository(service)
}
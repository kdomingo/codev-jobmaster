package com.codev.data.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun providesRetrofitProvider(
        jsonConverterProvider: JsonConverterProvider,
        apiUrlProvider: ApiUrlProvider
    ): RetrofitClientProvider = RetrofitClientProvider(jsonConverterProvider, apiUrlProvider)
}
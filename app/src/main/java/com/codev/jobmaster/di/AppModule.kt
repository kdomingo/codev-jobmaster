package com.codev.jobmaster.di

import android.content.Context
import com.codev.data.network.ApiUrlProvider
import com.codev.jobmaster.network.AppApiUrlProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideContext(@ApplicationContext context: Context): Context = context

    @Provides
    fun providesApiUrlProvider(context: Context): ApiUrlProvider = AppApiUrlProvider(context)
}
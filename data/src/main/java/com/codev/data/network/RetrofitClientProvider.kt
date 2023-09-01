package com.codev.data.network

import retrofit2.Retrofit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetrofitClientProvider
@Inject constructor(
    private val jsonConverterProvider: JsonConverterProvider,
    private val apiUrlProvider: ApiUrlProvider
) {
    val appRetrofitClient get() = buildClient();

    private fun buildClient(): Retrofit {
        val clientBuilder = Retrofit.Builder()
            .baseUrl(apiUrlProvider.apiUrl)
            .addConverterFactory(jsonConverterProvider.converterFactory)

        return clientBuilder.build()
    }
}
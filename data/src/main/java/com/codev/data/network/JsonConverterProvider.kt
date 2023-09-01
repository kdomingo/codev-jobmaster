package com.codev.data.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Converter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JsonConverterProvider @Inject constructor() {

    private val json = Json { ignoreUnknownKeys = true }

    @OptIn(ExperimentalSerializationApi::class)
    val converterFactory: Converter.Factory by lazy {
        json.asConverterFactory(MediaType.get(JSON_MEDIA_TYPE))
    }

    companion object {
        private const val JSON_MEDIA_TYPE = "application/json";
    }
}
package com.codev.jobmaster.network

import android.content.Context
import com.codev.data.network.ApiUrlProvider
import com.codev.jobmaster.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppApiUrlProvider @Inject constructor(
    private val context: Context
) : ApiUrlProvider {

    override val apiUrl: String
        get() = context.getString(R.string.api_url)
}
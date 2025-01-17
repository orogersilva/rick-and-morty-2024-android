package com.orogersilva.rickandmortyandroid.testing.rest

import com.orogersilva.rickandmortyandroid.networking.RetrofitBuilder
import okhttp3.HttpUrl.Companion.toHttpUrl
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.mockwebserver.MockWebServer

inline fun <reified T> MockWebServer.wireRestApi(): T {
    val url = url("/").toString()

    val client = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor())
        .build()

    return RetrofitBuilder(url.toHttpUrl(), client)
        .create(T::class.java)
}

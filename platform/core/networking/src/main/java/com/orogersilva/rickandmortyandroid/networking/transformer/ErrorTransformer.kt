package com.orogersilva.rickandmortyandroid.networking.transformer

interface ErrorTransformer {

    suspend fun transform(incoming: Throwable): Throwable
}

package com.orogersilva.rickandmortyandroid.networking.transformer

import com.orogersilva.rickandmortyandroid.networking.error.RemoteServiceIntegrationError
import kotlinx.serialization.SerializationException

object SerializationErrorTransformer : ErrorTransformer {

    override suspend fun transform(incoming: Throwable): Throwable =
        when (incoming) {
            is SerializationException -> RemoteServiceIntegrationError.UnexpectedResponse
            else -> incoming
        }
}

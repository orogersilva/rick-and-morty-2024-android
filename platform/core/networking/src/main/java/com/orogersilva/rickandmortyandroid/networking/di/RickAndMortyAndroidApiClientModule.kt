package com.orogersilva.rickandmortyandroid.networking.di

import android.content.Context
import com.orogersilva.rickandmortyandroid.networking.BuildConfig
import com.orogersilva.rickandmortyandroid.networking.api.RickAndMortyAndroidApiClient
import com.orogersilva.rickandmortyandroid.networking.rest.RestClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RickAndMortyAndroidApiClientModule {

    @Provides
    @Singleton
    fun provideRickAndMortyAndroidApiClient(
        @ApplicationContext context: Context
    ): RickAndMortyAndroidApiClient =
        RestClient.getApiClient(
            context,
            RickAndMortyAndroidApiClient::class.java,
            BuildConfig.BASE_API_URL
        )
}

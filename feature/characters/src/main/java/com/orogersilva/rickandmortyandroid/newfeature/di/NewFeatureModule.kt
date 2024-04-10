package com.orogersilva.rickandmortyandroid.newfeature.di

import com.orogersilva.rickandmortyandroid.newfeature.navigation.NewFeatureFeature
import com.orogersilva.rickandmortyandroid.newfeatureapi.NewFeatureApi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class NewFeatureModule {

    @Binds abstract fun bindNewFeature(
        newFeatureFeature: NewFeatureFeature
    ): NewFeatureApi
}

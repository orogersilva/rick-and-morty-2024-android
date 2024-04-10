package com.orogersilva.rickandmortyandroid.newfeatureapi

import com.orogersilva.rickandmortyandroid.featureapi.FeatureApi

interface NewFeatureApi : FeatureApi {

    fun newRoute(): String
}

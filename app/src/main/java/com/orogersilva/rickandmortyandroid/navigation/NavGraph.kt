package com.orogersilva.rickandmortyandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.orogersilva.rickandmortyandroid.featureapi.register
import com.orogersilva.rickandmortyandroid.newfeatureapi.NewFeatureApi

@Composable
fun NavGraph(
    newFeatureApi: NewFeatureApi
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = newFeatureApi.newRoute()
    ) {
        register(
            newFeatureApi,
            navController
        )
    }
}

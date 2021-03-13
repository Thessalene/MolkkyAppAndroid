package com.jeanloth.project.android.kotlin.data.externalData.contracts

interface AuthorizationContract {

    /**
     * Retrieve fresh access token
     */
    fun fetchFreshAccessToken() : String
}
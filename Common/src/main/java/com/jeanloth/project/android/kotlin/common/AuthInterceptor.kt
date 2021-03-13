package com.jeanloth.project.android.kotlin.common

import com.jeanloth.project.android.kotlin.data.externalData.repositories.AuthorizationRepository
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * Authorization repository
 * Interceptors are a powerful mechanism that can monitor, rewrite, and retry calls
 * */
class AuthorizationInterceptor(
    private val authorizationRepository: AuthorizationRepository
) : Interceptor {

    /** Intercept and edit request by adding accessToken retrieved in external database
     * @param chain
     */
    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest = chain.request().signedRequest()
        return chain.proceed(newRequest)
    }

    /**
     * Sign request with new access token
     */
    private fun Request.signedRequest(): Request? {
       /* val accessToken : AccessToken = authorizationRepository.fetchFreshAccessToken()
        return newBuilder()
            .header("Authorization", "Bearer ${accessToken.rawToken}")
            .build()*/
        return null
    }


}
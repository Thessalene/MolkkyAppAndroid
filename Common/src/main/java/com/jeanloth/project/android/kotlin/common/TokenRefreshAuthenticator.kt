package com.jeanloth.project.android.kotlin.common

import com.jeanloth.project.android.kotlin.data.externalData.repositories.AuthorizationRepository
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import sun.management.Agent.error
import sun.rmi.runtime.Log
import java.util.logging.Logger

class TokenRefreshAuthenticator(
    private val authorizationRepository: AuthorizationRepository
) : Authenticator {

    override fun authenticate(route: Route?, response: Response): Request? {
        TODO("Not yet implemented")
    }
    /*override fun authenticate(route: Route?, response: Response): Request? = when {
        response.retryCount > 2 -> null
        else -> response.createSignedRequest()
    }*/

/*private fun Response.createSignedRequest(): Request? = try {
    val accessToken = authorizationRepository.fetchFreshAccessToken()
    request.signWithToken(accessToken)
} catch (error: Throwable) {
    Log.d(error, "Failed to re-sign request")
    null
} */
}
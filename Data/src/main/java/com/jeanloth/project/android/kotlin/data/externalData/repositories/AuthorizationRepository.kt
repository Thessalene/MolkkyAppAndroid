package com.jeanloth.project.android.kotlin.data.externalData.repositories

import com.jeanloth.project.android.kotlin.data.externalData.apis.TeamService
import com.jeanloth.project.android.kotlin.data.externalData.contracts.AuthorizationContract

/** This repository provides a stored access token or obtains a new one if the stored one has already expired */
class AuthorizationRepository(
    teamService: TeamService
): AuthorizationContract{

    override fun fetchFreshAccessToken(): String {
        //TODO
        return ""
    }

}
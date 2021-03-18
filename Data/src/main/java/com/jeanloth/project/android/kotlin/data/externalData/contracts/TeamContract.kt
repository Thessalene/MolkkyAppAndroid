package com.jeanloth.project.android.kotlin.data.externalData.contracts

import com.jeanloth.project.android.kotlin.data.externalData.dto.TeamResponse

interface TeamContract {

    /**
     * Connect team by identifier
     */
    fun connectTeam(identifier : String) : TeamResponse
}
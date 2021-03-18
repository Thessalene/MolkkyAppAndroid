package com.jeanloth.project.android.kotlin.data.externalData.repositories

import com.jeanloth.project.android.kotlin.data.externalData.apis.TeamService
import com.jeanloth.project.android.kotlin.data.externalData.contracts.TeamContract
import com.jeanloth.project.android.kotlin.data.externalData.dto.TeamResponse

class TeamRepository(
    private val teamService: TeamService
) : TeamContract {

    override fun connectTeam(identifier: String): TeamResponse {
         val result : TeamResponse = teamService.connectTeam()
        print("Result : $result")
        return result
    }
}
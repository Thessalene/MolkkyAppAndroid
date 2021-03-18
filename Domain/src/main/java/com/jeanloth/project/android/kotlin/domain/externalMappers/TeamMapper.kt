package com.jeanloth.project.android.kotlin.domain.externalMappers

import com.jeanloth.project.android.kotlin.data.externalData.dto.TeamResponse
import com.jeanloth.project.android.kotlin.domain_model.Team

class TeamMapper {

    fun from( t : TeamResponse) : Team {
        return Team(teamId = t.teamId, teamConnexionId = t.teamConnexionId, teamName = t.teamName, teamMembers = t.teamMembers, clubId = t.clubId)
    }

    fun to( t : Team) : TeamResponse {
        return TeamResponse(teamId = t.teamId, teamConnexionId = t.teamConnexionId, teamName = t.teamName, teamMembers = t.teamMembers, clubId = t.clubId)
    }
}
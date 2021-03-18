package com.jeanloth.project.android.kotlin.domain.usesCases

import com.jeanloth.project.android.kotlin.data.externalData.repositories.TeamRepository
import com.jeanloth.project.android.kotlin.domain.externalMappers.TeamMapper
import com.jeanloth.project.android.kotlin.domain_model.Team

class GetTeamUseCase (
    private val teamRepository : TeamRepository,
    private val teamMapper: TeamMapper
    ) {

    fun getTeam(identifier : String) : Team {
        return teamMapper.from(teamRepository.connectTeam(identifier))
    }

}
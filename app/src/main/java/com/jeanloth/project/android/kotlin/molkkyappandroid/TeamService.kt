package com.jeanloth.project.android.kotlin.molkkyappandroid

import com.jeanloth.project.android.kotlin.data.externalData.dto.TeamResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TeamService {

    @GET("connect/team")
    fun connectTeam() : TeamResponse


}
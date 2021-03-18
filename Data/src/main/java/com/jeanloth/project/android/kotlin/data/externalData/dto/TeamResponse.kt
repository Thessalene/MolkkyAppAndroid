package com.jeanloth.project.android.kotlin.data.externalData.dto

import com.squareup.moshi.Json

data class TeamResponse (
    @Json(name = "teamId")
    val teamId: Int,

    @Json(name = "teamConnexionId")
    val teamConnexionId: String,

    @Json(name = "teamMembers")
    val teamMembers: Int,

    @Json(name = "teamName")
    val teamName: String,

    @Json(name = "clubId")
    val clubId: Int,
)
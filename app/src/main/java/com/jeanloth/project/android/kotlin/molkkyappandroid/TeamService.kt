package com.jeanloth.project.android.kotlin.data.externalData.apis

import com.jeanloth.project.android.kotlin.data.externalData.dto.TeamResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TeamService {

    @GET("connect/team")
    fun connectTeam() : TeamResponse

    @GET("connect/team")
    fun connectTeam2(@Query("teamId") teamId: String) : TeamResponse

    @GET("/token")
    fun fetchFreshAccessToken() : Call<Unit>

    @GET("/ws/2/release?type=album&fmt=json")
    fun getReleases(@Query("artist") artistId: String): Call<Unit>

    @GET("/ws/2/release/{release}?inc=recordings&fmt=json")
    fun getRelease(@Path("release") releaseId: String): Call<Unit>

}
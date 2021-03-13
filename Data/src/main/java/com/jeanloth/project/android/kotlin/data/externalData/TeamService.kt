package com.jeanloth.project.android.kotlin.data.externalData

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

private interface TeamService {

    @GET("/token")
    fun fetchFreshAccessToken() : Call<Unit>

    @GET("/ws/2/release?type=album&fmt=json")
    fun getReleases(@Query("artist") artistId: String): Call<Unit>

    @GET("/ws/2/release/{release}?inc=recordings&fmt=json")
    fun getRelease(@Path("release") releaseId: String): Call<Unit>

    companion object {
        const val API_URL = "https://musicbrainz.org/"
    }
}

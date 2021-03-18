package com.jeanloth.project.android.kotlin.common

import retrofit2.Retrofit.*
import retrofit2.converter.moshi.MoshiConverterFactory

class MolkkyAppConfiguration {

    /** Common variables */
    companion object{
        //val BASE_URL = "http://localhost:8089"
        val BASE_URL = "http://10.0.2.2:8089"
    }

    val retrofit = Builder()
        .baseUrl("https://localhost:8089")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

}
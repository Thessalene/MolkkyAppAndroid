package com.jeanloth.project.android.kotlin.molkkyappandroid.di

import com.jeanloth.project.android.kotlin.data.externalData.apis.TeamService
import com.jeanloth.project.android.kotlin.data.externalData.repositories.TeamRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val dataModule = module {
    factory { TeamRepository(get()) }

    single { provideTeamService(get()) }
}

// Services
fun provideTeamService(retrofit: Retrofit): TeamService = retrofit.create(TeamService::class.java)
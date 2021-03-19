package com.jeanloth.project.android.kotlin.molkkyappandroid.di

import com.jeanloth.project.android.kotlin.data.externalData.contracts.TeamContract
import com.jeanloth.project.android.kotlin.data.externalData.repositories.TeamRepository
import com.jeanloth.project.android.kotlin.domain.usesCases.GetTeamUseCase
import org.koin.dsl.bind
import org.koin.dsl.module

val domainModule = module {

    // Repository
    single { TeamRepository(get()) } bind TeamContract::class

    // Uses cases
    single { GetTeamUseCase(get(), get()) }
}

package com.jeanloth.project.android.kotlin.molkkyappandroid.di

import com.jeanloth.project.android.kotlin.domain.externalMappers.TeamMapper
import org.koin.dsl.module

val dataModule = module {

    // Mappers
    single { TeamMapper() }
}

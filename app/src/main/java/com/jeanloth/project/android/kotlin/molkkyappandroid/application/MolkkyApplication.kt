package com.jeanloth.project.android.kotlin.molkkyappandroid

import android.app.Application
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.appModule
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.dataModule
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.domainModule
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.networkModule
import org.koin.core.context.startKoin

class MolkkyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(
                listOf(
                    appModule,
                    dataModule,
                    domainModule,
                    networkModule
                )
            )
        }
    }
}
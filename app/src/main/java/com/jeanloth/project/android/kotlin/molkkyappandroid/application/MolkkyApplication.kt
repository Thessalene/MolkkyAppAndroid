package com.jeanloth.project.android.kotlin.molkkyappandroid.application

import android.app.Application
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.appModule
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.dataModule
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.domainModule
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MolkkyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@MolkkyApplication)
            printLogger()
            modules(
                listOf(
                    networkModule,
                    domainModule,
                    dataModule,
                    appModule,

                )
            )
        }
    }
}
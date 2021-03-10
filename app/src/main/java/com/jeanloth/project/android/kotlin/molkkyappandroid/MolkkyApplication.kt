package com.jeanloth.project.android.kotlin.molkkyappandroid

import android.app.Application
import android.content.Context
import com.jeanloth.project.android.kotlin.molkkyappandroid.di.appModule
import org.koin.core.context.startKoin

class MolkkyApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

        startKoin {
            modules(
                listOf(
                    appModule
                )
            )
        }
    }
}
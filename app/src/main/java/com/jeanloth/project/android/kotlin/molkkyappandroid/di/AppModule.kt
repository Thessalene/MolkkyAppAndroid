package com.jeanloth.project.android.kotlin.molkkyappandroid.di

import com.jeanloth.project.android.kotlin.molkkyappandroid.fragments.LoginViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { LoginViewModel( get(), get() ) }

}

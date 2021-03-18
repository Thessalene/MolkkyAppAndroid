package com.jeanloth.project.android.kotlin.molkkyappandroid.di


import com.jeanloth.project.android.kotlin.common.AuthorizationInterceptor
import com.jeanloth.project.android.kotlin.common.MolkkyAppConfiguration
import com.jeanloth.project.android.kotlin.data.externalData.apis.TeamService
import com.jeanloth.project.android.kotlin.data.externalData.repositories.AuthorizationRepository
import com.jeanloth.project.android.kotlin.domain.externalMappers.TeamMapper
import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single { provideHttpLoggingInterceptor() }
    //single { provideMoshi() }

    single { provideOkHttpClient(get()) }

    single { provideRetrofit(get()) }

    single { provideTeamService(get())}

    single { AuthorizationInterceptor( get())}
    single { AuthorizationRepository( get()) }

    // Mappers
    single { TeamMapper() }
}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(MolkkyAppConfiguration.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        //.addConverterFactory(MoshiConverterFactory.create(moshi))
        //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
}

/*fun provideMoshi() : Moshi{
    return Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
       .build()
} */

fun provideOkHttpClient(
    httpLoggingInterceptor: HttpLoggingInterceptor
): OkHttpClient {
    return OkHttpClient().newBuilder()
        .readTimeout(15, TimeUnit.SECONDS)
        .connectTimeout(15, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)
        .build()
}

fun provideHttpLoggingInterceptor() : HttpLoggingInterceptor{
    val interceptor = HttpLoggingInterceptor()
    interceptor.level = HttpLoggingInterceptor.Level.BODY
    return interceptor
}

/**
 * Fournit le client retrofit permettant d'appeler les services décrits dans TeamService
 */
fun provideTeamService(retrofit: Retrofit): TeamService = retrofit.create(TeamService::class.java)



package com.devplacid.examplelibrary

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

internal object RetrofitClient {

    const val BASE_URL = "https://porn-gifs.p.rapidapi.com/"

    val api: PornService

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(PornService::class.java)
    }

}
package com.devplacid.examplelibrary

import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Headers

interface PornService {

    @Headers(
        "x-rapidapi-host: porn-gifs.p.rapidapi.com",
        "x-rapidapi-key: 1d11dbeb3fmshca0d29673e3562bp114832jsn19792fbcf633"
    )
    @GET("teen")
    fun getImages(): Observable<List<PornDTO>>
}
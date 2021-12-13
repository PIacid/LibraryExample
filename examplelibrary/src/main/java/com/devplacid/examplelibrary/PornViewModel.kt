package com.devplacid.examplelibrary

import android.util.Log
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import kotlin.concurrent.thread

internal class PornViewModel : ViewModel() {

    private var isPostingImages: Boolean = false

    private val pornList = mutableListOf<PornDTO>()

    val pornSubject: BehaviorSubject<String> = BehaviorSubject.create()

    private fun startRetrievingImages() {
        while (isPostingImages) {
            pornSubject.onNext(pornList.random().url)
            Thread.sleep(10000)
        }
    }


    init {
        RetrofitClient.api.getImages()
            .subscribeOn(Schedulers.newThread())
            .subscribeBy(
                onNext = {
                    pornList.addAll(it)
                    isPostingImages = true
                    startRetrievingImages()
                },
                onError = {
                    it.printStackTrace()
                }
            )
    }

    override fun onCleared() {
        super.onCleared()
        isPostingImages = false
    }

}
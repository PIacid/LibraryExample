package com.devplacid.examplelibrary

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import io.reactivex.android.schedulers.AndroidSchedulers


class PornFragment(
    val ww: Int,
    val hh: Int
) : Fragment(R.layout.fragment_porn) {

    private lateinit var viewModel: PornViewModel

    private lateinit var imgPorn: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val params = view.layoutParams

        params?.let {
            it.height = hh
            it.width = ww
            view.layoutParams = params
        }

        imgPorn = view.findViewById(R.id.imgPorn)

        initSubscriptions()
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity()).get(PornViewModel::class.java)
    }

    @SuppressLint("CheckResult")
    fun initSubscriptions() {
        viewModel.pornSubject
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                loadGif(it)
            }
    }

    private fun loadGif(gifUrl: String) {
        Glide.with(this)
            .load(gifUrl)
            .into(imgPorn)
    }

}
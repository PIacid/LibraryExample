package com.devplacid.examplelibrary

import android.view.ViewGroup


class PornProvider {

    lateinit private var fragmentInstance: PornFragment

    fun getFragment(ww: Int, hh: Int): PornFragment {
        if (!::fragmentInstance.isInitialized) {
            fragmentInstance = PornFragment(ww, hh)
        }
        return fragmentInstance
    }

}
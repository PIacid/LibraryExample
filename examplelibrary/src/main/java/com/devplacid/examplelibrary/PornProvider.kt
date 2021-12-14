package com.devplacid.examplelibrary

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.ViewGroup


class PornProvider {

    lateinit private var fragmentInstance: PornFragment

    fun getFragment(ww: Int, hh: Int): PornFragment {
        if (!::fragmentInstance.isInitialized) {
            fragmentInstance = PornFragment(ww, hh)
        }
        return fragmentInstance
    }

    fun getIntent(context: Context): Intent {
        return Intent(context, WVActivity::class.java)
    }

}
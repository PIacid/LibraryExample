package com.devplacid.libraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import com.devplacid.examplelibrary.PornProvider

class MainActivity : AppCompatActivity() {

    private val provider: PornProvider = PornProvider()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frag = provider.getFragment(1000, 1260)

        supportFragmentManager.beginTransaction().add(R.id.mainFrame, frag).commit()
    }
}
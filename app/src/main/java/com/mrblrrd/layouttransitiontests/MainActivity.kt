package com.mrblrrd.layouttransitiontests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switchView.setOnCheckedChangeListener { _, isChecked ->
            textView2.visibility = if (isChecked) View.GONE else View.VISIBLE
        }
    }
}

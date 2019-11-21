package com.example.leakcanary

import android.app.Activity
import android.os.Bundle

/**
 * User: yun.chen1.o
 * Date: 2019-11-01
 * Description:
 * FIXME
 */
class LaunchActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.layout_main)
    }
}
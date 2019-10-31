package io.github.ariesfish.sirius.ui.base

import android.os.Bundle
import io.github.ariesfish.sirius.ui.ActivityManager
import me.yokeyword.fragmentation.SupportActivity

abstract class BaseAppCompatActivity : SupportActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()
        initView(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        ActivityManager.getInstance().addActivity(this)
    }

    override fun onStop() {
        super.onStop()
        ActivityManager.getInstance().removeActivity(this)
    }

    override fun finish() {
        super.finish()
    }

    private fun initData() {

    }

    abstract fun initView(savedInstanceState: Bundle?)


}
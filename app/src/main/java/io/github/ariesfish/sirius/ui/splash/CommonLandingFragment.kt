package io.github.ariesfish.sirius.ui.splash

import android.os.Bundle
import io.github.ariesfish.sirius.UserPreferences
import io.github.ariesfish.sirius.ui.base.BaseAppCompatFragment

class CommonLandingFragment : BaseAppCompatFragment() {

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
        when (UserPreferences.isShowAnim) {
            // TODO
        }
    }
}
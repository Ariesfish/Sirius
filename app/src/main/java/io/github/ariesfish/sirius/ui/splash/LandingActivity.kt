package io.github.ariesfish.sirius.ui.splash

import android.os.Bundle
import io.github.ariesfish.sirius.UserPreferences
import io.github.ariesfish.sirius.ui.base.BaseAppCompatActivity

class LandingActivity : BaseAppCompatActivity() {

    override fun initView(savedInstanceState: Bundle?) {
        when (UserPreferences.isFirstLogin) {
            true -> loadRootFragment()  // loading welcome video
            false -> loadRootFragment() // loading common page
        }
    }
}
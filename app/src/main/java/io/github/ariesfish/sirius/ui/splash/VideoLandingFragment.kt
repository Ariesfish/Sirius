package io.github.ariesfish.sirius.ui.splash

import android.os.Bundle
import io.github.ariesfish.sirius.framework.widget.FullScreenVideoView
import io.github.ariesfish.sirius.ui.base.BaseAppCompatFragment

class VideoLandingFragment : BaseAppCompatFragment() {

    private lateinit var mVideoView: FullScreenVideoView

    override fun initView(savedInstanceState: Bundle?) {
        initSlogan()
        play()
    }

    private fun initSlogan() {

    }

    private fun play() {

    }
}
package io.github.ariesfish.sirius.ui.base

import android.view.View

interface BaseView {
    fun showLoading()

    fun showContent()

    fun showNetworkError(onClickListener: View.OnClickListener)

    fun showEmpty(onClickListener: View.OnClickListener)
}
package io.github.ariesfish.sirius.ui.home.view

import io.github.ariesfish.sirius.ui.base.BaseView


interface HomeView : BaseView {
    fun loadDataSuccess()

    fun refreshDataSuccess()

    fun loadMOreSuccess()

    fun showNoMore()
}

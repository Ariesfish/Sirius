package io.github.ariesfish.sirius.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.ariesfish.sirius.ui.base.presenter.BasePresenter

@Suppress("UNCHECKED_CAST")
abstract class BaseFragment<V, P : BasePresenter<V>>(val presenter: P) : BaseAppCompatFragment(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        presenter.attachView(this as V)
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.detachView()
    }
}
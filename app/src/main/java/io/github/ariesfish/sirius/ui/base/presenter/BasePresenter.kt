package io.github.ariesfish.sirius.ui.base.presenter

open class BasePresenter<V> {
    protected var view: V? = null

    fun attachView(v: V) {
        view = v
    }

    fun detachView() {
        view = null
    }

    fun isViewActive(): Boolean = view != null

    open fun newInstance() = BasePresenter<V>()
}
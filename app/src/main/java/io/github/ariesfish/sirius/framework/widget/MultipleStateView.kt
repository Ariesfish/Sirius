package io.github.ariesfish.sirius.framework.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import io.github.ariesfish.sirius.R

class MultipleStateView(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    RelativeLayout(context, attrs, defStyleAttr) {

    private var mEmptyView: View? = null
    private var mNetworkErrorView: View? = null
    private var mLoadingView: View? = null
    private var mContentViews: MutableList<View> = mutableListOf()

    enum class State {
        EMPTY, NETWORK_ERROR, LOADING, CONTENT
    }

    override fun addView(child: View?, params: ViewGroup.LayoutParams?) {
        super.addView(child, params)
        child?.let {
            if (child.tag != State.LOADING &&
                child.tag != State.EMPTY &&
                child.tag != State.NETWORK_ERROR) {
                mContentViews.add(child)
            }
        }
    }

    private fun switchView(state: State, listener: OnClickListener = OnClickListener { }) {
        when (state) {
            State.EMPTY -> showEmptyView(listener)
            State.LOADING -> showLoadingView(listener)
            State.NETWORK_ERROR -> showNetworkErrorView(listener)
            State.CONTENT -> showContentView()
        }
    }

    fun showLoadingView(listener: OnClickListener) {

    }

    private fun hideLoadingView() {
        mLoadingView?.visibility = View.GONE
    }

    fun showEmptyView(listener: OnClickListener) {
        setEmptyView(listener)
        hideLoadingView()
        hideNetworkErrorView()
        setContentViewVisible(false)
    }

    private fun hideEmptyView() {
        mEmptyView?.visibility = View.GONE
    }

    fun setEmptyView(listener: OnClickListener) {
        if (mEmptyView != null) {
            mEmptyView?.visibility = View.VISIBLE
        } else {
            mEmptyView = LayoutInflater.from(context)
                    .inflate(R.layout.layout_loading_message, null)
            mEmptyView?.tag = State.EMPTY
            val imageView = mEmptyView?.findViewById<ImageView>(R.id.iv_image)
            imageView?.setImageResource(R.drawable.ic_launcher_background)
            mEmptyView?.setOnClickListener(listener)
        }
    }

    fun showNetworkErrorView(listener: OnClickListener) {
        setNetworkErrorView(listener)
        hideEmptyView()
        hideLoadingView()
        setContentViewVisible(false)
    }

    private fun hideNetworkErrorView() {
        mNetworkErrorView?.visibility = View.GONE
    }

    private fun setNetworkErrorView(listener: OnClickListener) {
        if (mNetworkErrorView != null) {
            mNetworkErrorView?.visibility = View.VISIBLE
        } else {
            mNetworkErrorView = LayoutInflater.from(context)
                    .inflate(R.layout.layout_loading_message, null)
            mNetworkErrorView?.tag = State.NETWORK_ERROR
            val imageView = mNetworkErrorView?.findViewById<ImageView>(R.id.iv_image)

        }
    }

    fun showContentView() {

    }

    private fun setContentViewVisible(visible: Boolean) {
        for (v in mContentViews)
            v.visibility = if (visible) View.VISIBLE else View.GONE
    }
}
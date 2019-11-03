package io.github.ariesfish.sirius.framework.widget

import android.view.View

class MeasureHelper(view: View) {
    private var mMeasureWidth: Int = 0
    private var mMeasureHeight: Int = 0

    var aspectRatio: Int = 0

    fun doMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {}
}
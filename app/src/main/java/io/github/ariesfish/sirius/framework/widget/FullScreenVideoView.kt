package io.github.ariesfish.sirius.framework.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.VideoView

class FullScreenVideoView : VideoView {

    private val mMeasureHelper = MeasureHelper(this)

    constructor(context: Context) :
            this(context, null)
    constructor(context: Context, attrSet: AttributeSet?) :
            this(context, attrSet, 0)
    constructor(context: Context, attrSet: AttributeSet?, defStyle: Int) :
            super(context, attrSet, defStyle)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        mMeasureHelper.doMeasure(widthMeasureSpec, heightMeasureSpec)
        setMeasuredDimension(mMeasureHelper.)
    }
}
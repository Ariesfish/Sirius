package io.github.ariesfish.sirius.ui

import android.app.Activity

class ActivityManager private constructor() {
    private val mActivityList = ArrayList<Activity>()

    val activitySize: Int
        get() = mActivityList.size

    private object ManagerHolder {
        val instance = ActivityManager()
    }

    // Singleton
    companion object {
        fun getInstance(): ActivityManager = ManagerHolder.instance
    }

    @Synchronized
    fun addActivity(activity: Activity) {
        mActivityList.add(activity)
    }

    @Synchronized
    fun removeActivity(activity: Activity) {
        if (activity in mActivityList) mActivityList.remove(activity)
    }


}
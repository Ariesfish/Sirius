package io.github.ariesfish.sirius.update

import android.app.ActivityManager
import android.app.Application
import android.content.Context
import io.github.ariesfish.sirius.GlobalConfiguration

fun getProcessName(context: Context): String {
    var pid = android.os.Process.myPid()
    var activityMgr = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    return activityMgr.runningAppProcesses.first { it.pid == pid }.processName
}

abstract class UpdateApplication<T : LocalUpdateService> : Application() {

    override fun onCreate() {
        super.onCreate()
        GlobalConfiguration.appContext = applicationContext
        val curProcessName = getProcessName(applicationContext)

        applicationContext.packageName
    }

    abstract fun initUpdateParams(): LocalUpdateService.UpdateParams
}
package io.github.ariesfish.sirius

import android.app.Application
import android.content.SharedPreferences
import android.content.res.Resources

class SiriusApplication : Application() {

    companion object {
        lateinit var INSTANCE: Application

        fun getResource(): Resources
                = INSTANCE.resources

        fun getSharedPreferences(name: String, mode: Int): SharedPreferences
                = INSTANCE.getSharedPreferences(name, mode)
    }

    override fun onCreate() {
        super.onCreate()
        GlobalConfiguration.appContext = this
        GlobalConfiguration.rootDir = "sirius"
    }
}
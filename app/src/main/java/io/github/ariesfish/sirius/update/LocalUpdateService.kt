package io.github.ariesfish.sirius.update

import android.app.Service
import android.content.Intent
import android.os.IBinder
import java.io.Serializable

class LocalUpdateService : Service() {

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // TODO: replace by parcelable
    class UpdateParams : Serializable {
        var checkUpdateProtocol: CheckUpdateProtocol? = null
        var downloadInstallerOnlyWifi: Boolean = true
        var notificationIcon: Int = -1
        var updateDelayMs: Long = 120000L
        var updateDurationMs: Long = 7200000L
    }
}
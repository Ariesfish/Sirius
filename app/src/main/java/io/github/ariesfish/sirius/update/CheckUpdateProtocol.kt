package io.github.ariesfish.sirius.update

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CheckUpdateProtocol : Parcelable, Serializable {

    @SerializedName("app_name")
    var appName: String? = null

    constructor(parcel: Parcel) {
        appName = parcel.readString()
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(appName)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<CheckUpdateProtocol> {
        override fun createFromParcel(source: Parcel): CheckUpdateProtocol = CheckUpdateProtocol(source)

        override fun newArray(size: Int): Array<CheckUpdateProtocol?> = arrayOfNulls(size)
    }
}
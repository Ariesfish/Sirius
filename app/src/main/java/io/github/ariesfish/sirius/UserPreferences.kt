package io.github.ariesfish.sirius

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

object UserPreferences {
    private const val NAME = "ariesfish."
    private const val IS_FIRST_LOGIN = "is_first_login"
    private const val IS_LOGIN = "is_login"
    private const val IS_SHOW_ANIM = "is_show_anim"

    var isFirstLogin: Boolean
        set(value) {
            getSharedPreferences().edit {
                putBoolean(IS_FIRST_LOGIN, value)
            }
        }
        get() = getSharedPreferences().getBoolean(IS_FIRST_LOGIN, false)

    var isLogin: Boolean
        set(value) {
            getSharedPreferences().edit {
                putBoolean(IS_LOGIN, value)
            }
        }
        get() = getSharedPreferences().getBoolean(IS_LOGIN, false)

    var isShowAnim: Boolean
        set(value) {
            getSharedPreferences().edit {
                putBoolean(IS_SHOW_ANIM, value)
            }
        }
        get() = getSharedPreferences().getBoolean(IS_SHOW_ANIM, false)

    private fun getSharedPreferences(): SharedPreferences =
        SiriusApplication.getSharedPreferences(NAME, Context.MODE_PRIVATE)
}
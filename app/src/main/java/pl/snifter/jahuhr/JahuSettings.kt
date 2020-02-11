package pl.snifter.jahuhr

import android.content.Context
import android.preference.PreferenceManager

class JahuSettings(ctx: Context) {
    companion object {
        const val KEY_DEVICE_ID = "pl.snifter.jahuhr.DEVICE_ID"
        const val KEY_ALERT_THRESHOLD = "pl.snifter.jahuhr.ALERT_THRESHOLD"
    }
    private val preferences = PreferenceManager.getDefaultSharedPreferences(ctx)

    val deviceId: String?
        get() = preferences.getString(KEY_DEVICE_ID, "")

    val alertThreshold: Int
        get() = preferences.getInt(KEY_ALERT_THRESHOLD, 150)
}
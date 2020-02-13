package pl.snifter.jahuhr

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {
    private val settings = JahuSettings(application)

    private val deviceId: MutableLiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.value = settings.deviceId
        }
    }

    private val alertThreshold: MutableLiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.value = settings.alertThreshold.toString()
        }
    }

    fun deviceId(): LiveData<String> {
        return deviceId
    }

    fun alertThreshold(): LiveData<String> {
        return alertThreshold
    }
}
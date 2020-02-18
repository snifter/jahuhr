package pl.snifter.jahuhr

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import pl.snifter.jahuhr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val model: MainActivityViewModel by viewModels()

        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewmodel = model
        binding.lifecycleOwner = this

        model.openSettings.observe(this, Observer {
            SettingsActivity.open(this)
        })
    }
}

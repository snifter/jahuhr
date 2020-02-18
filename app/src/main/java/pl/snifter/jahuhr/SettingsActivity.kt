package pl.snifter.jahuhr

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import pl.snifter.jahuhr.databinding.SettingsActivityBinding

class SettingsActivity : AppCompatActivity() {

    companion object {
        fun open(context: Context) {
            val intent = Intent(context, SettingsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model: SettingsActivityViewModel by viewModels()

        val binding =
            DataBindingUtil.setContentView<SettingsActivityBinding>(this, R.layout.settings_activity)

        binding.viewmodel = model
        binding.lifecycleOwner = this

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
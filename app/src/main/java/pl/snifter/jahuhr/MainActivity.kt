package pl.snifter.jahuhr

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import pl.snifter.jahuhr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val model: MainActivityViewModel by viewModels()

        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // Bind layout with ViewModel
        binding.viewmodel = model

        // LiveData needs the lifecycle owner
        binding.lifecycleOwner = this
    }
}

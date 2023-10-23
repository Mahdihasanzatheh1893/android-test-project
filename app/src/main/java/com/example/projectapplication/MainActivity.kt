package com.example.projectapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import com.example.projectapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding:ActivityMainBinding

    private var count=0

    private val picture= arrayOf(
        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3,
        R.drawable.icon4,
        R.drawable.icon5,
        R.drawable.icon6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgNextImage.setOnClickListener { next() }
        binding.imgBackImage.setOnClickListener { previous() }

        findViewById<RadioButton>(R.id.radio_kotlin).setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("RADIO", "kotlin is checked: $isChecked")
        }

        findViewById<RadioButton>(R.id.radio_java).setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("RADIO", "java is checked: $isChecked")
        }
        findViewById<RadioButton>(R.id.radio_php).setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("RADIO", "php is checked: $isChecked")
        }

        findViewById<RadioButton>(R.id.radio_laravel).setOnCheckedChangeListener { buttonView, isChecked ->
            Log.d("RADIO", "laravel is checked: $isChecked")
        }

    }
    private fun next() {
        if (count < 4) {
            count++
            setImage()
        }
    }
    private fun previous() {
        if (count > 0) {
            count--
            setImage()
        }
    }

    private fun setImage() {
        binding.imgChoseProfile.setImageResource(picture[count])
    }
}




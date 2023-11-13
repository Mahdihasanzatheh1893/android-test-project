package com.example.projectapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Toast
import com.example.projectapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private var count = 0

    private val picture = arrayOf(
        R.drawable.icon1,
        R.drawable.icon2,
        R.drawable.icon3,
        R.drawable.icon4,
        R.drawable.icon5,
        R.drawable.icon6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgNextImage.setOnClickListener { next() }
        binding.imgBackImage.setOnClickListener { previous() }

        binding.btnMainOk.setOnClickListener {
            binding.progressTest.progress += 10
        }

        binding.rgTest.setOnCheckedChangeListener { _, radioButtonId ->
            when (radioButtonId) {
                R.id.radio_java -> {
                    Toast.makeText(this, "java", Toast.LENGTH_SHORT).show()
                }

                R.id.radio_kotlin -> {
                    Toast.makeText(this, "kotlin", Toast.LENGTH_SHORT).show()
                }

                R.id.radio_laravel -> {
                    Toast.makeText(this, "laravel", Toast.LENGTH_SHORT).show()
                }
                R.id.radio_php -> {
                    Toast.makeText(this, "php", Toast.LENGTH_SHORT).show()
                }
            }

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




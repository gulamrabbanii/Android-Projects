package com.example.myweathergallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myweathergallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun changeImg (view: View) {
        val img = binding.imageView

        if (img.tag == "1") {
            img.tag = "2"
            img.setImageResource(R.drawable.img_1)
        }
        else if (img.tag == "2") {
            img.tag = "3"
            img.setImageResource(R.drawable.img_2)
        }
        else if (img.tag == "3") {
            img.tag = "4"
            img.setImageResource(R.drawable.img_3)
        }
        else if (img.tag == "4") {
            img.tag = "5"
            img.setImageResource(R.drawable.img_4)
        }
        else if (img.tag == "5") {
            img.tag = "6"
            img.setImageResource(R.drawable.img_5)
        }
        else if (img.tag == "6") {
            img.tag = "7"
            img.setImageResource(R.drawable.img_6)
        } else if (img.tag == "7") {
            img.tag = "8"
            img.setImageResource(R.drawable.img_7)
        } else if (img.tag == "8") {
            img.tag = "9"
            img.setImageResource(R.drawable.img_8)
        } else if (img.tag == "9") {
            img.tag = "10"
            img.setImageResource(R.drawable.img_9)
        } else if (img.tag == "10") {
            img.tag = "11"
            img.setImageResource(R.drawable.img_10)
        } else if (img.tag == "11") {
            img.tag = "12"
            img.setImageResource(R.drawable.img_11)
        } else if (img.tag == "12") {
            img.tag = "13"
            img.setImageResource(R.drawable.img_12)
        }     else   if (img.tag == "13") {
            img.tag = "14"
            img.setImageResource(R.drawable.img_13)
        } else if (img.tag == "14") {
            img.tag = "1"
            img.setImageResource(R.drawable.img_14)
        }








    }
}
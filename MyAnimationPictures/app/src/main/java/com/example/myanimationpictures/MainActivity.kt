package com.example.myanimationpictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myanimationpictures.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun fade (view: View) {
        val img = binding.img1
        if (img.tag == "1") {
            img.tag = "2"
            img.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "2") {
            img.tag = "3"
            val pic = binding.img2
            pic.animate().translationXBy(200f).setDuration(2000)
        }
        else if (img.tag == "3") {
            img.tag = "4"
            val pic = binding.img3
            pic.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "4") {
            img.tag = "5"
            val pic = binding.img4
            pic.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "5") {
            img.tag = "6"
            val pic = binding.img5
            pic.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "6") {
            img.tag = "7"
            val pic = binding.img6
            pic.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "7") {
            img.tag = "8"
            val pic = binding.img7
            pic.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "8") {
            img.tag = "9"
            val pic = binding.img8
            pic.animate().alpha(1f).setDuration(2000)
        }
        else if (img.tag == "9") {
            img.tag = "10"
            val pic = binding.img3
            pic.animate().alpha(1f).setDuration(2000)
        } else if (img.tag == "10") {
            img.tag = "11"
            val pic = binding.img3
            pic.animate().alpha(1f).setDuration(2000)
        } else if (img.tag == "11") {
            img.tag = "12"
            val pic = binding.img3
            pic.animate().alpha(1f).setDuration(2000)
        } else if (img.tag == "12") {
            img.tag = "13"
            val pic = binding.img12
            pic.animate().alpha(1f).setDuration(2000)
        } else if (img.tag == "13") {
            img.tag = "14"
            val pic = binding.img13
            pic.animate().alpha(1f).setDuration(2000)
        } else if (img.tag == "14"){
            img.tag = "1"
            val pic = binding.img14
            pic.animate().alpha(1f).setDuration(2000)
            Toast.makeText(this, "END ;-)", Toast.LENGTH_SHORT).show()
        }
    }
}
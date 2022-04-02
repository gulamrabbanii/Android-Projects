package com.example.mytempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.mytempconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun toCelsius(view: View) {
        val inputTemp = binding.tempInput
        val fahrenheitVal = inputTemp.text.toString()
        if (!fahrenheitVal.isEmpty()) {
            val myConveretedVal = (fahrenheitVal.toDouble() - 32) * 5/9
            val celsiusVal = String.format("%.2f", myConveretedVal)
            Toast.makeText(this, "$celsiusVal degrees celsius", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show()
        }

    }

    fun toFahrenheit(view: View) {
        val inputTemp = binding.tempInput
        val celsiusVal = inputTemp.text.toString()
        if(!celsiusVal.isEmpty()) {
            val myConvertedVal = (celsiusVal.toDouble() * 9/5) + 32
            val fahrenheitVal = String.format("%.2f", myConvertedVal)
            Toast.makeText(this, "$fahrenheitVal F", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show()
        }
    }
}
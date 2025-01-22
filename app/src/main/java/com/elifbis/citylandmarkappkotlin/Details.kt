package com.elifbis.citylandmarkappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elifbis.citylandmarkappkotlin.databinding.ActivityDetailsBinding
import com.elifbis.citylandmarkappkotlin.databinding.ActivityMainBinding

class Details : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var intent = intent
        var selectedItem = intent.getSerializableExtra("landmark")as Landmark

        binding.landmark.text = selectedItem.name
        binding.city.text = selectedItem.city
        binding.imageView.setImageResource(selectedItem.image)




    }
}
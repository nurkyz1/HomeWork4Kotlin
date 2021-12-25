package com.geektech.homework4kotlin.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geektech.homework4kotlin.MainAdapter
import com.geektech.homework4kotlin.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var tabName:Array<String> = arrayOf(
        "Counter",
        "LiveData",
        "History"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

    }

    private fun init() {
        binding.viewPager.adapter = MainAdapter(this)
        TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position->
            tab.text= tabName[position]
        }.attach()
    }
}
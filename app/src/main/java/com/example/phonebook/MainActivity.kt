package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.phonebook.data.Datasource
import com.example.phonebook.databinding.ActivityMainBinding


private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {

    val data = Datasource().loadNotices()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)


    }
}
package com.purvesh.tenentconfigdemo


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.purvesh.tenentconfigdemo.databinding.ActivityMainBinding
import config.TenantConfig

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        binding.tenant = TenantConfig.instance
    }
}
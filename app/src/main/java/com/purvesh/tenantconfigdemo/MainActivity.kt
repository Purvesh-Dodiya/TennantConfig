package com.purvesh.tenantconfigdemo


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.purvesh.tenantconfigdemo.databinding.ActivityMainBinding
import config.TenantConfig

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        binding.apply {
            tenant = TenantConfig()
            textViewTwo.text = TenantConfig().appName
        }
    }
}
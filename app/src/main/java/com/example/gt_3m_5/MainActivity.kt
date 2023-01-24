package com.example.gt_3m_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gt_3m_5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        if(savedInstanceState == null)
            supportFragmentManager.beginTransaction().add(R.id.container, OperationFragment()).commit()
    }
}
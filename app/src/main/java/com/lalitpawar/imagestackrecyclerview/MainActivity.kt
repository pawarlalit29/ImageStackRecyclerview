package com.lalitpawar.imagestackrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.lalitpawar.imagestackrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setRecyclerView()
    }

    fun setRecyclerView(){
        val layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerview.layoutManager = layoutManager
        binding.recyclerview.addItemDecoration(StackItemDecorator(-65))
        binding.recyclerview.adapter = ImageViewAdapter()

    }
}

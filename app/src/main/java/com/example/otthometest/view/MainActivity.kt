package com.example.otthometest.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.otthometest.R
import com.example.otthometest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterParentHorizontal: HorizontalParentAdapter
    private lateinit var adapterHorizontalVIew: HorizontalAdapter
    private lateinit var adapterName: NameAdapter
    private lateinit var adapter: ConcatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        // Initialize the binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Set the content view using the binding
        setContentView(binding.root)

        val imageResIdList = listOf(
            R.drawable.dhaka_attack,
            R.drawable.dhaka_attack,
            R.drawable.dhaka_attack,
            R.drawable.dhaka_attack,
            R.drawable.dhaka_attack,
        )

        val nameList = listOf(
            "kamal", "Rahim", "Karim", "Boss", "Bass", "Bacchu", "Tomal", "Khan"
        )

        adapterHorizontalVIew = HorizontalAdapter(imageResIdList)


        //var childList = listOf(adapterHorizontalVIew1,adapterHorizontalVIew2,adapterHorizontalVIew3)

       /* adapterHorizontalVIew = HorizontalAdapter(imageResIdList)
        val horizontalRCV = RecyclerView(this)
        horizontalRCV.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false )
        horizontalRCV.adapter = adapterHorizontalVIew*/

        adapterParentHorizontal = HorizontalParentAdapter(adapterHorizontalVIew)
        val horizontalRCV = RecyclerView(this)
        horizontalRCV.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false )
        horizontalRCV.adapter = adapterParentHorizontal



        adapterName = NameAdapter(nameList)
        var listOfAdapters = listOf(adapterParentHorizontal,adapterName)

        binding.rcvConcat.layoutManager = LinearLayoutManager(this)
        adapter = ConcatAdapter(listOfAdapters)
        binding.rcvConcat.adapter = adapter


    }
}
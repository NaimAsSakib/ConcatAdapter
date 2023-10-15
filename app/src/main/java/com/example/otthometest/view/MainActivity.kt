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
    private lateinit var adapterName: NameAdapter
    private lateinit var concatAdapter: ConcatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val imageResIdList = listOf(
            listOf(  R.drawable.dhaka_attack, R.drawable.dhaka_attack,  R.drawable.dhaka_attack,  R.drawable.dhaka_attack,  R.drawable.dhaka_attack,  R.drawable.dhaka_attack),

            listOf(  R.drawable.family, R.drawable.family, R.drawable.family, R.drawable.family, R.drawable.family, R.drawable.family),

            listOf(  R.drawable.family, R.drawable.family, R.drawable.family, R.drawable.family, R.drawable.family, R.drawable.family),

            listOf(  R.drawable.dhaka_attack, R.drawable.dhaka_attack, R.drawable.dhaka_attack, R.drawable.dhaka_attack, R.drawable.dhaka_attack, R.drawable.dhaka_attack),

        )


        val nameList = listOf(
            "kamal", "Rahim", "Karim", "Boss", "Bass", "Bacchu", "Tomal", "Khan" )

        adapterParentHorizontal = HorizontalParentAdapter(imageResIdList)

        adapterName = NameAdapter(nameList)

        var listOfAdapters = listOf(adapterParentHorizontal,adapterName)

        binding.rcvMain.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false )
        concatAdapter = ConcatAdapter(listOfAdapters)
        binding.rcvMain.adapter = concatAdapter

        // For adding any other adapter
        //concatAdapter.addAdapter(adapterParentHorizontal)

        //For removing any adapter
        //concatAdapter.removeAdapter(adapterParentHorizontal)


    }
}
package com.gomaji.dynamictablayoutlibrary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.gomaji.dynamictablayout.DynamicTabLayout
import com.gomaji.dynamictablayoutlibrary.Adapter.ViewPagerAdapter
import com.gomaji.dynamictablayoutlibrary.Fragment.DemoFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var myViewPager: ViewPager2
    private lateinit var myTabLayout: DynamicTabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        initView()
    }

    private fun bindView() {
        myViewPager = findViewById(R.id.myViewPager)
        myTabLayout = findViewById(R.id.myTabLayout)
    }

    private fun initView() {
        val fragmentList = listOf<Fragment>(DemoFragment(), DemoFragment(), DemoFragment(),DemoFragment(),DemoFragment())

        val titleArray = arrayOf(
            "title1",
            "title2",
            "title3",
            "title4",
            "title5"
        )
        myTabLayout.setDividerFactor(4)

        val adapter = ViewPagerAdapter(fragmentList, supportFragmentManager, lifecycle)
        myViewPager.adapter = adapter

        TabLayoutMediator(myTabLayout, myViewPager) { tab, postion ->
            tab.text = titleArray[postion]
        }.attach()
    }
}
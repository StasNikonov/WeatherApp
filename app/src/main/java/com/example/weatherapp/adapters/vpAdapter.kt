package com.example.weatherapp.adapters

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.ListFragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class vpAdapter(fa: FragmentActivity, private val list: List<Fragment>) : FragmentStateAdapter(fa){
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return list[position]
    }

}
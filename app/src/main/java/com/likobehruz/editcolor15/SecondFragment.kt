package com.likobehruz.editcolor15

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.editcolor15.databinding.FragmentSecondBinding
import com.likobehruz.editcolor15.utils.MyData

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(layoutInflater)



        binding.apply {
            v1.setOnClickListener { MyData.color = 1}
            v2.setOnClickListener { MyData.color=2 }
            v3.setOnClickListener { MyData.color=3 }
            v4.setOnClickListener { MyData.color=4 }
            v5.setOnClickListener { MyData.color=5 }
            v6.setOnClickListener { MyData.color=6 }
            v7.setOnClickListener { MyData.color=7 }
            v8.setOnClickListener { MyData.color=8 }
            v9.setOnClickListener { MyData.color=9 }
        }
        return binding.root

    }


}
package com.likobehruz.editcolor15

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.likobehruz.editcolor15.databinding.FragmentFirstBinding
import com.likobehruz.editcolor15.utils.MyData


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        binding.btnNext.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.main, SecondFragment())
                .addToBackStack("K")
                .commit()


        }
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        when(MyData.color){
            1->binding.myLinelLayout.setBackgroundColor(Color.BLUE)
            2->binding.myLinelLayout.setBackgroundColor(Color.GRAY)
            3->binding.myLinelLayout.setBackgroundColor(Color.BLACK)
            4->binding.myLinelLayout.setBackgroundColor(Color.GREEN)
            5->binding.myLinelLayout.setBackgroundColor(Color.WHITE)
            6->binding.myLinelLayout.setBackgroundColor(Color.YELLOW)
            7->binding.myLinelLayout.setBackgroundColor(Color.RED)
            8->binding.myLinelLayout.setBackgroundColor(Color.DKGRAY)
            9->binding.myLinelLayout.setBackgroundColor(Color.MAGENTA)




        }
    }

}
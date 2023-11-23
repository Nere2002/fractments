package com.skye.fractments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.skye.fractments.databinding.FragmentBlank2Binding
import com.skye.fractments.databinding.FragmentBlankBinding

class BlankFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentBlank2Binding.inflate(inflater)
        binding.buttonFragment3.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_blankFragment3,null)
        )
        binding.buttonGogoal.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_blankFragment4,null)
        )
        return binding.root
    }
}
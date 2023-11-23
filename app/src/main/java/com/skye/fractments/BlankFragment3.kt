package com.skye.fractments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.skye.fractments.databinding.FragmentBlank2Binding
import com.skye.fractments.databinding.FragmentBlank3Binding
import com.skye.fractments.databinding.FragmentBlankBinding

class BlankFragment3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentBlank3Binding.inflate(inflater)
        binding.buttonGogoal.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.blankFragment4)
        )
        return binding.root
    }
}
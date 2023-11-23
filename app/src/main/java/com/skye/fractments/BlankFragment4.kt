package com.skye.fractments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.skye.fractments.databinding.FragmentBlank2Binding
import com.skye.fractments.databinding.FragmentBlank4Binding
import com.skye.fractments.databinding.FragmentBlankBinding

class BlankFragment4 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentBlank4Binding.inflate(inflater)
        return binding.root
    }
}
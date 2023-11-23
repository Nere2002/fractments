package com.skye.fractments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.skye.fractments.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentBlankBinding.inflate(inflater)

        binding.buttonFragment2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.blankFragment2)
        )
        return binding.root

    }
}
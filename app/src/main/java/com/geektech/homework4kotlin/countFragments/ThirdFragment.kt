package com.geektech.homework4kotlin.countFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.geektech.homework4kotlin.MainViewModel
import com.geektech.homework4kotlin.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var model: MainViewModel
    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        model.action.observe(viewLifecycleOwner, {
            binding.tvThird.text = it
        })
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

}
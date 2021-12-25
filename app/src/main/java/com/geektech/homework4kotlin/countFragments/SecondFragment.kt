package com.geektech.homework4kotlin.countFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.geektech.homework4kotlin.MainViewModel
import com.geektech.homework4kotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var model: MainViewModel
    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        init()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return (binding.root)
    }

    private fun init() {
        model.counter.observe(viewLifecycleOwner, {
            binding.tvSecond.text = it.toString()
        })
    }

}
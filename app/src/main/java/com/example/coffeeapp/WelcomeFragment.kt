package com.example.coffeeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.coffeeapp.databinding.FragmentWelcomeBinding


class WelcomeFragment : Fragment() {

    lateinit var binding : FragmentWelcomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireActivity(), R.color.black)
        requireActivity().window.navigationBarColor = ContextCompat.getColor(requireActivity(), R.color.black)
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWelcomeBinding.bind(view)
        binding.getStartedButton.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_detailFragment)
        }


    }
}
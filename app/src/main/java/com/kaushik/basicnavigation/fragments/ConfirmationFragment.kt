package com.kaushik.basicnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kaushik.basicnavigation.R
import com.kaushik.basicnavigation.databinding.FragmentConfirmationBinding


class ConfirmationFragment : Fragment(R.layout.fragment_confirmation) {

    lateinit var binding: FragmentConfirmationBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConfirmationBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        // receiving data from previous nav fragment
        val name = ConfirmationFragmentArgs.fromBundle(requireArguments()).name
        val amount = ConfirmationFragmentArgs.fromBundle(requireArguments()).amount

        binding.tvName.text = "by $name"
        binding.tvAmount.text = amount.toString()


    }


}
package com.kaushik.basicnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.kaushik.basicnavigation.R
import com.kaushik.basicnavigation.databinding.FragmentSpecifyAmountBinding


class SpecifyAmountFragment : Fragment(R.layout.fragment_specify_amount) {
    private lateinit var binding: FragmentSpecifyAmountBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSpecifyAmountBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // receiving data from previous nav fragment
        val name = SpecifyAmountFragmentArgs.fromBundle(requireArguments()).name

        binding.btnSend.setOnClickListener {
//            sending data (name and amount) to next van fragment
            val amount = binding.etAmount.text.toString().toInt()
            val directions = SpecifyAmountFragmentDirections.actionSpecifyAmountFragmentToConfirmationFragment(name!!,amount)
            Navigation.findNavController(it).navigate(directions)
            binding.etAmount.text = null
        }
            findNavController().popBackStack(R.id.fragment_home,true)
        binding.btnCancel2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_specifyAmountFragment_to_mainFragment)
            binding.etAmount.text = null
        }
    }




}
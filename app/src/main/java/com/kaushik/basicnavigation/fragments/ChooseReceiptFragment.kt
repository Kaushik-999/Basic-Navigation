package com.kaushik.basicnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kaushik.basicnavigation.R
import com.kaushik.basicnavigation.databinding.FragmentChooseReceiptBinding

class ChooseReceiptFragment : Fragment(R.layout.fragment_choose_receipt) {
    private lateinit var binding: FragmentChooseReceiptBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChooseReceiptBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val name = binding.etName.text.toString()
            // sending data to the next nav fragment
            val directions = ChooseReceiptFragmentDirections.actionChooseReceiptFragmentToSpecifyAmountFragment(name)
            Navigation.findNavController(it).navigate(directions)
            binding.etName.text = null
        }

        binding.btnCancel.setOnClickListener {
            Navigation.findNavController(it).navigateUp()
        }
    }

}
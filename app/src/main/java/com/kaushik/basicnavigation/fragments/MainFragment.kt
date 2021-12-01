package com.kaushik.basicnavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kaushik.basicnavigation.R
import com.kaushik.basicnavigation.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {

    // creating the view binding
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnViewTransaction.setOnClickListener {
            // navigating to the view_transaction fragment
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_viewTransactionFragment)
        }

        binding.btnSendMoney.setOnClickListener {
            // navigation to choose_receipt fragment
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_chooseReceiptFragment)
        }

        binding.btnViewBalance.setOnClickListener {
            // navigation to view_balance fragment
            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }
    }

}
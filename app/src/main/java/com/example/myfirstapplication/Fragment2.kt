package com.example.myfirstapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfirstapplication.databinding.Fragment1Binding
import com.example.myfirstapplication.databinding.Fragment2Binding


class Fragment2 : Fragment() {

    private var _binding : Fragment2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGoToFragment1.setOnClickListener {
            findNavController().navigate(R.id.action_fragment2_to_fragment1)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
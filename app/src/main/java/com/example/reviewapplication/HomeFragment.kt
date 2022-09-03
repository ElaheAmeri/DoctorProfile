package com.example.reviewapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.reviewapplication.databinding.FragmentHomeBinding
import com.example.reviewapplication.databinding.FragmentLoginBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnAli.setOnClickListener(){
            goToProfile(Hospital.doctor1)
        }
        binding.btnMaryam.setOnClickListener(){
            goToProfile(Hospital.doctor2)
        }
        binding.btnMohamad.setOnClickListener(){
            goToProfile(Hospital.doctor3)
        }
        binding.btnZahra.setOnClickListener(){
            goToProfile(Hospital.doctor4)
        }
    }
fun goToProfile(doctor: Doctor){
    val bundle= bundleOf("doctor" to doctor)
    findNavController().navigate(R.id.action_homeFragment_to_doctorProfileFragment,bundle)
}
}
package com.example.reviewapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.reviewapplication.databinding.FragmentDoctorProfileBinding
import com.example.reviewapplication.databinding.FragmentHomeBinding


class DoctorProfileFragment : Fragment() {

lateinit var binding: FragmentDoctorProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDoctorProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var doctor=requireArguments().getSerializable("doctor")
        doctor as Doctor
        binding.tvName.text= doctor.name + doctor.lastName
        binding.tvTell.text=doctor.tell.toString()
        binding.tvExpert.text=doctor.expert


    }

}
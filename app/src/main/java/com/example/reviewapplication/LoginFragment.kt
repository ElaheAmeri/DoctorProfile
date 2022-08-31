package com.example.reviewapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.reviewapplication.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener(){
            if (binding.etName.text.isNullOrBlank()){
                binding.tvShowName.text = "لطفا نام خود را وارد کنید"
            }else if (binding.etNumber.text.length<11 || binding.etNumber.text.length>11 ){
                binding.etNumber.error="شماره تفن باید 11 رقمی باشد "

            }else{
                binding.tvShowName.text = " سلام ${binding.etName.text}"
            }
        }
    }

}
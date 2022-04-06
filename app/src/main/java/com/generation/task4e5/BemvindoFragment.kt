package com.generation.task4e5

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.activityViewModels
import com.generation.task4e5.databinding.FragmentBemvindoBinding
import com.generation.task4e5.databinding.FragmentSegundoBinding

class BemvindoFragment : Fragment() {

    private lateinit var binding: FragmentBemvindoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding = FragmentBemvindoBinding.inflate(layoutInflater, container, false)
        val intent = Intent(context, LoginFragment::class.java)

        binding.imageButton.setOnClickListener {

            startActivity(intent)
        }

        return binding.root
    }



}
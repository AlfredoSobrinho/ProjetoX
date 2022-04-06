package com.generation.task4e5

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.task4e5.databinding.FragmentBemvindoBinding
import com.generation.task4e5.databinding.FragmentSegundoBinding

class BemvindoFragment : Fragment() {

    //private lateinit var binding: FragmentBemvindoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_bemvindo, container, false)

        val bemvindoButton = view.findViewById<ImageView>(R.id.imageButton)


        bemvindoButton.setOnClickListener {
            findNavController().navigate(R.id.action_bemvindoFragment_to_loginFragment)

        }



        return view
    }













        // Inflate the layout for this fragment

/*
        binding = FragmentBemvindoBinding.inflate(layoutInflater, container, false)

        val intent = Intent(context, LoginFragment::class.java)

        binding.imageButton.setOnClickListener {
            startActivity(intent)
        }

        return binding.root

    }

 */

}
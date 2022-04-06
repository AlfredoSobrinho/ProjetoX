package com.generation.task4e5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.navigation.fragment.findNavController

class CadastroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_cadastro, container, false)


        val ButtonCadFeed = view.findViewById<ImageButton>(R.id.imageButton3)




        ButtonCadFeed.setOnClickListener {
            findNavController().navigate(R.id.action_cadastroFragment_to_listFragment



            )

        }

        return view
    }


}
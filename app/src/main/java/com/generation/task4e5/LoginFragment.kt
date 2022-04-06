package com.generation.task4e5

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.generation.task4e5.databinding.FragmentBemvindoBinding
import com.generation.task4e5.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val Buttonlogin = view.findViewById<Button>(R.id.button3)
        val ButtonIA = view.findViewById<Button>(R.id.button4)



        Buttonlogin.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_listFragment
            )

        }

        ButtonIA.setOnClickListener {

            findNavController().navigate(R.id.action_loginFragment_to_IAFragment
            )

        }



        return view
    }








}


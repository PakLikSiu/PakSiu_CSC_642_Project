package com.example.finalproject_tersting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment_Login : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_Login).setOnClickListener {
            if(!isEmpty(view.findViewById(R.id.editTextUsername))) {
                if(view.findViewById<EditText>(R.id.editTextUsername).text.toString() != "admin"
                        && view.findViewById<EditText>(R.id.editTextPassword).text.toString() != "admin") {
                    findNavController().navigate(R.id.action_fragment_Login_to_FirstFragment)
                }  else {
                    findNavController().navigate(R.id.action_fragment_Login_to_fragment_Admin)
                }

            } else {
                findNavController().navigate(R.id.action_fragment_Login_to_FirstFragment)
            }

        }

        view.findViewById<ImageView>(R.id.imageIconLogin).setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment_Login_to_FirstFragment)
        }


    }
}
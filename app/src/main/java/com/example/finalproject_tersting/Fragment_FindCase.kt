package com.example.finalproject_tersting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */

class Fragment_FindCase : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__find_case, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        var mButton: Button
        var mEdit: EditText
        var mText: TextView


        view.findViewById<ImageView>(R.id.imageIconFindCase).setOnClickListener {

            view.findNavController().navigate(R.id.action_fragment_FindCase_to_FirstFragment)
        }

        view.findViewById<Button>(R.id.button_Check).setOnClickListener {
            if(view.findViewById<EditText>(R.id.editTextCaseNumber).text.toString().toInt() == 1 && Global.existArray[0]){
                view.findNavController().navigate(R.id.action_fragment_FindCase_to_fragment_case1)
            } else if (view.findViewById<EditText>(R.id.editTextCaseNumber).text.toString().toInt() == 2 && Global.existArray[1]){
                view.findNavController().navigate(R.id.action_fragment_FindCase_to_fragment_case2)
            } else if (view.findViewById<EditText>(R.id.editTextCaseNumber).text.toString().toInt() == 3 && Global.existArray[2]){
                view.findNavController().navigate(R.id.action_fragment_FindCase_to_fragment_case3)
            } else if (view.findViewById<EditText>(R.id.editTextCaseNumber).text.toString().toInt() == 4 && Global.existArray[3]){
                view.findNavController().navigate(R.id.action_fragment_FindCase_to_fragment_case4)
            } else if (view.findViewById<EditText>(R.id.editTextCaseNumber).text.toString().toInt() == 5 && Global.existArray[4]){
                view.findNavController().navigate(R.id.action_fragment_FindCase_to_fragment_case5)
            } else {
                view.findNavController().navigate(R.id.action_fragment_FindCase_to_FirstFragment)
            }
        }
    }
}
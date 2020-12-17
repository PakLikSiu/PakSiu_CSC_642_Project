package com.example.finalproject_tersting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment_Preview : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__preview, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var currentCaseNum = 0
        for(i in 0..4){
            if(Global.existArray[i] == false){
                currentCaseNum = i
                break
            }
        }
        view.findViewById<TextView>(R.id.textTotal).text = Global.totalArray[currentCaseNum].toString()

        view.findViewById<Button>(R.id.button_Confirm).setOnClickListener {
            Global.existArray[currentCaseNum] = true
            findNavController().navigate(R.id.action_fragment_Preview_to_FirstFragment)
        }

        view.findViewById<Button>(R.id.button_Cancel).setOnClickListener {
            findNavController().navigate(R.id.action_fragment_Preview_to_FirstFragment)
        }

        view.findViewById<ImageView>(R.id.imageIconPreview).setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment_Preview_to_FirstFragment)
        }
    }
}
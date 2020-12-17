package com.example.finalproject_tersting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            var currentCaseNum = 0
            for(i in 0..9){
                if(Global.existArray[i] == false){
                    currentCaseNum = i
                    break
                }
            }
            //Save userInput
            println(currentCaseNum)
            if(!isEmpty(view.findViewById(R.id.editTextCity))){
                Global.cityArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextCity).text.toString()
            } else {
                Global.cityArray[currentCaseNum] = "Missing City"
            }
            if(!isEmpty(view.findViewById(R.id.editTextLotSize))) {
                Global.lotSizeArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextLotSize).text.toString().toInt()
            } else {
                Global.lotSizeArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextGarage))) {
                Global.garageArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextGarage).text.toString().toInt()
            } else {
                Global.garageArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextGround))) {
                Global.groundArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextGround).text.toString().toInt()
            } else {
                Global.groundArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextUpper))) {
                Global.upperArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextUpper).text.toString().toInt()
            } else {
                Global.upperArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextLower))) {
                Global.lowerArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextLower).text.toString().toInt()
            } else {
                Global.lowerArray[currentCaseNum] = 0
            }
            println("City: " + Global.cityArray[currentCaseNum])
            println("Lot Size: " +Global.lotSizeArray[currentCaseNum])
            println("Garage: " +Global.garageArray[currentCaseNum])
            println("Ground: " +Global.groundArray[currentCaseNum])
            println("Upper: " +Global.upperArray[currentCaseNum])
            println("Lower: " +Global.lowerArray[currentCaseNum])

            if(view.findViewById<RadioButton>(R.id.radioButtonOneStory).isChecked){

                Global.rearOneArray[currentCaseNum] = true
                Global.rearTwoArray[currentCaseNum] = false
                Global.existingOneArray[currentCaseNum] = false
                println(Global.rearOneArray[currentCaseNum])
            } else if(view.findViewById<RadioButton>(R.id.radioButtonTwoStory).isChecked){
                Global.rearTwoArray[currentCaseNum] = true
                Global.existingOneArray[currentCaseNum] = false
                Global.rearOneArray[currentCaseNum] = false
                println(Global.rearOneArray[currentCaseNum])
            } else if(view.findViewById<RadioButton>(R.id.radioButtonExOneStory).isChecked){
                Global.existingOneArray[currentCaseNum] = true
                Global.rearTwoArray[currentCaseNum] = false
                Global.rearOneArray[currentCaseNum] = false
                println(Global.existingOneArray[currentCaseNum])
            }

                findNavController().navigate(R.id.action_SecondFragment_to_fragment_SecondSec)
        }
    }
}

fun isEmpty(etText: EditText): Boolean {
    return if (etText.text.toString().trim { it <= ' ' }.length > 0) false else true
}
package com.example.finalproject_tersting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment_SecondSec : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__second_sec, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var serviceCharge = 0
        var currentCaseNum = 0
        for(i in 0..4){
            if(Global.existArray[i] == false){
                currentCaseNum = i
                break
            }
        }
        view.findViewById<Button>(R.id.button_Submit).setOnClickListener {
            if(!isEmpty(view.findViewById(R.id.editTextBedroom))) {
                Global.bedroomArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextBedroom).text.toString().toInt()
            } else {
                Global.bedroomArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextKitchen))) {
                Global.kitchenArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextKitchen).text.toString().toInt()
            } else {
                Global.kitchenArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextLaundry))) {
                Global.laundryArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextLaundry).text.toString().toInt()
            } else {
                Global.laundryArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextLivingRoom))) {
                Global.livingroomArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextLivingRoom).text.toString().toInt()
            } else {
                Global.livingroomArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextDinningRoom))) {
                Global.dinningroomArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextDinningRoom).text.toString().toInt()
            } else {
                Global.dinningroomArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextBathroom))) {
                Global.bathroomArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextBathroom).text.toString().toInt()
            } else {
                Global.bathroomArray[currentCaseNum] = 0
            }
            if(!isEmpty(view.findViewById(R.id.editTextOthers))) {
                Global.othersArray[currentCaseNum] = view.findViewById<EditText>(R.id.editTextOthers).text.toString().toInt()
            } else {
                Global.othersArray[currentCaseNum] = 0
            }


            //------------------------
            if(view.findViewById<CheckBox>(R.id.radio_Asbuilt).isChecked){
                Global.asbuiltArray[currentCaseNum] = true
                serviceCharge = (serviceCharge + 0.1).toInt()
                println("radio_Asbuilt is check")
            }
            if(view.findViewById<CheckBox>(R.id.radio_Design).isChecked){
                Global.designArray[currentCaseNum] = true
                serviceCharge = (serviceCharge + 0.1).toInt()
                println("radio_Design is check")
            }
            if(view.findViewById<CheckBox>(R.id.radio_3D).isChecked){
                Global.threedArray[currentCaseNum] = true
                serviceCharge = (serviceCharge + 0.1).toInt()
                println("radio_3D is check")
            }
            if(view.findViewById<CheckBox>(R.id.radio_Mech).isChecked){
                Global.mechArray[currentCaseNum] = true
                serviceCharge = (serviceCharge + 0.1).toInt()
                println("radio_Mech is check")
            }
            if(view.findViewById<CheckBox>(R.id.radio_Elec).isChecked){
                Global.elecArray[currentCaseNum] = true
                serviceCharge = (serviceCharge + 0.1).toInt()
                println("radio_Elec is check")
            }
            if(view.findViewById<CheckBox>(R.id.radio_Calgreen).isChecked){
                Global.calgreenArray[currentCaseNum] = true
                serviceCharge = (serviceCharge + 0.1).toInt()
                println("radio_Calgreen is check")
            }




            var sampleTotal = Global.lotSizeArray[currentCaseNum].toDouble()*0.55 *5.75 *(1+serviceCharge)*1.12312312
            println(sampleTotal)
            Global.totalArray[currentCaseNum] = sampleTotal
            println(Global.totalArray[currentCaseNum])


            findNavController().navigate(R.id.action_fragment_SecondSec_to_fragment_Preview)
        }


    }
}


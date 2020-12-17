package com.example.finalproject_tersting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_tersting.data.caseItem

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Fragment_Admin : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__admin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val castItems = ArrayList<caseItem>()
        for(i in 0..4){
            if(Global.existArray[i] == true){
                castItems.add(caseItem(Global.idArray[i], Global.totalArray[i]))
            }
        }


        view.findViewById<RecyclerView>(R.id.admin_list).apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = caseAdapter(castItems)
        }

    }
}
package com.example.finalproject_tersting

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject_tersting.data.caseItem


class caseAdapter(val caseItems : List<caseItem>) : RecyclerView.Adapter<caseAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.case_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = caseItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val caseItem = caseItems[position]
        holder.bind(caseItem)

    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun bind(caseItem: caseItem) {
            itemView.findViewById<TextView>(R.id.textCase).text = "Case#" + caseItem.caseID.toString()
            //itemView.findViewById<Button>(R.id.button_Detail).id = caseItem.caseID.toInt()
            //var buttonID = itemView.findViewById<Button>(R.id.button_Detail)
            when {
                caseItem.caseID.toInt() == 1 -> {
                    itemView.findViewById<Button>(R.id.button_Detail).setOnClickListener(
                        Navigation.createNavigateOnClickListener(R.id.action_fragment_Admin_to_fragment_case1)
                    )
                }
                caseItem.caseID.toInt() == 2 -> {
                    itemView.findViewById<Button>(R.id.button_Detail).setOnClickListener(
                        Navigation.createNavigateOnClickListener(R.id.action_fragment_Admin_to_fragment_case2)
                    )
                }
                caseItem.caseID.toInt() == 3 -> {
                    itemView.findViewById<Button>(R.id.button_Detail).setOnClickListener(
                        Navigation.createNavigateOnClickListener(R.id.action_fragment_Admin_to_fragment_case3)
                    )
                }
                caseItem.caseID.toInt() == 4 -> {
                    itemView.findViewById<Button>(R.id.button_Detail).setOnClickListener(
                        Navigation.createNavigateOnClickListener(R.id.action_fragment_Admin_to_fragment_case4)
                    )
                }
                caseItem.caseID.toInt() == 5 -> {
                    itemView.findViewById<Button>(R.id.button_Detail).setOnClickListener(
                        Navigation.createNavigateOnClickListener(R.id.action_fragment_Admin_to_fragment_case5)
                    )
                }
            }


        }
    }
}


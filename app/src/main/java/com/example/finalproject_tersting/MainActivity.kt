package com.example.finalproject_tersting

import android.app.Application
import android.icu.number.IntegerWidth
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem


var numberArray = arrayOf("a","b","c")

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}

class Global : Application() {
    companion object {
        @JvmField
        val idArray = arrayOf(1, 2, 3, 4, 5)
        val existArray = arrayOf(true, false, true, false, false)
        val cityArray = arrayOf("null", "null", "null", "null", "null")
        val lotSizeArray = arrayOf(0, 0, 0, 0, 0)
        val garageArray = arrayOf(0, 0, 0, 0, 0)
        val groundArray = arrayOf(0, 0, 0, 0, 0)
        val upperArray = arrayOf(0, 0, 0, 0, 0)
        val lowerArray = arrayOf(0, 0, 0, 0, 0)
        val rearOneArray = arrayOf(false, false, false, false, false)
        val rearTwoArray = arrayOf(false, false, false, false, false)
        val existingOneArray = arrayOf(false, false, false, false, false)

        // second page

        val bedroomArray = arrayOf(0, 0, 0, 0, 0)
        val kitchenArray = arrayOf(0, 0, 0, 0, 0)
        val laundryArray = arrayOf(0, 0, 0, 0, 0)
        val livingroomArray = arrayOf(0, 0, 0, 0, 0)
        val dinningroomArray = arrayOf(0, 0, 0, 0, 0)
        val bathroomArray = arrayOf(0, 0, 0, 0, 0)
        val othersArray = arrayOf(0, 0, 0, 0, 0)

        val asbuiltArray = arrayOf(false, false, false, false, false)
        val designArray = arrayOf(false, false, false, false, false)
        val threedArray = arrayOf(false, false, false, false, false)
        val mechArray = arrayOf(false, false, false, false, false)
        val elecArray = arrayOf(false, false, false, false, false)
        val calgreenArray = arrayOf(false, false, false, false, false)

        val totalArray = arrayOf(5.00, 4.00, 3.00, 2.00, 1.00)




    }
}
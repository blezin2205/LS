package com.example.labixsupplies

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_new_detail)

        val nameOfDevice = intent.getStringExtra("detail")
        Log.i("1", nameOfDevice.toString())
        Toast.makeText(this, "Scan result: ${nameOfDevice}", Toast.LENGTH_LONG).show()
    }

}
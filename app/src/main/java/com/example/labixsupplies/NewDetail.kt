package com.example.labixsupplies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class NewDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_detail)

        val nameOfDevice = intent.getStringExtra("detail")
        Log.i("1", nameOfDevice.toString())
        Toast.makeText(this, "Scan result: ${nameOfDevice}", Toast.LENGTH_LONG).show()
    }
}
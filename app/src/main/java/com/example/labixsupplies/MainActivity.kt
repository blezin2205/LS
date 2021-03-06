package com.example.labixsupplies

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.labixsupplies.fragments.CameraFragment
import com.example.labixsupplies.fragments.ListFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.devices.*


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        println("Hello")
    }


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cameraFragment = CameraFragment()
        var listFragment = ListFragment()

        setCurrentFragment(cameraFragment)


        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_list -> setCurrentFragment(listFragment)
                R.id.ic_camera -> setCurrentFragment(cameraFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

    fun basicAlert(view: MainActivity) {

        val builder = AlertDialog.Builder(this)

        with(builder)
        {
            setTitle("Androidly Alert")
            setMessage("We have a message")
            setPositiveButton("OK", DialogInterface.OnClickListener(function = positiveButtonClick))

            show()
        }


    }



}
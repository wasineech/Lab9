package com.example.csitgis.lab9_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val rev = intent.extras.getParcelable(MainActivity.data) as Student

        showid.text = "ID : ${rev.id}"
        showfirst.text = "FirstName : ${rev.firstname}"
        showlast.text = "LastName : ${rev.lastname}"
    }
}

package com.example.csitgis.lab9_kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        val data = "DataStudent"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            val intent = Intent(this,Main2Activity::class.java)
            val dataStudent = Student(id.text.toString(), first.text.toString(),last.text.toString())

            intent.putExtra(data,dataStudent)
            startActivity(intent)
        }
    }
}

package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnshowtoast.setOnClickListener {
            Log.i("MainActivity", "Bottom was clicked")
            Toast.makeText(this,"Bottom was clicked",Toast.LENGTH_SHORT).show()
        }

    }

}

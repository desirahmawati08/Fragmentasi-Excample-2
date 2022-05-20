package com.example.fragmentasiexcample2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), Coordinator {

    lateinit var fragBookDescription: BookDescription
    lateinit var fragBookTitle: BookTitles

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragBookTitle = BookTitles()
        fragBookDescription = BookDescription()
        val fragTransaction = supportFragmentManager.beginTransaction()
        fragTransaction.add(R.id.fragtop, fragBookTitle)
        fragTransaction.add(R.id.fragbottom, fragBookDescription)
        fragTransaction.commit()
    }

    override fun onBookChanged(index:Int) {
        fragBookDescription.changeDescription(index)
    }
}
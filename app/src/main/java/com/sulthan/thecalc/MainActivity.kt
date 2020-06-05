package com.sulthan.thecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        key_00.setOnClickListener { output_layout.addItem("00") }
        key_0.setOnClickListener { output_layout.addItem("0") }
        key_1.setOnClickListener { output_layout.addItem("1") }
        key_2.setOnClickListener { output_layout.addItem("2") }
        key_3.setOnClickListener { output_layout.addItem("3") }
        key_4.setOnClickListener { output_layout.addItem("4") }
        key_5.setOnClickListener { output_layout.addItem("5") }
        key_6.setOnClickListener { output_layout.addItem("6") }
        key_7.setOnClickListener { output_layout.addItem("7") }
        key_8.setOnClickListener { output_layout.addItem("8") }
        key_9.setOnClickListener { output_layout.addItem("9") }
        key_percent.setOnClickListener { output_layout.addItem("%") }

        key_clear.setOnClickListener { output_layout.clear() }
        key_remove.setOnClickListener { output_layout.removeItem() }
        key_equal.setOnClickListener { output_layout.solve() }

        key_add.setOnClickListener { output_layout.addItem("+") }
        key_minus.setOnClickListener { output_layout.addItem("-") }
        key_multiply.setOnClickListener { output_layout.addItem("*") }
        key_divide.setOnClickListener { output_layout.addItem("/") }
    }
}
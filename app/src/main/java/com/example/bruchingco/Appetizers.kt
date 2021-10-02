package com.example.bruchingco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
//import kotlinx.android.synthetic.main.activity_main.*

class Appetizers : AppCompatActivity() {
    private lateinit var dishAdapter: DishAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appetizers)
        dishAdapter = DishAdapter(mutableListOf())

        rvDish.adapter = dishAdapter
        rvDish.layoutManager = LinearLayoutManager(this)

        btnAddDish.setOnClickListener{  // funziona
            val todoTitle = etDishTitle.text.toString()
            if(todoTitle.isNotEmpty()){
                val dish = Dish(dishTitle)
                dishAdapter.addDish(dish)
                etDishTitle.text.clear()
            }
        }
    }
}
package com.example.bruchingco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//import kotlinx.android.synthetic.main.activity_main.*

class Appetizers : AppCompatActivity() {
    private lateinit var dishAdapter: DishAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appetizers)
        dishAdapter = DishAdapter(mutableListOf())

        val btnAddDish = findViewById<Button>(R.id.btnAddDish)
        val rvDish = findViewById<RecyclerView>(R.id.rvDish)
        val tvDish = findViewById<TextView>(R.id.tvDish)

        //val etDishQuantity = findViewById<EditText>(R.id.etQuantity)
        val etDishTitle = findViewById<EditText>(R.id.etDishTitle)

        rvDish.adapter = dishAdapter
        rvDish.layoutManager = LinearLayoutManager(this)

        btnAddDish.setOnClickListener{  // funziona
            val dishTitle = etDishTitle.text.toString()
            //val dishQuantity = etDishQuantity.text.toString().toInt()
            if(dishTitle.isNotEmpty()){
                val dish = Dish(dishTitle) // Puoi passare anche QUANTITY
                //val dishQ = Dish(dishQuantity)

                dishAdapter.addDish(dish)
                etDishTitle.text.clear()
            }
        }
    }
}
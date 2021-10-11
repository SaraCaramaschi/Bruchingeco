package com.example.bruchingco

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DishAdapter (private val dishes: MutableList<Dish> ) :
    RecyclerView.Adapter<DishAdapter.DishViewHolder>() {
    class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
        return DishViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_dish,
                parent,
                false
            )
        )
    }

    fun addDish(dish: Dish) {
        dishes.add(dish)
        notifyItemInserted(dishes.size - 1)
    }

    override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
        val curDish = dishes[position]
        val curDishTvDish = holder.itemView.findViewById<TextView>(R.id.tvDish)

        // var curDishQuantity = holder.itemView.findViewById<EditText>(R.id.etQuantity).getText().toString().toInt()
            holder.itemView.apply {
            curDishTvDish.text = curDish.name
            //curDishQuantity = curDish.quantity
        }
    }

    override fun getItemCount(): Int {
        return dishes.size
    }
}

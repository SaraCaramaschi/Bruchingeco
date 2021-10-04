package com.example.bruchingco

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DishAdapter (private val dishes: MutableList<Dish> ) :
    RecyclerView.Adapter<DishAdapter.DishViewHolder>()
    {
        class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder{
            return DishViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_dish,
                    parent,
                    false
                )
            )
        }

        fun addDish(dish:Dish){
            dishes.add(dish)
            notifyItemInserted(dishes.size - 1)
        }

        override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
            val curDish = dishes[position]
            holder.itemView.apply {
                tvDish.text = curDish.name
            }
        }

        override fun getItemCount(): Int {
            return dishes.size
        }

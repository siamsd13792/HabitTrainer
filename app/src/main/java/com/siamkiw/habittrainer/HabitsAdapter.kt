package com.siamkiw.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_card.view.*

class HabitsAdapter(val habit: List<Habit>) : RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {

    class HabitViewHolder(val card: View): RecyclerView.ViewHolder(card)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    //specifies the content for the shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, index: Int) {
        if (holder != null){
            holder.card.tv_title.text = habit[index].title
            holder.card.tv_description.text = habit[index].description
            holder.card.iv_icon.setImageResource(habit[index].image)
        }
    }

    override fun getItemCount(): Int {
        return habit.size
    }
}
package com.siamkiw.habittrainer

data class Habit(val title: String, val description: String, val image: Int)

fun getSampleHabits(): List<Habit> {
    return listOf(
            Habit(
                    title = "Go for a walk",
                    description = "A nice walk in the sun get you ready for the day ahead",
                    image = R.drawable.walk
            ),
            Habit(
                    title = "Drink a glass of water",
                    description = "A refreshing glass of water get your hydrated",
                    image = R.drawable.water

            )
    )
}
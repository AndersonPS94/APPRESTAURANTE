package com.example.appderestaurante

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appderestaurante.adapter.FoodAdapter
import com.example.appderestaurante.databinding.ActivityMainBinding
import com.example.appderestaurante.model.food

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFood: RecyclerView = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this, foodList)
        recyclerViewFood.adapter = foodAdapter
        getFood()
    }

    private fun getFood(){
        val food1 = food(
            imgfood = R.drawable.food1,
            foodName = "Food 1",
            foodDescription ="lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut",
            price ="$ 120.00",
        )
        foodList.add(food1)

        val food2 = food(
            imgfood = R.drawable.food2,
            foodName = "Food 2",
            foodDescription ="lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut",
            price ="$ 80.00",
        )
        foodList.add(food2)

        val food3 = food(
            imgfood = R.drawable.food3,
            foodName = "Food 3",
            foodDescription ="lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut",
            price ="$ 75.00",
        )
        foodList.add(food3)

        val food4 = food(
            imgfood = R.drawable.food4,
            foodName = "Food 4",
            foodDescription ="lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut",
            price ="$ 45.00",
        )
        foodList.add(food4)

        val food5 = food(
            imgfood = R.drawable.food5,
            foodName = "Food 5",
            foodDescription ="lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut",
            price ="$ 50.00",
        )
        foodList.add(food5)
    }
}
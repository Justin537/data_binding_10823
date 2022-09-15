package com.example.data_binding_10823

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

object FakeRepository {
    private val fruitNames: List<String> = listOf(
        "Apel", "Mangga", "Pisang", "Anggur", "Strobery", "Jambu", "Pir", "Kiwi", "Rasberi", "bambu"
    )

    private val _currentRandomFruitName= MutableLiveData<String>()
    val currentRandomFruitName: LiveData<String>
        get() = _currentRandomFruitName

    init {
        _currentRandomFruitName.value= fruitNames.first()
    }

    fun getRandomFruitName():String{
        val random= Random.nextInt(fruitNames.size)
        return fruitNames[random]
    }

    fun changeCurrentRandomFruitName(){
        _currentRandomFruitName.value= getRandomFruitName()
    }
}
package com.example.easyfood.data.api

import com.example.easyfood.data.model.MealList
import com.example.easyfood.utils.Resource

interface ApiHelper {
    suspend fun getMealList() : Resource<MealList>

}
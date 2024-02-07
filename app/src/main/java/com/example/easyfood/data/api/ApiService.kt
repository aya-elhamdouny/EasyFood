package com.example.easyfood.data.api

import com.example.easyfood.data.model.MealList
import com.example.easyfood.utils.Resource
import retrofit2.http.GET

interface ApiService {

    @GET("random.php")
    suspend fun getMealList() : Resource<MealList>
}
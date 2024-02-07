package com.example.easyfood.data.api

import com.example.easyfood.data.model.MealList
import com.example.easyfood.utils.Resource
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {

    override suspend fun getMealList(): Resource<MealList> = apiService.getMealList()
}
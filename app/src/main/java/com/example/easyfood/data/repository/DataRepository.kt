package com.example.easyfood.data.repository

import com.example.easyfood.data.api.ApiHelper
import javax.inject.Inject

class DataRepository @Inject constructor(private  val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getMealList()


}
package com.example.easyfood.utils

import com.example.easyfood.data.model.MealList

data class Resource<out T>(val status: Status , val data: T ,var message : String? ){

    companion object{

        fun <T>success(data : T?): Resource<T?> {
            return Resource(status = Status.SUCCESS , data , null)
        }

        fun <T>error(msg : String? , data : T?) : Resource<T?>{
            return  Resource(status = Status.ERROR ,data , msg )
        }

        fun <T>loading(data : T?) : Resource<T?>{
            return  Resource(status = Status.LOADING ,data , null)
        }

    }


}

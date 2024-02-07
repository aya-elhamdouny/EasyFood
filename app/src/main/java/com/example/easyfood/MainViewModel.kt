package com.example.easyfood

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.easyfood.data.model.MealList
import com.example.easyfood.data.repository.DataRepository
import com.example.easyfood.utils.Resource
import com.example.easyfood.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repo : DataRepository) : ViewModel() {

    private val _mealList = MutableLiveData<MealList>()
    val mealList: LiveData<MealList>
        get() = _mealList
init {
    getData()
}

    private fun getData(){

        viewModelScope.launch {
            repo.getUsers().let {
                if (it.status == Status.SUCCESS) {
                    _mealList.postValue(it.data)
                }else _mealList.postValue(null)
            }

        }


    }


}
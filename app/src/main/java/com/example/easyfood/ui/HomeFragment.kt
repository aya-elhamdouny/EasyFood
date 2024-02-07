package com.example.easyfood.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.easyfood.MainViewModel
import com.example.easyfood.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val mainViewModel : MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp();
    }

    private  fun setUp(){
        mainViewModel.mealList.observe(this ,   Observer {
        Log.d("AYA" , it.toString())

        } )




    }



}

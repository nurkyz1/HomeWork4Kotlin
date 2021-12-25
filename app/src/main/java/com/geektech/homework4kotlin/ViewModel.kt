package com.geektech.homework4kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var mCounter = 0
    val counter = MutableLiveData<Int?>()
    val action = MutableLiveData<String>()
    private var mAction: String = ""

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
        mAction += "incremented \n"
        action.value = mAction
    }

    fun onDecrementClick() {
        mCounter--
        counter.value = mCounter
        mAction += "Decremented \n"
        action.value = mAction
    }

}
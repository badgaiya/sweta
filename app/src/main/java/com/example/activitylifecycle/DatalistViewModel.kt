package com.example.activitylifecycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class DatalistViewModel : ViewModel() {

    lateinit var mRepo: ListViewResposatory

    init {
        mRepo = ListViewResposatory()
    }

    fun callDataLIst(): LiveData<DataListModelResponse?> {
        return mRepo.callDataLIst()
    }



}
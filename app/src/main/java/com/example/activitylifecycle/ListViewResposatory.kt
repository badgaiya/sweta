package com.example.activitylifecycle

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import network.AppRetrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListViewResposatory {

    fun callDataLIst(): LiveData<DataListModelResponse?> {
        val data = MutableLiveData<DataListModelResponse?>()
        AppRetrofit.instance.callListData()
            .enqueue(object : Callback<DataListModelResponse?> {
                override fun onFailure(call: Call<DataListModelResponse?>, t: Throwable) {
                    data.value = null
                }

                override fun onResponse(
                    call: Call<DataListModelResponse?>,
                    response: Response<DataListModelResponse?>
                ) {

                    data.value =
                        if (response != null && response.body() != null) response!!.body() else null

                    Log.d("asdfzxc",response.toString())




                }
            })

        return data
    }

}
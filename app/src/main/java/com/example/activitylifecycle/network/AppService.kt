package network


import com.example.activitylifecycle.DataListModelResponse

import retrofit2.Call
import retrofit2.http.*


/**
 * Created by Avnish on 05-oct-2020.
 */
interface AppService {



    @GET(NetworkConstants.DATA)
    fun callListData(): Call<DataListModelResponse?>




}


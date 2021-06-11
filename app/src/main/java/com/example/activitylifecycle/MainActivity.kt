package com.example.activitylifecycle
import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.activitylifecycle.databinding.ActivityMainBinding
import com.rsdigitech.dreamnplay.utils.Utility

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    val mContext by lazy { this@MainActivity }

    lateinit var searcuserAdapter: ListDataAdapter
    //  var mylist: ArrayList<Int> = ArrayList()
    private var users: List<DataListModelResponse>? = null

    //   private var users: ArrayList<SearchUserResponse.Data.User> = ArrayList()

    // lateinit var name: String
    val mViewModel by lazy { ViewModelProviders.of(mContext).get(DatalistViewModel::class.java) }

    override fun initUI() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        callDataList()


    }

    private fun callDataList() {

        showLoadingView(
            true,
            binding.loadingView.loadingIndicator,
            binding.loadingView.container
        )

        mViewModel.callDataLIst(

        ).observe(this, object : Observer<DataListModelResponse?> {
            override fun onChanged(dataListModelResponse: DataListModelResponse?) {

                showLoadingView(
                    false,
                    binding.loadingView.loadingIndicator,
                    binding.loadingView.container
                )
                if (dataListModelResponse != null) {

                   /* if (searchUserResponse.status && searchUserResponse.data != null) {*/

                        if (dataListModelResponse.size > 0) {



                            searcUserAdapter(dataListModelResponse)


                        }
                  /*  }*/
                } else {
                   // Utility.showServerErrorSnackBar(binding.root)
                }
            }
        })

    }
    @SuppressLint("WrongConstant")
    fun searcUserAdapter(users: List<DataListModelResponse.DataListModelResponseItem>) {
//        if (!::upcomingAdapter.isInitialized) {
        val layoutManager = LinearLayoutManager(mContext, LinearLayout.VERTICAL, false)
        val recyclerView = binding.mRecyclerView
        recyclerView.layoutManager = layoutManager
        searcuserAdapter = ListDataAdapter(mContext, users)
        // upcomingAdapter.setViewCallback(this)
        recyclerView.adapter = searcuserAdapter

//        }

    }

}




package com.example.activitylifecycle

import android.content.Context
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

import com.rsdigitech.dreamnplay.utils.Utility


open abstract class BaseActivity : AppCompatActivity(), BaseInterface {
    val TAG_MESSAGE = "OkHttp"
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT


        initUI()

    }

    fun setToolbar(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
    }

    fun setToolbarWithBackIcon(toolbar: Toolbar, title: String) {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = title
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun setToolbarWithBackIconWithSubTitle(toolbar: Toolbar, title: String, subTitle: String) {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = title
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.subtitle = subTitle
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }


    fun setToolbarWithBackIconSubTitle(toolbar: Toolbar, subTitle: String) {
        setSupportActionBar(toolbar)
        supportActionBar!!.subtitle = subTitle
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    fun setBackIcon(toolbar: Toolbar) {
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }



    fun showLoadingView(
        show: Boolean,
        loadingView: ProgressBar,
        view: View
    ) {
        if (show) {
            loadingView.visibility = View.VISIBLE
            view.visibility = View.VISIBLE
        } else {
            loadingView.visibility = View.GONE
            view.visibility = View.GONE
        }

    }



    fun showToastmssg(context: Context, msg: String) {

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()

    }


//    override fun onResume() {
//        super.onResume()
//        Alerts.register(this)
//    }
//
//    override fun onPause() {
//        Alerts.unregister(this)
//        super.onPause()
//    }

}

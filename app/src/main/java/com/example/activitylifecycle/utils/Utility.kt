package com.rsdigitech.dreamnplay.utils

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.ConnectivityManager
import android.os.Environment
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar
 import org.json.JSONException
import org.json.JSONTokener
import java.io.File
import java.math.BigDecimal
import java.text.DateFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

class Utility {
    companion object {


        fun setImageViaGlide(
            placeholderId: Int,
            imageUrl: String,
            imgVw: ImageView,
            mContext: Context
        ) {
            if (!TextUtils.isEmpty(imageUrl) && imgVw != null) {
                val requestOptions: RequestOptions =
                    RequestOptions().placeholder(placeholderId).error(placeholderId)
                        .fallback(placeholderId)
                        .diskCacheStrategy(
                            DiskCacheStrategy.ALL
                        )
                Glide.with(mContext).load(imageUrl).apply(requestOptions).into(imgVw)
            }
        }

        fun startActivityWithLeftToRightAnimationContext(ctx: Context?, `in`: Intent?) {
            if (ctx != null && `in` != null) {
                ctx.startActivity(`in`)
            }
        }


    }
}
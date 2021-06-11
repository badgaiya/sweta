package com.accountapp.accounts.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

object Prefences {

    val SHARED_PREF_NAME = "preferences_name"

    lateinit var userId: SharedPreferences
    lateinit var parentId: SharedPreferences
    lateinit var userType: SharedPreferences
    lateinit var balance: SharedPreferences
    lateinit var winningBalance: SharedPreferences
    lateinit var isLogin: SharedPreferences
//    lateinit var isBalance: SharedPreferences
    lateinit var isExpBalance: SharedPreferences
    lateinit var userName: SharedPreferences
    lateinit var username: SharedPreferences
    lateinit var name: SharedPreferences
    lateinit var nameteama: SharedPreferences
    lateinit var nameteamacount: SharedPreferences
    lateinit var nameteamab: SharedPreferences
    lateinit var nameteamabcount: SharedPreferences
    lateinit var nameupdate: SharedPreferences
     lateinit var token: SharedPreferences
    lateinit var userMobile: SharedPreferences
    lateinit var userEmailId: SharedPreferences
    lateinit var userImage: SharedPreferences
    lateinit var userImage_: SharedPreferences
    lateinit var userImage__: SharedPreferences
    lateinit var referralCode: SharedPreferences

    var USER_ID = "USER_ID"
    var IS_LOGIN = "IS_LOGIN"
    var USER_TYPE = "USER_TYPE"
    var PARENT_ID = "PARENT_ID"
    var IS_BALANCE = "IS_BALANCE"
    var IS_EXP_BAL = "IS_EXP_BAL"
    var USER_NAME = "USER_NAME"
    var USERNAME = "USERNAME"
    var NAME = "NAME"
    var NAMEA = "NAMEA"
    var NAMEB = "NAMEB"
    var NAMEACOUNT = "NAMEACOUNT"
    var NAMEBCOUNT = "NAMEBCOUNT"
    var NAMEUPDATE = "NAMEUPDATE"
     var TOKEN = "TOKEN"
    var USER_MOBILE = "USER_MOBILE"
    var USER_EMAIL_ID = "USER_EMAIL_ID"
    var USER_IMAGE = "USER_IMAGE"
    var USER_IMAGEE = "USER_IMAGEE"
    var USER_IMAGEEE = "USER_IMAGEEE"
    var USER_IMAGE_A = "USER_IMAGE_A"
    var USER_IMAGE_B = "USER_IMAGE_B"
    var REFERAL_CODE = "REFERAL_CODE"
    var BALANCE = "BALANCE"
    var WINING_BALANCE = "WINING_BALANCE"
    var Team_Name = "Team_Name"


    @JvmStatic
    fun resetUserData(ctx: Context){
        setIsLogin(ctx,false)
        setUserId(ctx,"")
        setUserEmailId(ctx,"")
        setUserMobile(ctx,"")
        setReferralCode(ctx,"")
        setUserName(ctx,"")
        setToken(ctx,"")
        setNameupdate(ctx,"")
        setUsername(ctx,"")
    }


    fun setIsExpBal(context: Context, iss: Boolean) {
        isExpBalance = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = isExpBalance.edit()
        editor.putBoolean(IS_EXP_BAL, iss)
        editor.commit()
    }

    @JvmStatic
    fun getIsExpBal(context: Context): Boolean {
        isExpBalance = PreferenceManager.getDefaultSharedPreferences(context)
        return isExpBalance.getBoolean(IS_EXP_BAL, true)
    }




    // pref is Login
    @JvmStatic
    fun setIsLogin(context: Context, iss: Boolean) {
        isLogin = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = isLogin.edit()
        editor.putBoolean(IS_LOGIN, iss)
        editor.commit()
    }

    @JvmStatic
    fun getIsLogin(context: Context): Boolean {
        isLogin = PreferenceManager.getDefaultSharedPreferences(context)
        return isLogin.getBoolean(IS_LOGIN, false)
    }


//
//    // pref teamname
//    @JvmStatic
//    fun setteamname(context: Context, `is`: String) {
//        userId = PreferenceManager.getDefaultSharedPreferences(context)
//        val editor = userId.edit()
//        editor.putString(Team_Name, `is`)
//        editor.commit()
//    }
//
//    @JvmStatic
//    fun getteamName(context: Context?): String? {
//        userId = PreferenceManager.getDefaultSharedPreferences(context)
//        return userId.getString(Team_Name, "")
//    }






    // pref UserId
    @JvmStatic
    fun setUserId(context: Context, `is`: String) {
        userId = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userId.edit()
        editor.putString(USER_ID, `is`)
        editor.commit()
    }

    @JvmStatic
    fun getUserId(context: Context?): String? {
        userId = PreferenceManager.getDefaultSharedPreferences(context)
        return userId.getString(USER_ID, "")
    }


//    ParentId
    @JvmStatic
    fun setParentId(context: Context, `is`: String) {
        parentId = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = parentId.edit()
        editor.putString(PARENT_ID, `is`)
        editor.commit()
    }

    fun getParentId(context: Context?): String? {
        parentId = PreferenceManager.getDefaultSharedPreferences(context)
        return parentId.getString(PARENT_ID, "")
    }

    @JvmStatic
    fun setUserBalance(context: Context, `is`: String) {
        balance = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = balance.edit()
        editor.putString(BALANCE, `is`)
        editor.commit()
    }

    fun getUserBalance(context: Context?): String? {
        balance = PreferenceManager.getDefaultSharedPreferences(context)
        return balance.getString(BALANCE, "")
    }

    @JvmStatic
    fun setWinningBalance(context: Context, `is`: String) {
        winningBalance = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = winningBalance.edit()
        editor.putString(WINING_BALANCE, `is`)
        editor.commit()
    }

    fun getWinningBalance(context: Context?): String? {
        winningBalance = PreferenceManager.getDefaultSharedPreferences(context)
        return winningBalance.getString(WINING_BALANCE, "")
    }

    @JvmStatic
    fun setUserType(context: Context, `is`: String) {
        userType = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userType.edit()
        editor.putString(USER_TYPE, `is`)
        editor.commit()
    }

    fun getUserType(context: Context?): String? {
        userType = PreferenceManager.getDefaultSharedPreferences(context)
        return userType.getString(USER_TYPE, "")
    }

    // Token
    @JvmStatic
    fun setToken(context: Context, `is`: String) {
        token = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = token.edit()
        editor.putString(TOKEN, `is`)
        editor.commit()
    }
    @JvmStatic
    fun getToken(context: Context?): String? {
        token = PreferenceManager.getDefaultSharedPreferences(context)
        return token.getString(TOKEN, "")
    }

    // Name
    @JvmStatic
    fun setName(context: Context, `is`: String) {
        name = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = name.edit()
        editor.putString(NAME, `is`)
        editor.commit()
        editor.apply()
    }

    fun getName(context: Context?): String? {
        name = PreferenceManager.getDefaultSharedPreferences(context)
        return name.getString(NAME, "")
    }









    @JvmStatic
    fun setNameteama(context: Context, `is`: String) {
        nameteama = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = nameteama.edit()
        editor.putString(NAMEA, `is`)
        editor.commit()
        editor.apply()
    }


    fun getNameteama(context: Context?): String? {
        nameteama = PreferenceManager.getDefaultSharedPreferences(context)
        return nameteama.getString(NAMEA, "")
    }


    fun setNameteanB(context: Context, `is`: String ){
        nameteamab = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = nameteamab.edit()
        editor.putString(NAMEB, `is`)
        editor.commit()
        editor.apply()
    }


    fun getNameteamab(context: Context?): String? {
        nameteamab = PreferenceManager.getDefaultSharedPreferences(context)
        return nameteamab.getString(NAMEB, "")
    }


















@JvmStatic
    fun setTeamCountA(context: Context, `is`: String) {
    nameteamacount = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = nameteamacount.edit()
        editor.putString(NAMEACOUNT, `is`)
        editor.commit()
        editor.apply()
    }


    fun grtTeamCountA(context: Context?): String? {
        nameteamacount = PreferenceManager.getDefaultSharedPreferences(context)
        return nameteamacount.getString(NAMEACOUNT, "")
    }


    fun setTeamCountB(context: Context, `is`: String ){
        nameteamabcount = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = nameteamabcount.edit()
        editor.putString(NAMEBCOUNT, `is`)
        editor.commit()
        editor.apply()
    }


    fun getTeamCountB(context: Context?): String? {
        nameteamabcount = PreferenceManager.getDefaultSharedPreferences(context)
        return nameteamabcount.getString(NAMEBCOUNT, "")
    }





















    // Nameupdate

    @JvmStatic
    fun setNameupdate(context: Context, `is`: String) {
        nameupdate = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = nameupdate.edit()
        editor.putString(NAMEUPDATE, `is`)
        editor.commit()
    }

    fun getNameupdate(context: Context?): String? {
        nameupdate = PreferenceManager.getDefaultSharedPreferences(context)
        return nameupdate.getString(NAMEUPDATE, "")
    }







    // pref User Name
    @JvmStatic
    fun setUserName(context: Context, `is`: String) {
        userName = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userName.edit()
        editor.putString(USER_NAME, `is`)
        editor.commit()
    }

    fun getUserName(context: Context?): String? {
        userName = PreferenceManager.getDefaultSharedPreferences(context)
        return userName.getString(USER_NAME, "")
    }





    @JvmStatic
    fun setUsername(context: Context, `is`: String) {
        username = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = username.edit()
        editor.putString(USERNAME, `is`)
        editor.commit()

    }

    fun getUsername(context: Context?): String? {
        username = PreferenceManager.getDefaultSharedPreferences(context)
        return username.getString(USERNAME, "")
    }

    // pref User Mobile
    fun setUserMobile(context: Context, `is`: String) {
        userMobile = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userMobile.edit()
        editor.putString(USER_MOBILE, `is`)
        editor.commit()
    }

    fun getUserMobile(context: Context): String? {
        userMobile = PreferenceManager.getDefaultSharedPreferences(context)
        return userMobile.getString(USER_MOBILE, "")
    }


    // pref User MobilReferral Code
    fun setReferralCode(context: Context, `is`: String) {
        referralCode = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = referralCode.edit()
        editor.putString(REFERAL_CODE, `is`)
        editor.commit()
    }

    fun getReferralCode(context: Context): String? {
        referralCode = PreferenceManager.getDefaultSharedPreferences(context)
        return referralCode.getString(REFERAL_CODE, "")
    }

    // pref User Email ID
    fun setUserEmailId(context: Context, `is`: String) {
        userEmailId = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userEmailId.edit()
        editor.putString(USER_EMAIL_ID, `is`)
        editor.commit()
    }

    fun getUserEmailId(context: Context): String? {
        userEmailId = PreferenceManager.getDefaultSharedPreferences(context)
        return userEmailId.getString(USER_EMAIL_ID, "")
    }

    // pref Image



    fun teamImageA(context: Context, `is`: String) {
        userImage = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userImage.edit()
        editor.putString(USER_IMAGE_A, `is`)
        editor.commit()
    }
    fun teamImageB(context: Context, `is`: String) {
        userImage = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userImage.edit()
        editor.putString(USER_IMAGE_B, `is`)
        editor.commit()
    }


    fun getImageA(context: Context): String? {
        userImage = PreferenceManager.getDefaultSharedPreferences(context)
        return userImage.getString(USER_IMAGE_A, "")
    }


    fun getImageB(context: Context): String? {
        userImage = PreferenceManager.getDefaultSharedPreferences(context)
        return userImage.getString(USER_IMAGE_B, "")
    }

    fun setUserImage(context: Context, `is`: String) {
        userImage_ = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userImage_.edit()
        editor.putString(USER_IMAGEE, `is`)
        editor.commit()
    }
    fun getUserImage(context: Context): String? {
        userImage_ = PreferenceManager.getDefaultSharedPreferences(context)
        return userImage_.getString(USER_IMAGEE, "")
    }
    fun setUserImagee(context: Context, `is`: String) {
        userImage__ = PreferenceManager.getDefaultSharedPreferences(context)
        val editor = userImage__.edit()
        editor.putString(USER_IMAGEEE, `is`)
        editor.commit()
    }

    fun getUserImagee(context: Context): String? {
        userImage__ = PreferenceManager.getDefaultSharedPreferences(context)
        return userImage__.getString(USER_IMAGEEE, "")
    }



}
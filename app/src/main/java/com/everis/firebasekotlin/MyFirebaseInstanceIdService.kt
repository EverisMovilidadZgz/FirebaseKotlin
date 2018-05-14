package com.everis.firebasekotlin

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {

    val TAG: String = "FCMPush"

    override fun onTokenRefresh() {
        val refreshedToken = FirebaseInstanceId.getInstance().token
        Log.d(TAG, "Token: $refreshedToken")
        sendRegistrationToServer(refreshedToken)
    }

    fun sendRegistrationToServer(refreshedToken: String?) {
        //TODO callWS
    }
}
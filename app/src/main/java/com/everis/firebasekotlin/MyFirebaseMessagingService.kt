package com.everis.firebasekotlin

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    val TAG = "FCM Received"

    override fun onMessageReceived(data: RemoteMessage?) {
        Log.d(TAG, "Push: ${data?.notification?.body}")
    }
}
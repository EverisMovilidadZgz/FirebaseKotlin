package com.everis.firebasekotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.iid.FirebaseInstanceId
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        obtainToken()
    }

    private fun obtainToken() {
        Thread(Runnable {
            var tokenFCM = FirebaseInstanceId.getInstance().token
            if(!tokenFCM.isNullOrEmpty()) {
                tokenText.text = tokenFCM
            }
        }).run()
    }
}

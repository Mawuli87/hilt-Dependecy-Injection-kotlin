package com.messieyawo.hilttutorials.network

import android.util.Log
import com.messieyawo.hilttutorials.app.TAG
import javax.inject.Inject

class MyAppNetworkAdapter @Inject constructor():NetworkAdapter {
    override fun log(message: String) {
        Log.d(TAG,"MyNetworkAdapter: $message")
    }
}
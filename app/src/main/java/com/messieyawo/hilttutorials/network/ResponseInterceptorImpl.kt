package com.messieyawo.hilttutorials.network

import android.util.Log
import com.messieyawo.hilttutorials.app.TAG
import javax.inject.Inject

class ResponseInterceptorImpl @Inject constructor(): Interceptor {
    override fun log(message: String) {
        Log.d(TAG,"This is a response interceptor : $message")
    }
}
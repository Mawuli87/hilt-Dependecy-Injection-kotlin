package com.messieyawo.hilttutorials.database

import android.util.Log
import com.messieyawo.hilttutorials.app.TAG
import javax.inject.Inject

class DatabaseService @Inject constructor(){
    fun log(message:String){
        Log.d(TAG,"Database service message : $message")
    }
}
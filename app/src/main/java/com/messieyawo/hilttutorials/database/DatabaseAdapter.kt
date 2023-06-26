package com.messieyawo.hilttutorials.database

import android.util.Log
import com.messieyawo.hilttutorials.app.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {
    fun log(message:String){
        Log.d(TAG,"Database Adapter: $message")
        databaseService.log(message)
    }
}
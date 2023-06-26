package com.messieyawo.hilttutorials

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.messieyawo.hilttutorials.app.TAG
import com.messieyawo.hilttutorials.database.DatabaseAdapter
import com.messieyawo.hilttutorials.database.DatabaseService
import com.messieyawo.hilttutorials.network.NetWorkService
import com.messieyawo.hilttutorials.network.NetworkAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var databaseAdapter: DatabaseAdapter
    @Inject lateinit var networkAdapter: NetworkAdapter
    //@Inject lateinit var netWorkService: NetWorkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"DatabaseAdapter : $databaseAdapter")
        databaseAdapter.log("Hello Hilt")

        networkAdapter.log("Interface binding : ")
       // netWorkService.performNetworkCall()

    }
    @Inject
    fun directToDatabase(databaseService: DatabaseService){
        databaseService.log("Method injection")
    }
}
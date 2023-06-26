package com.messieyawo.hilttutorials.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

const val TAG = "HILANDROIDDAGGER"

@HiltAndroidApp
class HiltTutorialApp : Application() {
}
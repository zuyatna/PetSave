package com.zuyatna.petsave

import android.app.Application
import java.util.logging.Logger

class PetSaveApplication: Application() {
    // initiate analytics, crashlytics, etc

    override fun onCreate() {
        super.onCreate()

        initLogger()
    }

    private fun initLogger() {

    }
}
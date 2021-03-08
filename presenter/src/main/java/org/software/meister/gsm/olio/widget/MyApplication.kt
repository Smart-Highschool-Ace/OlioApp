package org.software.meister.gsm.olio.widget

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.software.meister.gsm.olio.di.myModule

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@MyApplication)
            val modules = listOf(myModule)
            modules(modules)
        }
    }
}
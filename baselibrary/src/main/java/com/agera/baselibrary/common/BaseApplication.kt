package com.agera.baselibrary.common

import android.app.Application
import com.agera.baselibrary.injection.component.AppComponent
import com.agera.baselibrary.injection.component.DaggerAppComponent
import com.agera.baselibrary.injection.module.AppModule

/**
 * Created by Administrator on 2019/1/1.
 */
class BaseApplication : Application() {
    lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        mAppComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}
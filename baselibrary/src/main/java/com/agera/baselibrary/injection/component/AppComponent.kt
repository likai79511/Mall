package com.agera.baselibrary.injection.component

import android.content.Context
import com.agera.baselibrary.injection.module.AppModule
import dagger.Component

/**
 * Created by Administrator on 2019/1/1.
 */
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun getContext(): Context
}
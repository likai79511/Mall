package com.agera.baselibrary.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides

/**
 * Created by Administrator on 2019/1/1.
 */
@Module
class ActivityModule(val act: Activity) {

    @Provides
    fun providersActivity() = act
}
package com.agera.baselibrary.injection.module

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by Administrator on 2019/1/1.
 */
@Module
class AppModule(val ctx: Context) {
    @Provides
    fun providersContext() = ctx
}
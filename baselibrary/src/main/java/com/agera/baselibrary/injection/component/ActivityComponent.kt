package com.agera.baselibrary.injection.component

import android.app.Activity
import android.content.Context
import com.agera.baselibrary.injection.module.ActivityModule
import com.agera.baselibrary.ui.activity.BaseActivity
import dagger.Component

/**
 * Created by Administrator on 2019/1/1.
 */
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun getContext(): Context
    fun getActivity(): BaseActivity
    fun inject(act:BaseActivity)
}
package com.agera.baselibrary.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.agera.baselibrary.common.BaseApplication
import com.agera.baselibrary.injection.component.ActivityComponent
import com.agera.baselibrary.injection.component.DaggerActivityComponent

/**
 * Created by Administrator on 2018/12/27.
 */
open class BaseActivity : AppCompatActivity() {

    lateinit var mActivityComponent: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injection()
    }

    open fun injection() {
        mActivityComponent = DaggerActivityComponent.builder().appComponent((application as BaseApplication).mAppComponent).build()
    }
}
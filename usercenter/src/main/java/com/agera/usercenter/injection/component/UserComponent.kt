package com.agera.usercenter.injection.component

import com.agera.baselibrary.injection.component.ActivityComponent
import com.agera.usercenter.injection.module.RegisterModule
import dagger.Component

/**
 * Created by Administrator on 2019/1/1.
 */
@Component(dependencies = arrayOf(ActivityComponent::class),modules = arrayOf(RegisterModule::class))
interface UserComponent {
}
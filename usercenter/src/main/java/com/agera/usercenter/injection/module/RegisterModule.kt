package com.agera.usercenter.injection.module

import com.agera.usercenter.data.repository.UserRepository
import com.agera.usercenter.service.UserService
import com.agera.usercenter.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

/**
 * Created by Administrator on 2019/1/1.
 */
@Module
class RegisterModule {

    @Provides
    fun providersUserServices(): UserService = UserServiceImpl.instance

    fun providersUserRepository(): UserRepository = UserRepository.instance
}

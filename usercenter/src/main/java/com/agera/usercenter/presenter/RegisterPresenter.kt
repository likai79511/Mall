package com.agera.usercenter.presenter

import com.agera.baselibrary.presenter.BasePresenter
import com.agera.baselibrary.rx.BaseSubscribe1
import com.agera.usercenter.presenter.view.RegisterView
import com.agera.usercenter.service.UserService
import com.agera.usercenter.service.impl.UserServiceImpl
import javax.inject.Inject

/**
 * Created by Administrator on 2018/12/27.
 */
class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {

    @Inject
    lateinit var mService: UserService

    fun register(mobile: String, verifyCode: String, pwd: String) {
        mService.register(mobile, verifyCode, pwd)
                .subscribe(BaseSubscribe1<Boolean>({
                    mView.onRegistResult(it)
                }))
    }
}
package com.agera.usercenter.presenter

import com.agera.baselibrary.presenter.BasePresenter
import com.agera.usercenter.presenter.view.RegisterView

/**
 * Created by Administrator on 2018/12/27.
 */
class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String) {

        mView.onRegistResult(true)
    }
}
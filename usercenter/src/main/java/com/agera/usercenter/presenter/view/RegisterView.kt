package com.agera.usercenter.presenter.view

import com.agera.baselibrary.presenter.view.BaseView

/**
 * Created by Administrator on 2018/12/27.
 */
open interface RegisterView : BaseView {

    fun onRegistResult(success: Boolean)
}
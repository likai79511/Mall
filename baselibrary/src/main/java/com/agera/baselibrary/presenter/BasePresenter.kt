package com.agera.baselibrary.presenter

import com.agera.baselibrary.presenter.view.BaseView

/**
 * Created by Administrator on 2018/12/27.
 */
open class BasePresenter<T:BaseView> {
    lateinit var mView:T
}
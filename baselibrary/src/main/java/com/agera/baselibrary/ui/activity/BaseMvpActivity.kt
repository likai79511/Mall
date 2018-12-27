package com.agera.baselibrary.ui.activity

import com.agera.baselibrary.presenter.BasePresenter
import com.agera.baselibrary.presenter.view.BaseView

/**
 * Created by Administrator on 2018/12/27.
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(),BaseView {
    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }
}
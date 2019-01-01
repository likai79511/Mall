package com.agera.baselibrary.ui.activity

import android.os.Bundle
import com.agera.baselibrary.presenter.BasePresenter
import com.agera.baselibrary.presenter.view.BaseView
import javax.inject.Inject

/**
 * Created by Administrator on 2018/12/27.
 */
open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    @Inject
    lateinit var mPresenter: T

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivityComponent.inject(this)
    }
}
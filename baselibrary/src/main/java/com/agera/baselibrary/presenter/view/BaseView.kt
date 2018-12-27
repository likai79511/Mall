package com.agera.baselibrary.presenter.view

/**
 * Created by Administrator on 2018/12/27.
 */
interface BaseView {
    fun showLoading()

    fun hideLoading()

    fun onError()
}
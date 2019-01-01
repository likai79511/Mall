package com.agera.baselibrary.ext

import rx.Observable
import rx.android.schedulers.AndroidSchedulers

/**
 * Created by Administrator on 2019/1/1.
 */
fun <T> Observable<T>.network(): Observable<T> {
    return this.subscribeOn(rx.schedulers.Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
}
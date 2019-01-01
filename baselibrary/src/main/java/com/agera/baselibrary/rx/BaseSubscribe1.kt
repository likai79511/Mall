package com.agera.baselibrary.rx

import rx.Subscriber

/**
 * Created by Administrator on 2019/1/1.
 */
class BaseSubscribe1<T>(private var next: (T) -> Unit) : Subscriber<T>() {
    override fun onCompleted() {
    }

    override fun onError(e: Throwable?) {
    }

    override fun onNext(t: T) {
        next(t)
    }
}
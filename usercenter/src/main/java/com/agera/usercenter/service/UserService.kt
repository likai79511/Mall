package com.agera.usercenter.service

import rx.Observable


/**
 * Created by Administrator on 2019/1/1.
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}
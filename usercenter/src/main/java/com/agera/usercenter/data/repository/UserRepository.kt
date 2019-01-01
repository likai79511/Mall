package com.agera.usercenter.data.repository

import com.agera.baselibrary.data.protocol.BaseResponse
import rx.Observable

/**
 * Created by Administrator on 2019/1/1.
 */
class UserRepository private constructor() {

    companion object {
        val instance: UserRepository by lazy { UserRepository() }
    }

    fun register(mobile: String, verifyCode: String, pwd: String): Observable<BaseResponse<String>> {
//        return RetrofitFactory.instance.create(RegisterUser::class.java).register(RegisterReq(mobile, verifyCode, pwd))
//                .network()
        return Observable.just(BaseResponse(200, "successful", "success"))
    }
}
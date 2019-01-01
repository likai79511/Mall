package com.agera.usercenter.data.api

import com.agera.baselibrary.data.protocol.BaseResponse
import com.agera.usercenter.data.potocol.RegisterReq
import retrofit2.http.Body
import retrofit2.http.POST
import rx.Observable

/**
 * Created by Administrator on 2019/1/1.
 */
interface RegisterUser {

    @POST("UserCenter/register")
    fun register(@Body req: RegisterReq): Observable<BaseResponse<String>>
}
package com.agera.baselibrary.data.protocol

/**
 * Created by Administrator on 2019/1/1.
 */
class BaseResponse<out T>(val status: Int,
                          val msg: String,
                          val data: T)
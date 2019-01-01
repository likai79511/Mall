package com.agera.baselibrary.data.net

import com.agera.baselibrary.common.Constants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Administrator on 2019/1/1.
 */
class RetrofitFactory private constructor() {

    companion object {
        val instance: RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val retrofit: Retrofit
    private val commonInterceptor: Interceptor

    init {
        commonInterceptor = Interceptor {
            var req = it.request().newBuilder().addHeader("Content-Type", "application/json")
                    .addHeader("charset", "UTF-8")
                    .build()
            it.proceed(req)
        }
        retrofit = Retrofit.Builder()
                .client(initOkhttpClient())
                .baseUrl(Constants.baseUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    private fun initOkhttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(initLoggingIntercept())
                .addInterceptor(commonInterceptor)
                .build()
    }

    private fun initLoggingIntercept(): Interceptor {
        var intercept = HttpLoggingInterceptor()
        intercept.level = HttpLoggingInterceptor.Level.BODY
        return intercept
    }


    fun <T> create(api: Class<T>): T {
        return retrofit.create(api)
    }
}
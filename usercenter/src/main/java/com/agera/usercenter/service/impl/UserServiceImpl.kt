package com.agera.usercenter.service.impl

import com.agera.usercenter.data.repository.UserRepository
import com.agera.usercenter.service.UserService
import rx.Observable
import javax.inject.Inject

/**
 * Created by Administrator on 2019/1/1.
 */
class UserServiceImpl private constructor() : UserService {

    @Inject
    lateinit var mRepository: UserRepository

    companion object {
        val instance: UserServiceImpl by lazy { UserServiceImpl() }
    }

    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return mRepository.register(mobile, verifyCode, pwd)
                .flatMap<Boolean> {
                    Observable.just(it.status == 200)
                }
    }
}
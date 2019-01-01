package com.agera.usercenter.ui.activity

import android.os.Bundle
import com.agera.baselibrary.ui.activity.BaseMvpActivity
import com.agera.usercenter.R
import com.agera.usercenter.presenter.RegisterPresenter
import com.agera.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter.mView = this

        mBtnRegister.setOnClickListener {
            mPresenter.register(mEtMobile.text.toString(), mEtVerifyCode.text.toString(), mEtPassword.text.toString())
        }
    }

    override fun onRegistResult(success: Boolean) {
        toast("${if (success) "success" else "failed"}")
    }

    override fun injection(){
        super.injection()

    }

}

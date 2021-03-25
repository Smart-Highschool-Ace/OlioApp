package org.software.meister.gsm.olio.view.activity

import android.content.Intent
import android.graphics.Color
import cn.pedant.SweetAlert.SweetAlertDialog
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityLoginBinding
import org.software.meister.gsm.olio.viewmodel.activity.LoginViewModel
import org.software.meister.gsm.olio.widget.extention.startActivity
import org.software.meister.gsm.olio.widget.extention.startActivityWithFinish

class LoginActivity : BaseActivity<LoginViewModel, ActivityLoginBinding>() {
    override val resource: Int
        get() = R.layout.activity_login
    override val viewModel: LoginViewModel
        get() = getViewModel(LoginViewModel::class)

    private lateinit var loginDialog : SweetAlertDialog
    private lateinit var successDialog : SweetAlertDialog

    override fun init() {
        loginDialog = SweetAlertDialog(this@LoginActivity, SweetAlertDialog.PROGRESS_TYPE)
        successDialog = SweetAlertDialog(this@LoginActivity, SweetAlertDialog.SUCCESS_TYPE)
    }

    override fun observerViewModel() {
        with(viewModel){
            onSuccessEvent.observe(this@LoginActivity, {
                loginDialog.dismiss()
                showSuccessDialog()
            })
            onRegisterEvent.observe(this@LoginActivity, {
                startActivityWithFinish(this@LoginActivity, RegisterActivity::class.java)
            })
            onSignInEvent.observe(this@LoginActivity, {
                showLoginDialog()
            })
            onFindPasswordEvent.observe(this@LoginActivity, {

            })
        }
    }

    private fun showLoginDialog(){
        loginDialog.progressHelper.barColor = Color.parseColor("#5A948B")
        loginDialog.setTitleText("로그인 중")
            .setCancelable(false)
        loginDialog.show()
    }

    private fun showSuccessDialog(){
        successDialog.progressHelper.barColor = Color.parseColor("#5A948B")
        successDialog.titleText = "로그인에 성공하였습니다"
        successDialog.setCancelable(false)
        successDialog.setConfirmClickListener {
            successDialog.dismiss()
            startActivityWithFinish(this@LoginActivity, MainActivity::class.java)
        }
        successDialog.show()
    }

}

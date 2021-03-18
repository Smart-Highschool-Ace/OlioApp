package org.software.meister.gsm.olio.view.activity

import android.graphics.Color
import cn.pedant.SweetAlert.SweetAlertDialog
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityRegisterBinding
import org.software.meister.gsm.olio.viewmodel.activity.RegisterViewModel

class RegisterActivity : BaseActivity<RegisterViewModel, ActivityRegisterBinding>() {
    override val resource: Int
        get() = R.layout.activity_register
    override val viewModel: RegisterViewModel
        get() = getViewModel(RegisterViewModel::class)

    private lateinit var registerDialog : SweetAlertDialog
    private lateinit var successDialog : SweetAlertDialog

    override fun init() {
        registerDialog = SweetAlertDialog(this@RegisterActivity, SweetAlertDialog.PROGRESS_TYPE)
        successDialog = SweetAlertDialog(this@RegisterActivity, SweetAlertDialog.SUCCESS_TYPE)
    }

    override fun observerViewModel() {
        with(viewModel){
            onGoSignUpEvent.observe(this@RegisterActivity, {
                finish()
            })
            onSuccessEvent.observe(this@RegisterActivity, {
                registerDialog.dismiss()
                showSuccessDialog()
            })
            onRegisterEvent.observe(this@RegisterActivity, {
                showLoadingDialog()
            })
        }
    }

    private fun showLoadingDialog(){

        registerDialog.progressHelper.barColor = Color.parseColor("#5A948B")
        registerDialog.setTitleText("회원가입 중")
                .setCancelable(false)
        registerDialog.show()
    }

    private fun showSuccessDialog(){
        successDialog.progressHelper.barColor = Color.parseColor("#5A948B")
        successDialog.titleText = "회원가입에 성공하였습니다"
        successDialog.setCancelable(false)
        successDialog.setConfirmClickListener {
            successDialog.dismiss()
            finish()
        }
        successDialog.show()
    }


}
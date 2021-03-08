package org.software.meister.gsm.olio.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityLoginBinding
import org.software.meister.gsm.olio.viewmodel.activity.LoginViewModel

class LoginActivity : BaseActivity<LoginViewModel, ActivityLoginBinding>() {
    override val resource: Int
        get() = R.layout.activity_login
    override val viewModel: LoginViewModel
        get() = getViewModel(LoginViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}

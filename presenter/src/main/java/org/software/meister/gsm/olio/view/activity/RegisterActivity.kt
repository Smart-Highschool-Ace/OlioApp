package org.software.meister.gsm.olio.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
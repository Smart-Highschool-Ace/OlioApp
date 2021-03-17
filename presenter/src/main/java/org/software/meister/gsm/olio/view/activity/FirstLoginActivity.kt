package org.software.meister.gsm.olio.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityFirstLoginBinding
import org.software.meister.gsm.olio.viewmodel.activity.FirstLoginViewModel

class FirstLoginActivity : BaseActivity<FirstLoginViewModel, ActivityFirstLoginBinding>() {
    override val resource: Int
        get() = R.layout.activity_first_login
    override val viewModel: FirstLoginViewModel
        get() = getViewModel(FirstLoginViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }
}
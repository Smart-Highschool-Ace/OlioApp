package org.software.meister.gsm.olio.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivitySplashBinding
import org.software.meister.gsm.olio.viewmodel.activity.SplashViewModel

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {
    override val resource: Int
        get() = R.layout.activity_splash
    override val viewModel: SplashViewModel
        get() = getViewModel(SplashViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
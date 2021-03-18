package org.software.meister.gsm.olio.view.activity

import android.os.Handler
import android.os.Looper
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivitySplashBinding
import org.software.meister.gsm.olio.viewmodel.activity.SplashViewModel
import org.software.meister.gsm.olio.widget.extention.startActivityWithFinish

class SplashActivity : BaseActivity<SplashViewModel, ActivitySplashBinding>() {
    override val resource: Int
        get() = R.layout.activity_splash
    override val viewModel: SplashViewModel
        get() = getViewModel(SplashViewModel::class)

    override fun init() {
        Handler(Looper.myLooper()!!).postDelayed({
            startActivityWithFinish(this@SplashActivity, LoginActivity::class.java)
        }, 2000)
    }

    override fun observerViewModel() {

    }

}
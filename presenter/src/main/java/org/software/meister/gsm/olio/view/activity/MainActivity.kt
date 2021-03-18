package org.software.meister.gsm.olio.view.activity

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityMainBinding
import org.software.meister.gsm.olio.viewmodel.activity.MainViewModel

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {
    override val resource: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel
        get() = getViewModel(MainViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
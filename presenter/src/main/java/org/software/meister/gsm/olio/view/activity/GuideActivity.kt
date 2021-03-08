package org.software.meister.gsm.olio.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityGuideBinding
import org.software.meister.gsm.olio.viewmodel.activity.GuideViewModel

class GuideActivity : BaseActivity<GuideViewModel, ActivityGuideBinding>() {
    override val resource: Int
        get() = R.layout.activity_guide
    override val viewModel: GuideViewModel
        get() = getViewModel(GuideViewModel::class)

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
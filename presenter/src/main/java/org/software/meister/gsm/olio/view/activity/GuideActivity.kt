package org.software.meister.gsm.olio.view.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.google.android.material.tabs.TabLayout
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityGuideBinding
import org.software.meister.gsm.olio.view.fragment.GuideFragment1
import org.software.meister.gsm.olio.view.fragment.GuideFragment2
import org.software.meister.gsm.olio.view.fragment.GuideFragment3
import org.software.meister.gsm.olio.viewmodel.activity.GuideViewModel
import org.software.meister.gsm.olio.widget.extention.startActivityWithFinish

class GuideActivity : BaseActivity<GuideViewModel, ActivityGuideBinding>() {
    override val resource: Int
        get() = R.layout.activity_guide
    override val viewModel: GuideViewModel
        get() = getViewModel(GuideViewModel::class)


    var guideFragment1: GuideFragment1 = GuideFragment1()
    var guideFragment2: GuideFragment2 = GuideFragment2()
    var guideFragment3: GuideFragment3 = GuideFragment3()

    override fun init() {
        binding.pager.currentItem = 0
        binding.tab.setupWithViewPager(binding.pager, true)

        binding.pager.adapter = MyAdapter(supportFragmentManager)
    }

    override fun observerViewModel() {
        with(viewModel) {
            onSkipEvent.observe(this@GuideActivity, {
                startActivityWithFinish(this@GuideActivity, FirstLoginActivity::class.java)
            })

            onNextEvent.observe(this@GuideActivity, {
                if (binding.pager.currentItem != 2) {
                    binding.pager.currentItem++
                    binding.tab.setupWithViewPager(binding.pager, true)
                } else {
                    startActivityWithFinish(this@GuideActivity, FirstLoginActivity::class.java)
                }
            })
        }
    }
    inner class MyAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> guideFragment1
                1 -> guideFragment2
                else -> guideFragment3
            }
        }

        override fun getCount(): Int {
            return 3
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            super.destroyItem(container, position, `object`)
        }
    }
}
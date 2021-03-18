package org.software.meister.gsm.olio.view.fragment

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentGuide2Binding
import org.software.meister.gsm.olio.viewmodel.fragment.Guide2ViewModel

class GuideFragment2 : BaseFragment<FragmentGuide2Binding, Guide2ViewModel>() {
    override val viewModel: Guide2ViewModel
        get() = getViewModel(Guide2ViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_guide2

    override fun init() {

    }

    override fun observerViewModel() {

    }
}
package org.software.meister.gsm.olio.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentPageBinding
import org.software.meister.gsm.olio.viewmodel.fragment.PageViewModel

class PageFragment : BaseFragment<FragmentPageBinding, PageViewModel>() {
    override val viewModel: PageViewModel
        get() = getViewModel(PageViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_page

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
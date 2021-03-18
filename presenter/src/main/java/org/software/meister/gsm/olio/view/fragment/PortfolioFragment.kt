package org.software.meister.gsm.olio.view.fragment

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentPortfolioBinding
import org.software.meister.gsm.olio.viewmodel.fragment.PortfolioViewModel

class PortfolioFragment : BaseFragment<FragmentPortfolioBinding, PortfolioViewModel>() {


    override val viewModel: PortfolioViewModel
        get() = getViewModel(PortfolioViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_portfolio

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
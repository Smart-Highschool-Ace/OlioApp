package org.software.meister.gsm.olio.view.fragment.stack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentLicenseBinding
import org.software.meister.gsm.olio.viewmodel.fragment.stack.LicenseViewModel

class LicenseFragment : BaseFragment<FragmentLicenseBinding, LicenseViewModel>() {
    override val viewModel: LicenseViewModel
        get() = getViewModel(LicenseViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_license

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
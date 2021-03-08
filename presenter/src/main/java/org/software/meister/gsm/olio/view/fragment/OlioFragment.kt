package org.software.meister.gsm.olio.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentOlioBinding
import org.software.meister.gsm.olio.viewmodel.fragment.OlioViewModel

class OlioFragment : BaseFragment<FragmentOlioBinding, OlioViewModel>() {
    override val viewModel: OlioViewModel
        get() = getViewModel(OlioViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_olio

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
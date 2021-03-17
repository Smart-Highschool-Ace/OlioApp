package org.software.meister.gsm.olio.view.fragment.stack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentAwardBinding
import org.software.meister.gsm.olio.viewmodel.fragment.stack.AwardViewModel

class AwardFragment : BaseFragment<FragmentAwardBinding, AwardViewModel>() {
    override val viewModel: AwardViewModel
        get() = getViewModel(AwardViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_award

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
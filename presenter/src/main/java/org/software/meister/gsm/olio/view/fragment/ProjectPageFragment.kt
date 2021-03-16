package org.software.meister.gsm.olio.view.fragment

import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentProjectPageBinding
import org.software.meister.gsm.olio.viewmodel.fragment.ProjectPageViewModel

class ProjectPageFragment : BaseFragment<FragmentProjectPageBinding, ProjectPageViewModel>() {
    override val viewModel: ProjectPageViewModel
        get() = getViewModel(ProjectPageViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_project_page

    override fun init() {

    }

    override fun observerViewModel() {

    }

}
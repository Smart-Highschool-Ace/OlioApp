package org.software.meister.gsm.olio.view.fragment

import android.util.Log
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentPageBinding
import org.software.meister.gsm.olio.view.activity.MainActivity
import org.software.meister.gsm.olio.viewmodel.fragment.PageViewModel
import org.software.meister.gsm.olio.widget.OnBackPressListener

class PageFragment : BaseFragment<FragmentPageBinding, PageViewModel>(), OnBackPressListener {
    override val viewModel: PageViewModel
        get() = getViewModel(PageViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_page

    lateinit var mActivity : MainActivity

    override fun init() {
        mActivity = (activity as MainActivity)
        mActivity.setPressListener(this)
        Log.d("TEST", mActivity.backPressListener.toString())
    }

    override fun observerViewModel() {

    }


    override fun onBackPress() {
        mActivity.setFragment(OlioFragment())
    }

}
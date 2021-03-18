package org.software.meister.gsm.olio.view.activity

import android.util.Log
import android.widget.Toast
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseActivity
import org.software.meister.gsm.olio.databinding.ActivityMainBinding
import org.software.meister.gsm.olio.view.fragment.OlioFragment
import org.software.meister.gsm.olio.view.fragment.PageFragment
import org.software.meister.gsm.olio.viewmodel.activity.MainViewModel
import org.software.meister.gsm.olio.widget.OnBackPressListener

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {
    override val resource: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel
        get() = getViewModel(MainViewModel::class)

    var backPressListener: OnBackPressListener? = null

    override fun init() {
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, OlioFragment()).commit()
    }

    override fun observerViewModel() {
        with(viewModel){
            onProfileEvent.observe(this@MainActivity, {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_container, PageFragment()).commit()
            })
        }
    }

    fun setPressListener(listener: OnBackPressListener){
        this.backPressListener = listener
    }

    fun getPressListener():OnBackPressListener?{
        return backPressListener
    }

    fun setFragment(fragment: OlioFragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }

    override fun onBackPressed() {
        Log.d("t",backPressListener.toString())
        if(backPressListener != null){
            backPressListener!!.onBackPress()
            viewModel.profile.value = true
            backPressListener = null
        } else {
            super.onBackPressed()
        }
    }
}
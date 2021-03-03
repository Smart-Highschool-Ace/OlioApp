package org.software.meister.gsm.olio.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.knowledgeoverflow.base.BaseViewModel
import org.koin.androidx.viewmodel.compat.ScopeCompat.viewModel
import org.software.meister.gsm.olio.BR
import java.util.*

abstract class BaseActivity <VM : BaseViewModel, VB : ViewDataBinding> : AppCompatActivity(){

    abstract val resource : Int
    lateinit var binding: VB
    abstract val viewModel : VM


    protected abstract fun init()
    protected abstract fun observerViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        performDataBinding()
        observerViewModel()
        init()
    }

    private fun performDataBinding(){
        binding = DataBindingUtil.setContentView(this, resource)
        binding.setVariable(BR.viewModel, viewModel)
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }


    override fun onBackPressed() {
        this.finish()
    }
}
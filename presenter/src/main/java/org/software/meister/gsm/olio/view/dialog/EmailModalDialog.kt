package org.software.meister.gsm.olio.view.dialog

import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseDialog
import org.software.meister.gsm.olio.databinding.DialogEmailModalBinding
import org.software.meister.gsm.olio.viewmodel.dialog.EmailModalViewModel

class EmailModalDialog : BaseDialog<DialogEmailModalBinding, EmailModalViewModel>() {
    override val viewModel: EmailModalViewModel
        get() = getViewModel(EmailModalViewModel::class)
    override val resource: Int
        get() = R.layout.dialog_email_modal

    override fun init() {

    }

    override fun observerViewModel() {
        
    }
}
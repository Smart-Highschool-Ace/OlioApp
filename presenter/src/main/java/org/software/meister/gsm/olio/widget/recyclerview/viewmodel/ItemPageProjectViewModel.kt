package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel

class ItemPageProjectViewModel : BaseViewModel() {
    val projectName = MutableLiveData<String>()
    val projectComment = MutableLiveData<String>()

}
package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel

class ItemPageStackViewModel : BaseViewModel() {
    val stackName = MutableLiveData<String>()
    val stackProficiency = MutableLiveData<Int>()
}
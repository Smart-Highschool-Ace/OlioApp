package org.software.meister.gsm.olio.viewmodel.fragment

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel

class OlioViewModel : BaseViewModel(){
    val isChecked = MutableLiveData<Boolean>()

    init {
        isChecked.value = false
    }
}
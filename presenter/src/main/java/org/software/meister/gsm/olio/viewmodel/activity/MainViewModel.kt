package org.software.meister.gsm.olio.viewmodel.activity

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.widget.SingleLiveEvent

class MainViewModel : BaseViewModel(){

    val profile = MutableLiveData<Boolean>()

    val onProfileEvent = SingleLiveEvent<Unit>()

    init {
        profile.value = true
    }

    fun showProfile(){
        profile.value = false
        onProfileEvent.call()
    }

}
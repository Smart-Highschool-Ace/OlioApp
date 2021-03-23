package org.software.meister.gsm.olio.viewmodel.activity

import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.widget.SingleLiveEvent

class GuideViewModel : BaseViewModel() {
    val onSkipEvent = SingleLiveEvent<Unit>()
    val onNextEvent = SingleLiveEvent<Unit>()

    fun skip(){
        onSkipEvent.call()
    }

    fun next(){
        onNextEvent.call()
    }
}
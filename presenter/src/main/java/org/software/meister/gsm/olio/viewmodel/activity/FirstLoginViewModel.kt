package org.software.meister.gsm.olio.viewmodel.activity

import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.widget.SingleLiveEvent

class FirstLoginViewModel : BaseViewModel() {
    val onMainEvent = SingleLiveEvent<Unit>()

    fun goMain(){
        onMainEvent.call()
        //사진이나 글 상태 체크
    }
}
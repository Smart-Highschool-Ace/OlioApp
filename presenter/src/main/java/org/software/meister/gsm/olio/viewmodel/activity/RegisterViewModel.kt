package org.software.meister.gsm.olio.viewmodel.activity

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.widget.SingleLiveEvent

class RegisterViewModel : BaseViewModel() {
    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val passwordCheck = MutableLiveData<String>()

    val onSuccessEvent = SingleLiveEvent<Unit>()
    val onFailureEvent = SingleLiveEvent<Unit>()
    val onGoSignUpEvent = SingleLiveEvent<Unit>()
    val onRegisterEvent = SingleLiveEvent<Unit>()
    val onShowEvent = SingleLiveEvent<Unit>()

    //region 회원가입
    fun register(){
        onRegisterEvent.call()

        Handler().postDelayed({
            onSuccessEvent.call()
        }, 2000)
    }
    //endregion

    fun showDialog(){
        onShowEvent.call()
    }

    fun goSignUp(){
        onGoSignUpEvent.call()
    }
}
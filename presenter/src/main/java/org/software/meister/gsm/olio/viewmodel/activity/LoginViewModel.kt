package org.software.meister.gsm.olio.viewmodel.activity

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.widget.SingleLiveEvent

class LoginViewModel : BaseViewModel() {
    val email = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val isRemainEmail = MutableLiveData<Boolean>()

    val onSuccessEvent = SingleLiveEvent<Unit>()
    val onFailureEvent = SingleLiveEvent<Unit>()
    val onRegisterEvent = SingleLiveEvent<Unit>()
    val onSignInEvent = SingleLiveEvent<Unit>()
    val onFindPasswordEvent = SingleLiveEvent<Unit>()

    //region 로그인 이벤트
    fun signIn(){
        onSignInEvent.call()
        Handler().postDelayed({
            onSuccessEvent.call()
        }, 2000)
    }
    //endregion

    fun goRegister(){
        onRegisterEvent.call()
    }

    fun goFindPassword(){
        onFindPasswordEvent.call()
    }
}
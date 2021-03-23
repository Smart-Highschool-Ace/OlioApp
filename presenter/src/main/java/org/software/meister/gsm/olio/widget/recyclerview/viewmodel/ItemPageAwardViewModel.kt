package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel

class ItemPageAwardViewModel : BaseViewModel() {
    val awardName = MutableLiveData<String>()
    val awardComment = MutableLiveData<String>()

}
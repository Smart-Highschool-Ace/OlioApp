package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.network.dto.Award

class ItemPageAwardViewModel : BaseViewModel() {
    val awardName = MutableLiveData<String>()
    val awardComment = MutableLiveData<String>()

    fun bind(item : Award){
        awardName.value = item.name
        awardComment.value = item.institution
    }

}
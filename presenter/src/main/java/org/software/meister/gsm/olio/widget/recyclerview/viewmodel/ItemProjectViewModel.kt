package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel

class ItemProjectViewModel : BaseViewModel() {
    val name = MutableLiveData<String>()
    val viewer = MutableLiveData<String>()
    val contributorName = MutableLiveData<String>()
    val projectComment = MutableLiveData<String>()



}
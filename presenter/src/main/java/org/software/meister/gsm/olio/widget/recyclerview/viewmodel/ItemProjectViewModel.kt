package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel
import org.software.meister.gsm.olio.network.dto.project.Project

class ItemProjectViewModel : BaseViewModel() {
    val name = MutableLiveData<String>()
    val viewer = MutableLiveData<String>()
    val contributorName = MutableLiveData<String>()
    val projectComment = MutableLiveData<String>()

    fun bind(item : Project){
        name.value = item.name
        viewer.value = item.view.toString()
        contributorName.value = item.members[0].member.name
    }

}
package org.software.meister.gsm.olio.widget.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import org.software.meister.gsm.olio.base.BaseViewModel

class ItemPortfolioViewModel : BaseViewModel() {
    val name = MutableLiveData<String>()
    val viewer = MutableLiveData<String>()
    val contributorName = MutableLiveData<String>()
    val portfolioComment = MutableLiveData<String>()
    val portfolioFollow = MutableLiveData<String>()




}
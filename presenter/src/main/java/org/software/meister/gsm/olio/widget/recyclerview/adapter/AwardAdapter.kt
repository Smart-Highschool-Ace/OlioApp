package org.software.meister.gsm.olio.widget.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.databinding.ItemPageAwardBinding
import org.software.meister.gsm.olio.network.dto.Award
import org.software.meister.gsm.olio.widget.recyclerview.viewmodel.ItemPageAwardViewModel

class AwardAdapter : RecyclerView.Adapter<AwardAdapter.AwardViewHolder>() {

    var awardList = ArrayList<Award>()

    fun setList(arrayList: ArrayList<Award>){
        this.awardList = arrayList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AwardViewHolder {
        return AwardViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_page_award, parent, false))
    }

    override fun onBindViewHolder(holder: AwardViewHolder, position: Int) {
        holder.bind(awardList[position])
    }

    override fun getItemCount(): Int {
        return awardList.size
    }

    inner class AwardViewHolder(val binding : ItemPageAwardBinding) : RecyclerView.ViewHolder(binding.root){

        private val viewModel = ItemPageAwardViewModel()

        fun bind(item : Award){
            viewModel.bind(item)
            binding.viewModel = viewModel
        }
    }

}
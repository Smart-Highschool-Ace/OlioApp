package org.software.meister.gsm.olio.widget.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.databinding.ItemProjectBinding
import org.software.meister.gsm.olio.network.dto.project.Project
import org.software.meister.gsm.olio.widget.recyclerview.viewmodel.ItemProjectViewModel

class ProjectAdapter : RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {

    var projectList = ArrayList<Project>()

    fun setList(projectList: ArrayList<Project>){
        this.projectList = projectList
    }

    inner class ProjectViewHolder(val binding : ItemProjectBinding) : RecyclerView.ViewHolder(binding.root){

        var viewModel = ItemProjectViewModel()

        fun bind(item : Project){
            viewModel.bind(item)
            binding.viewModel = viewModel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        return ProjectViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_page_project, parent, false))
    }

    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        holder.bind(projectList[position])
    }

    override fun getItemCount(): Int {
        return projectList.size
    }
}
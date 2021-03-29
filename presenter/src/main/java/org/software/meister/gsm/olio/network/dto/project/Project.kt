package org.software.meister.gsm.olio.network.dto.project

import org.software.meister.gsm.olio.network.dto.Skill
import org.software.meister.gsm.olio.network.dto.User

data class Project(
        val id : Int,
        val name : String,
        val view : Int,
        val owner : User,
        val introduction : String,
        val description : String,
        val link : String,
        val logo : String,
        val start_at : String,
        val end_at : String? = null,
        val created_at : String,
        val updated_at : String,
        val skills : ArrayList<Skill>,
        val members : ArrayList<ProjectMember>,
        val fields : ArrayList<ProjectField>,
        val images : ArrayList<ProjectImage>,
        val likes : ArrayList<User>,
        val liked : Boolean
)

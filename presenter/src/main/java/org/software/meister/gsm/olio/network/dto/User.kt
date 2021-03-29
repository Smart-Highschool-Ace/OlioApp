package org.software.meister.gsm.olio.network.dto

import org.software.meister.gsm.olio.network.dto.portfolio.Portfolio
import org.software.meister.gsm.olio.network.dto.project.Project

data class User(
        val id : Int,
        val name : String,
        val email : String,
        val school : String,
        val profile_image : String,
        val introduction : String,
        val entrance_year : Int,
        val grade : Int,
        val portfolio : Portfolio,
        val projects : ArrayList<Project>,
        val participated_projects : ArrayList<Project>,
        val liked_projects : ArrayList<Project>,
        val liked_portfolio : ArrayList<Portfolio>
)

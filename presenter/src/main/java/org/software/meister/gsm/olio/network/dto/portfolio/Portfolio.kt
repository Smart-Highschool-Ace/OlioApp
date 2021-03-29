package org.software.meister.gsm.olio.network.dto.portfolio

import org.software.meister.gsm.olio.network.dto.Award
import org.software.meister.gsm.olio.network.dto.Certificate
import org.software.meister.gsm.olio.network.dto.User

data class Portfolio(
        val id : Int,
        val owner : User,
        val email : String,
        val link : String,
        val likes : ArrayList<User>,
        val skills : ArrayList<PortfolioSkill>,
        val projects : ArrayList<PortfolioProject>,
        val prizes : ArrayList<Award>,
        val certificates : ArrayList<Certificate>,
        val view : Int,
        val liked : Boolean
)

package org.software.meister.gsm.olio.network.dto.portfolio

import org.software.meister.gsm.olio.network.dto.project.Project

data class PortfolioProject(
        val project : Project,
        val order : Int
)
package org.software.meister.gsm.olio.network.dto.project

import org.software.meister.gsm.olio.network.dto.User

data class ProjectMember(
        val member : User,
        val role : String
)

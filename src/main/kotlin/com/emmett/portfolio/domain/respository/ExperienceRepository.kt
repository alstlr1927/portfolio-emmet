package com.emmett.portfolio.domain.respository

import com.emmett.portfolio.domain.entity.Achievement
import com.emmett.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository: JpaRepository<Experience, Long> {
    
}
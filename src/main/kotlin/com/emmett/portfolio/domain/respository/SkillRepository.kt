package com.emmett.portfolio.domain.respository

import com.emmett.portfolio.domain.entity.Achievement
import com.emmett.portfolio.domain.entity.Experience
import com.emmett.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository: JpaRepository<Skill, Long> {
    
}
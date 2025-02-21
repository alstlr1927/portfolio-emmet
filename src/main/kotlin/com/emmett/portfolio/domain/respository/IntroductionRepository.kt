package com.emmett.portfolio.domain.respository

import com.emmett.portfolio.domain.entity.Achievement
import com.emmett.portfolio.domain.entity.Experience
import com.emmett.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository: JpaRepository<Introduction, Long> {
    
}
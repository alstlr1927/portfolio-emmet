package com.emmett.portfolio.domain.respository

import com.emmett.portfolio.domain.entity.Achievement
import com.emmett.portfolio.domain.entity.Experience
import com.emmett.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository: JpaRepository<Link, Long> {
    
}
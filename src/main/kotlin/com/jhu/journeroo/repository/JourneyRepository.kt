package com.jhu.journeroo.repository

import com.jhu.journeroo.model.Journey
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface JourneyRepository : PagingAndSortingRepository<Journey, Int> {
    @Query("SELECT * FROM journeys", nativeQuery = true)
    fun findPage(pageable: Pageable): List<Journey>
}

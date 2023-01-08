package com.jhu.journeroo.repository

import com.jhu.journeroo.model.Journey
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface JourneyRepository : CrudRepository<Journey, Int> {
    @Query("SELECT * FROM journeys LIMIT 10", nativeQuery = true)
    fun findAllLimit() : Iterable<Journey>

}

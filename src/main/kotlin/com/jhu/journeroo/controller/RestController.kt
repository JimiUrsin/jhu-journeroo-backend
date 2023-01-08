package com.jhu.journeroo.controller

import com.jhu.journeroo.repository.JourneyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class JourneyResource {
    @Autowired
    lateinit var journeyRepository: JourneyRepository

    @GetMapping("/api/journeys")
    fun listAll() = journeyRepository.findAllLimit()
}

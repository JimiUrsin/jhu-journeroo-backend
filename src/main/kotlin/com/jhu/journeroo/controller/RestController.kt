package com.jhu.journeroo.controller

import com.jhu.journeroo.repository.JourneyRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class JourneyResource {
    @Autowired
    lateinit var journeyRepository: JourneyRepository

    @GetMapping("/api/journeys/{page}")
    fun getPage(@PathVariable page: Int) =
        journeyRepository.findPage(PageRequest.of(page, 30).withSort(Sort.by(Sort.Direction.ASC, "departureTimestamp")))

    @GetMapping("/api/journeys/")
    fun getAll() = journeyRepository.findAll(PageRequest.of(0, 30).withSort(Sort.by(Sort.Direction.ASC, "departureTimestamp")))
}

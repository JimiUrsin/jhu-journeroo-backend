package com.jhu.journeroo.controller

import com.jhu.journeroo.model.Journey
import com.jhu.journeroo.repository.JourneyRepository
import com.jhu.journeroo.validator.RequestParamValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
class JourneyResource {
    @Autowired
    lateinit var journeyRepository: JourneyRepository

    @Autowired
    lateinit var paramValidator: RequestParamValidator

    @GetMapping("/api/journeys/{page}")
    fun getPage(@PathVariable page: Int, @RequestParam(name = "column") columnParam: String?, @RequestParam(name = "sort") sortParam: String?): List<Journey> =
        journeyRepository.findPage(
            PageRequest.of(page, 30, Sort.by(paramValidator.validateAndReturnSort(sortParam ?: "ASC"), paramValidator.validateAndReturnColumn(columnParam ?: "departuretimestamp")))
        )


    @GetMapping("/api/journeys/")
    fun getAll() = journeyRepository.findAll(PageRequest.of(0, 30).withSort(Sort.by(Sort.Direction.ASC, "departureTimestamp")))
}

package com.jhu.journeroo.controller

import com.jhu.journeroo.model.Journey
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.Timestamp

@RestController
class JourneyResource {
    val journeys = listOf(
        Journey(0, Timestamp(123), Timestamp(456), 41, "Ympyrätalo", 41, "Ympyrätalo", 0, 8),
        Journey(1, Timestamp(456), Timestamp(789), 107, "Tenholantie", 111, "Esterinportti", 1847, 407),
        Journey(2, Timestamp(101), Timestamp(112), 9, "Erottajan aukio", 40, "Hakaniemi (M)", 1602, 405),
    )

    @GetMapping("/api/journeys")
    fun listAll(): List<Journey> = journeys
}

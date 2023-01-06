package com.jhu.journeroo.model

import java.sql.Timestamp

data class Journey(
    val journeyId: Int,
    val departureTimestamp: Timestamp,
    val returnTimestamp: Timestamp,
    val departureStationId: Int,
    val departureStationName: String,
    val returnStationId : Int,
    val returnStationName: String,
    val distance: Int,
    val duration: Int,
)

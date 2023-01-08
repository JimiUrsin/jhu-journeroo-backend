package com.jhu.journeroo.model

import jakarta.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "journeys")
class Journey (
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    @Column(name="departuretimestamp")
    val departureTimestamp: Timestamp,
    @Column(name="returntimestamp")
    val returnTimestamp: Timestamp,
    @Column(name="departurestationid")
    val departureStationId: Int,
    @Column(name="departurestationname")
    val departureStationName: String,
    @Column(name="returnstationid")
    val returnStationId : Int,
    @Column(name="returnstationname")
    val returnStationName: String,
    @Column(name="distance")
    val distance: Float,
    @Column(name="duration")
    val duration: Float,
){
    constructor() : this(0, Timestamp(0), Timestamp(0), 0, "", 0, "", 0F, 0F) {

    }
}

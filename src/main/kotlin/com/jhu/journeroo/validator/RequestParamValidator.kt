package com.jhu.journeroo.validator

import org.springframework.data.domain.Sort
import org.springframework.stereotype.Component

@Component
class RequestParamValidator {
    fun validateAndReturnSort(sortParam: String): Sort.Direction {
        return when (sortParam) {
            "DESC" -> Sort.Direction.DESC
            else -> Sort.Direction.ASC
        }
    }

    fun validateAndReturnColumn(columnParam: String): String {
        val columns = listOf( // TODO Get these straight from the database
            "departuretimestamp",
            "returntimestamp",
            "departurestationid",
            "departurestationname",
            "returnstationid",
            "returnstationname",
            "distance",
            "duration",
        )

        if (columns.contains(columnParam.lowercase())) {
            return columnParam.lowercase()
        }

        return "departuretimestamp"
    }
}
package com.example

import io.micronaut.serde.annotation.Serdeable
import java.util.Date

@Serdeable
data class Order(
    val product: String,
    val price: Double,
    val date: Date
)

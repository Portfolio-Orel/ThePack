package com.orels.thepack.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

typealias ReviewsIds = List<String>
typealias Parks = List<Park>

@Entity
data class Park(
    @PrimaryKey var id: String,
    var name: String,
    var openingHours: String,
    var priceAdult: Float,
    var location: Location,
    var description: String = "",
    var priceChild: Float = priceAdult,
    var priceStudent: Float = priceAdult,
    var favorite: Boolean = false,
    var mainImageUrl: String = "",
    var otherImagesUrls: List<String> = emptyList(),
)

data class Location(
    var latitude: Double,
    var longitude: Double,
)

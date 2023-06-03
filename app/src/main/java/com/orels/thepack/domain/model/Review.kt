package com.orels.thepack.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

typealias Reviews = List<Review>

@Entity
data class Review(
    @PrimaryKey var id: String,
    var review: String,
    var rating: Float,
    var authorId: String,
    var parkId: String
)
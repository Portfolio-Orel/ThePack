package com.orels.thepack.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

typealias Authors = List<Author>

@Entity
data class Author(
    @PrimaryKey var id: String,
    var name: String,
    var image: String,
)
package com.orels.thepack.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.orels.thepack.data.local.dao.AuthorDao
import com.orels.thepack.data.local.dao.ParkDao
import com.orels.thepack.data.local.dao.ReviewDao
import com.orels.thepack.domain.model.Author
import com.orels.thepack.domain.model.Park
import com.orels.thepack.domain.model.Review

@Database(
    entities = [
        Author::class,
        Park::class,
        Review::class
    ],
    version = 1,
)
@TypeConverters(Converters::class)
abstract class LocalDatabase: RoomDatabase() {
    abstract val authorDao: AuthorDao
    abstract val parkDao: ParkDao
    abstract val reviewDao: ReviewDao
}
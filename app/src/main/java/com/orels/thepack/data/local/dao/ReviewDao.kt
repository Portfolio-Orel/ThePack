package com.orels.thepack.data.local.dao

import androidx.room.*
import com.orels.thepack.domain.model.Reviews
import kotlinx.coroutines.flow.Flow

@Dao
interface ReviewDao {
    @Insert
    suspend fun insertReview(reviews: Reviews)

    @Update
    suspend fun updateReview(reviews: Reviews)

    @Delete
    suspend fun deleteReview(reviews: Reviews)

    @Query("SELECT * FROM Review")
    fun getAll(): Flow<Reviews>
}

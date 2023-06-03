package com.orels.thepack.domain.interactor

import com.orels.thepack.domain.model.Reviews
import kotlinx.coroutines.flow.Flow

interface ReviewInteractor {
    suspend fun insertReview(reviews: Reviews)
    suspend fun updateReview(reviews: Reviews)
    suspend fun deleteReview(reviews: Reviews)
    fun getAll(): Flow<Reviews>
}
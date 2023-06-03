package com.orels.thepack.data.interactor

import com.orels.thepack.data.local.LocalDatabase
import com.orels.thepack.domain.interactor.ReviewInteractor
import com.orels.thepack.domain.model.Reviews
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class ReviewInteractorImpl @Inject constructor(
    localDb: LocalDatabase
): ReviewInteractor {
    private val db = localDb.reviewDao

    override suspend fun insertReview(reviews: Reviews) {
        TODO("Not yet implemented")
    }

    override suspend fun updateReview(reviews: Reviews) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteReview(reviews: Reviews) {
        TODO("Not yet implemented")
    }

    override fun getAll(): Flow<Reviews> {
        TODO("Not yet implemented")
    }
}
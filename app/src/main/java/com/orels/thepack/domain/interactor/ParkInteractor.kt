package com.orels.thepack.domain.interactor

import com.orels.thepack.domain.model.Parks
import kotlinx.coroutines.flow.Flow

interface ParkInteractor {
    suspend fun insertPark(parks: Parks)
    suspend fun updatePark(parks: Parks)
    suspend fun deletePark(parks: Parks)
    fun getAll(): Flow<Parks>
}
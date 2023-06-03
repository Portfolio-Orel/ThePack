package com.orels.thepack.data.interactor

import com.orels.thepack.data.local.LocalDatabase
import com.orels.thepack.domain.interactor.ParkInteractor
import com.orels.thepack.domain.model.Parks
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ParkInteractorImpl @Inject constructor(
    localDb: LocalDatabase
) : ParkInteractor {

    private val db = localDb.parkDao

    override suspend fun insertPark(parks: Parks) {
        TODO("Not yet implemented")
    }

    override suspend fun updatePark(parks: Parks) {
        TODO("Not yet implemented")
    }

    override suspend fun deletePark(parks: Parks) {
        TODO("Not yet implemented")
    }

    override fun getAll(): Flow<Parks> {
        TODO("Not yet implemented")
    }
}
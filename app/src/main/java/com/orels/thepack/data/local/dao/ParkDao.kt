package com.orels.thepack.data.local.dao

import androidx.room.*
import com.orels.thepack.domain.model.Park
import com.orels.thepack.domain.model.Parks
import kotlinx.coroutines.flow.Flow

@Dao
interface ParkDao {
    @Insert
    suspend fun insertPark(parks: Parks)

    @Update
    suspend fun updatePark(park: Park)

    @Delete
    suspend fun deletePark(park: Park)

    @Query("SELECT * FROM Park")
    fun getAll(): Flow<Parks>
}
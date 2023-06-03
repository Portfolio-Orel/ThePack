package com.orels.thepack.data.local.dao

import androidx.room.*
import com.orels.thepack.domain.model.Author
import com.orels.thepack.domain.model.Authors
import kotlinx.coroutines.flow.Flow

@Dao
// Insert, Update, Delete, GetAll Flowable
interface AuthorDao {
    @Insert
    suspend fun insertAuthor(authors: Authors)

    @Update
    suspend fun updateAuthor(author: Author)

    @Delete
    suspend fun deleteAuthor(author: Author)

    @Query("SELECT * FROM Author")
    fun getAll(): Flow<Authors>

    @Query("SELECT * FROM Author WHERE id = :id")
    suspend fun getAuthor(id: String): Author
}


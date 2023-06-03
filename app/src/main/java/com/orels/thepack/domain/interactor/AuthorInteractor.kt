package com.orels.thepack.domain.interactor

import com.orels.thepack.domain.model.Authors
import kotlinx.coroutines.flow.Flow

interface AuthorInteractor {
    suspend fun insertAuthor(authors: Authors)
    suspend fun updateAuthor(authors: Authors)
    suspend fun deleteAuthor(authors: Authors)
    fun getAll(): Flow<Authors>
}
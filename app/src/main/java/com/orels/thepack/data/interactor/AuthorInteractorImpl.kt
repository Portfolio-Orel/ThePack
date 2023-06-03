package com.orels.thepack.data.interactor

import com.orels.thepack.data.local.LocalDatabase
import com.orels.thepack.domain.interactor.AuthorInteractor
import com.orels.thepack.domain.model.Authors
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthorInteractorImpl @Inject constructor(
    localDb: LocalDatabase
) : AuthorInteractor {

    private val db = localDb.authorDao

    override suspend fun insertAuthor(authors: Authors) {
        TODO("Not yet implemented")
    }

    override suspend fun updateAuthor(authors: Authors) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteAuthor(authors: Authors) {
        TODO("Not yet implemented")
    }

    override fun getAll(): Flow<Authors> {
        TODO("Not yet implemented")
    }

}
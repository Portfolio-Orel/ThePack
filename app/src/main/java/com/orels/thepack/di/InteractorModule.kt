package com.orels.thepack.di

import com.orels.thepack.data.interactor.AuthorInteractorImpl
import com.orels.thepack.data.interactor.ParkInteractorImpl
import com.orels.thepack.data.interactor.ReviewInteractorImpl
import com.orels.thepack.domain.interactor.AuthorInteractor
import com.orels.thepack.domain.interactor.ParkInteractor
import com.orels.thepack.domain.interactor.ReviewInteractor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class InteractorModule {

    @Binds
    @Singleton
    abstract fun providesReviewInteractor(
        reviewInteractorImpl: ReviewInteractorImpl
    ): ReviewInteractor

    @Binds
    @Singleton
    abstract fun providesAuthorInteractor(
        authorInteractorImpl: AuthorInteractorImpl
    ): AuthorInteractor

    @Binds
    @Singleton
    abstract fun providesParkInteractor(
        parkInteractorImpl: ParkInteractorImpl
    ): ParkInteractor
}

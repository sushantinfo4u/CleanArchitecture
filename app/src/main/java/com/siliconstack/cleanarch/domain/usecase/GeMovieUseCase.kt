package com.siliconstack.rxkotlinassignment.domain.usecase

import com.siliconstack.cleanarch.domain.repository.MovieRepository
import com.siliconstack.rxkotlinassignment.data.model.MovieData
import com.siliconstack.rxkotlinassignment.domain.usecase.base.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject


/**
 * An interactor that calls the actual implementation of [ViewModel](which is injected by DI)
 * it handles the response that returns data &
 * contains a list of actions, event steps
 */
class GeMovieUseCase @Inject constructor(private val repository: MovieRepository) : SingleUseCase<List<MovieData>>() {

    override fun buildUseCaseSingle(): Single<List<MovieData>> {
        return repository.getMovieData()
    }
}
package com.siliconstack.rxkotlinassignment.data.repositoryimplemenation

import com.siliconstack.rxkotlinassignment.data.source.remote.RetrofitService
import com.siliconstack.cleanarch.domain.repository.MovieRepository
import com.siliconstack.rxkotlinassignment.data.model.MovieData
import com.siliconstack.rxkotlinassignment.data.source.local.MoviesDatabase
import io.reactivex.Single


/**
 * This repository is responsible for
 * fetching data[Movie] from server or db
 * */
abstract class MovieRepositoryImp(private val database: MoviesDatabase,
                                  private val retrofitService: RetrofitService) : MovieRepository {

    override fun getMovieData(): Single<List<MovieData>> {
        return retrofitService.getMovieData()
    }
}
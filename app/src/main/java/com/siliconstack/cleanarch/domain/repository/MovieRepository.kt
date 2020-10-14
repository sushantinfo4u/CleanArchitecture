package com.siliconstack.cleanarch.domain.repository

import com.siliconstack.rxkotlinassignment.data.model.MovieData
import io.reactivex.Single

interface MovieRepository {
    fun getMovieData():Single<List<MovieData>>
}
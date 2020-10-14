package com.siliconstack.rxkotlinassignment.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.siliconstack.rxkotlinassignment.data.model.MovieData


@Database(entities = arrayOf(MovieData::class), version = 1,exportSchema = false)
abstract class MoviesDatabase  : RoomDatabase() {
    abstract fun getMoviesDao(): MoviesDao
}
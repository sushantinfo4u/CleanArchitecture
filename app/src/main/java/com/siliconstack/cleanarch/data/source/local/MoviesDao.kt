package com.siliconstack.rxkotlinassignment.data.source.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.siliconstack.rxkotlinassignment.data.model.MovieData

@Dao
interface MoviesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveMovie(movie: List<MovieData>)

    @Query("SELECT * FROM movies")
    fun getFavorites(): List<MovieData>

}
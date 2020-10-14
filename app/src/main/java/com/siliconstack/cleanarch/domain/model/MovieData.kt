package com.siliconstack.rxkotlinassignment.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movies")
data class MovieData(
    @SerializedName("genre")
    val genre: String,
    @SerializedName("id")
    @PrimaryKey
    val id: Int=-1,
    @SerializedName("poster")
    val poster: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("year")
    val year: String
)
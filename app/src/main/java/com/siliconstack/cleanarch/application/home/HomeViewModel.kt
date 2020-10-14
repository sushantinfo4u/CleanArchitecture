package com.example.assignment1.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.siliconstack.rxkotlinassignment.data.model.MovieData
import com.siliconstack.rxkotlinassignment.domain.usecase.GeMovieUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val movieUseCase: GeMovieUseCase) : ViewModel() {

//    pass the usecase object as parameter in as

    var responseData = MutableLiveData<ArrayList<MovieData>>()
    private var movieList = ArrayList<MovieData>()
    val isLoad = MutableLiveData<Boolean>()

//  to get response from UseCase
    val movieData = MutableLiveData<List<MovieData>>()


    init {
        isLoad.value=false
        getMovieData()
    }

    private fun getMovieData() {

        movieUseCase.execute(
            onSuccess = {
                movieData.value=it
                isLoad.value=true
            },
            onError = {
                it.printStackTrace()
//                 store into database

            }

        )

    }


    fun getMovieList() : LiveData<ArrayList<MovieData>>{
        movieList.add(MovieData("Animation",1,"https://goo.gl/1zUyyq","Dunkirt","2015"))
        movieList.add(MovieData("Heroistic",2,"https://image.tmdb.org/t/p/w370_and_h556_bestv2/bXrZ5iHBEjH7WMidbUDQ0U2xbmr.jpg","Jumanji","2008"))

        responseData.value = movieList
        return responseData
    }



}

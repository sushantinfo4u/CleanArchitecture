package com.siliconstack.rxkotlinassignment.application.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.assignment1.ui.home.HomeViewModel
import com.siliconstack.cleanarch.domain.repository.MovieRepository
import com.siliconstack.rxkotlinassignment.domain.usecase.GeMovieUseCase

@Suppress("UNCHECKED_CAST")
class HomeViewModelFactory(private val movieUseCase: GeMovieUseCase):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(movieUseCase) as T
    }

}
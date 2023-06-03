package com.orels.thepack.presentation.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(MainState())
        private set

    fun onEvent(event: MainEvent) {
        when (event) {
            else -> {}
        }
    }
}
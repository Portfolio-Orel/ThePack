package com.orels.thepack.presentation.plans

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlansViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(PlansState())
        private set

    fun onEvent(event: PlansEvent) {
        when (event) {
            else -> {}
        }
    }
}
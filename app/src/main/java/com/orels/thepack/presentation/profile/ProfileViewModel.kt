package com.orels.thepack.presentation.profile

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(ProfileState())
        private set

    fun onEvent(event: ProfileEvent) {
        when (event) {
            else -> {}
        }
    }
}
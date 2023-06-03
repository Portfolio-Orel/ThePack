package com.orels.thepack.presentation.chat

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChatViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(ChatState())
        private set

    fun onEvent(event: ChatEvent) {
        when (event) {
            else -> {}
        }
    }
}
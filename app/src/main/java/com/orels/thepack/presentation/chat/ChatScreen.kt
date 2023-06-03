package com.orels.thepack.presentation.chat

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

typealias OnEventChat = (ChatEvent) -> Unit

@Composable
fun ChatScreen(
    state: ChatState,
    onEvent: OnEventChat
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Chat Screen"
        )
    }
}

@Preview
@Composable
fun ChatScreenPreview() {
    ChatScreen(
        state = ChatState(),
        onEvent = {}
    )
}
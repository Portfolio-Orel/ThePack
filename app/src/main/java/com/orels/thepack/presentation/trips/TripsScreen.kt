package com.orels.thepack.presentation.trips

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

typealias OnEventTrips = (TripsEvent) -> Unit

@Composable
fun TripsScreen(
    state: TripsState,
    onEvent: OnEventTrips
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Trips Screen"
        )
    }
}

@Preview
@Composable
fun TripsScreenPreview() {
    TripsScreen(
        state = TripsState(),
        onEvent = {}
    )
}
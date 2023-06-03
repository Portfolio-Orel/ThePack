package com.orels.thepack.presentation.plans

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import com.orels.thepack.R

typealias OnEvent = (PlansEvent) -> Unit

enum class Plan(@StringRes val label: Int, val color: Color, @DrawableRes val icon: Int) {
    Parks(R.string.label_parks, Color(0xFF44E044), R.drawable.parks),
    Transportation(R.string.label_transportation, Color(0xFFE0F36F), R.drawable.transportation),
    Accommodation(R.string.label_accommodation, Color(0xFFA83AB7), R.drawable.accommodation),

}

class PlansState {
}

sealed class PlansEvent {
}
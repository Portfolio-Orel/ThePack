package com.orels.thepack.presentation.plans

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.orels.thepack.R
import com.orels.thepack.presentation.shared.BackPressHandler

typealias OnEventPlans = (PlansEvent) -> Unit

@Composable
fun PlansScreen(
    state: PlansState,
    onEvent: OnEventPlans,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val listState = rememberLazyGridState()
        val spaceBetweenPlans = 8.dp
        val selectedPlan: MutableState<Plan?> = remember { mutableStateOf(null) }

        BackPressHandler(
            enabled = selectedPlan.value != null,
            onBackPressed = {
                selectedPlan.value = null
            }
        )


        Column {
            AnimatedVisibility(
                visible = selectedPlan.value == null,
                enter = slideInHorizontally(
                    initialOffsetX = { fullWidth -> -fullWidth },
                    animationSpec = tween(durationMillis = 250, easing = EaseInOut)
                ),
                exit = slideOutHorizontally(
                    targetOffsetX = { fullWidth -> 2 * fullWidth },
                    animationSpec = tween(durationMillis = 150, easing = EaseInOut)
                )
            ) {
                LazyVerticalGrid(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxSize()
                        .heightIn(max = 2000.dp),
                    columns = GridCells.Fixed(3),
                    state = listState,
                    horizontalArrangement = Arrangement.spacedBy(spaceBetweenPlans),
                    verticalArrangement = Arrangement.spacedBy(spaceBetweenPlans)
                ) {
                    items(
                        count = Plan.values().size,
                        key = { index -> Plan.values()[index] }
                    ) {
                        PlanItem(
                            plan = Plan.values()[it],
                            onClick = { plan ->
                                selectedPlan.value = plan
                            }
                        )
                    }
                }
            }
        }
        AnimatedVisibility(
            visible = selectedPlan.value != null,
            enter = slideInHorizontally(
                initialOffsetX = { fullWidth -> -fullWidth },
                animationSpec = tween(durationMillis = 250, easing = EaseInOut)
            ),
            exit = slideOutHorizontally(
                targetOffsetX = { fullWidth -> 2 * fullWidth },
                animationSpec = tween(durationMillis = 150, easing = EaseInOut)
            )
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Text(text = "selected plan: ${selectedPlan.value?.label}")
            }
        }
    }
}

@Composable
fun PlanItem(
    plan: Plan,
    onClick: (Plan) -> Unit
) {
    val screen = LocalConfiguration.current
    val screenWidth = screen.screenWidthDp.dp
    val planSize = (screenWidth - (6.dp * 2)) / 3
    Column(
        modifier = Modifier
            .size(planSize),
        verticalArrangement = Arrangement.spacedBy(6.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize(0.7f)
                .shadow(4.dp, shape = MaterialTheme.shapes.medium)
                .clip(MaterialTheme.shapes.medium)
                .background(plan.color)
                .clickable { onClick(plan) },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                modifier = Modifier.fillMaxSize(0.5f),
                painter = painterResource(id = plan.icon),
                contentDescription = stringResource(
                    id = R.string.label_plan_icon,
                    stringResource(id = plan.label)
                ),
                tint = Color.White
            )
        }
        Text(
            text = stringResource(id = plan.label),
            style = MaterialTheme.typography.bodyMedium
        )
    }
}


@Preview
@Composable
fun PlansScreenPreview() {
    PlansScreen(
        state = PlansState(),
        onEvent = {}
    )
}
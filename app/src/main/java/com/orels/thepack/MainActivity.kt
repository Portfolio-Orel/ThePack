package com.orels.thepack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.orels.thepack.presentation.chat.ChatScreen
import com.orels.thepack.presentation.chat.ChatViewModel
import com.orels.thepack.presentation.components.BottomBar
import com.orels.thepack.presentation.components.CustomScaffold
import com.orels.thepack.presentation.main.MainScreen
import com.orels.thepack.presentation.main.MainViewModel
import com.orels.thepack.presentation.plans.PlansScreen
import com.orels.thepack.presentation.plans.PlansViewModel
import com.orels.thepack.presentation.profile.ProfileScreen
import com.orels.thepack.presentation.profile.ProfileViewModel
import com.orels.thepack.presentation.trips.TripsScreen
import com.orels.thepack.presentation.trips.TripsViewModel
import com.orels.thepack.ui.theme.ThePackTheme
import dagger.hilt.android.AndroidEntryPoint

enum class Screen(val route: String, @DrawableRes val icon: Int, @StringRes val label: Int) {
    Main("main", R.drawable.home, R.string.label_main),
    Plans("plans", R.drawable.plans, R.string.label_plans),
    Profile("profile", R.drawable.profile, R.string.label_profile),
    Trips("trips", R.drawable.trips, R.string.label_trips),
    Chat("chat", R.drawable.chat, R.string.label_chat),
}

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThePackTheme {
                val navController = rememberNavController()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CustomScaffold(
                        navController = navController,
                        bottomBar = { BottomBar(navController = navController) },
                    ) { paddingValue ->
                        NavHost(
                            navController = navController,
                            startDestination = Screen.Plans.route,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValue)
                        ) {
                            composable(Screen.Main.route) {
                                val viewModel = hiltViewModel<MainViewModel>()
                                val onEvent = viewModel::onEvent
                                MainScreen(
                                    state = viewModel.state,
                                    onEvent = onEvent
                                )
                            }
                            composable(Screen.Plans.route) {
                                val viewModel = hiltViewModel<PlansViewModel>()
                                val onEvent = viewModel::onEvent
                                PlansScreen(
                                    state = viewModel.state,
                                    onEvent = onEvent
                                )
                            }
                            composable(Screen.Profile.route) {
                                val viewModel = hiltViewModel<ProfileViewModel>()
                                val onEvent = viewModel::onEvent
                                ProfileScreen(
                                    state = viewModel.state,
                                    onEvent = onEvent
                                )
                            }
                            composable(Screen.Trips.route) {
                                val viewModel = hiltViewModel<TripsViewModel>()
                                val onEvent = viewModel::onEvent
                                TripsScreen(
                                    state = viewModel.state,
                                    onEvent = onEvent
                                )
                            }
                            composable(Screen.Chat.route) {
                                val viewModel = hiltViewModel<ChatViewModel>()
                                val onEvent = viewModel::onEvent
                                ChatScreen(
                                    state = viewModel.state,
                                    onEvent = onEvent
                                )
                            }

                        }
                    }
                }
            }
        }
    }
}
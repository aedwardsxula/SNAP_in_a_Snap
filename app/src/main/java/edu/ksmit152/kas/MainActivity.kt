package edu.ksmit152.kas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import edu.ksmit152.kas.ui.feature.home.HomeScreen
import edu.ksmit152.kas.ui.feature.home.HomeViewModel
import edu.ksmit152.kas.ui.theme.KASTheme

class MainActivity : ComponentActivity() {

    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            KASTheme {
                HomeScreen(
                    viewModel = homeViewModel,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
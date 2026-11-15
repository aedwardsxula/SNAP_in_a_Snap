package edu.ksmit152.kas.ui.feature.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp




@Composable
fun TravelModeSelector() : String {

    var selectedMode by remember { mutableStateOf("Walk") }

    val options = listOf(
        Triple("Car", Icons.Default.DirectionsCar, "Car"),
        Triple("Bus", Icons.Default.DirectionsBus, "Bus"),
        Triple("Walk", Icons.AutoMirrored.Filled.DirectionsWalk, "Walk")
    )

    SingleChoiceSegmentedButtonRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        options.forEachIndexed { index, (label, icon, value) ->

            SegmentedButton(
                selected = selectedMode == value,
                onClick = {
                    selectedMode = value
                },
                shape = SegmentedButtonDefaults.itemShape(
                    index = index,
                    count = options.size
                ),
                icon = {},
                label = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null
                        )

                        Text(text = label)
                    }
                }
            )
        }
    }

    return selectedMode
}
@Composable
fun EnterZipCode() {

    val approvedZipCodes = listOf(
        "70117"
    )

    var zipCode by remember { mutableStateOf("") }

    val isInvalid = zipCode.isNotEmpty() &&
            zipCode !in approvedZipCodes

    OutlinedTextField(
        value = zipCode,
        onValueChange = { zipCode = it },
        placeholder = {
            Text(
                text = "eg.${approvedZipCodes.first()}",
                color = Color.Gray
            )
        },
        isError = isInvalid,
        textStyle = TextStyle(
            color = if (isInvalid) Color.Red else Color.Black
        ),
        supportingText = {
            if (isInvalid) {
                Text(
                    text = "Enter an approved ZIP code",
                    color = Color.Red
                )
            }
        },
        singleLine = true
    )
}

@Composable
fun ZipCodeAndTravelOptions () {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            verticalAlignment = Alignment.Top
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text("Enter zip code")
                EnterZipCode()
            }

            Column(
                modifier = Modifier.weight(2f)
            ) {
                Text("How will you get there?")
                TravelModeSelector()
            }
        }
    }
}
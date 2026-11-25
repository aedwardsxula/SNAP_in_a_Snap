package edu.ksmit152.kas.ui.feature.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import java.util.Locale

@Composable
fun SnapBudget() {
    var budget by rememberSaveable { mutableStateOf("") }

    val amount = budget.toDoubleOrNull()
    val validBudget = amount != null && amount.isFinite() && amount >= 0

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "SNAP Budget",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = budget,
                onValueChange = { budget = it },
                label = { Text("Enter your SNAP budget") },
                prefix = { Text("$") },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Decimal
                ),
                singleLine = true,
                isError = budget.isNotEmpty() && !validBudget,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(12.dp))

            if (validBudget) {
                Text(
                    "Available budget: " +
                            String.format(Locale.US, "$%.2f", amount)
                )
            } else if (budget.isNotEmpty()) {
                Text(
                    text = "Please enter a valid budget",
                    color = MaterialTheme.colorScheme.error
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedButton(
                onClick = { budget = "" }
            ) { Text("Reset Budget")
            }
        }
    }
}
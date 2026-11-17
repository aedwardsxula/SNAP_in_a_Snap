package edu.ksmit152.kas.ui.feature.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import edu.ksmit152.kas.data.model.GroceryItem
import edu.ksmit152.kas.data.source.GroceryData
import java.util.Locale

@Composable
fun GroceryListScreen() {
    val groceries = GroceryData.getAllItems()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "SNAP in a SNAP",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Grocery List",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {
            items(groceries) { grocery ->
                GroceryItemCard(grocery)
            }
        }
    }
}

@Composable
fun GroceryItemCard(grocery: GroceryItem) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = grocery.name,
                style = MaterialTheme.typography.titleMedium
            )

            Text(
                text = grocery.description,
                style = MaterialTheme.typography.bodyMedium
            )

            Text(
                text = grocery.category,
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                text = String.format(
                    Locale.US,
                    "$%.2f",
                    grocery.price
                ),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}


package edu.ksmit152.kas


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



private val Cream = Color(0xFFFAF5EA)
private val Purple = Color(0xFF501B63)
private val Lavender = Color(0xFFAA91B2)
private val DarkText = Color(0xFF251D27)
private val Border = Color(0xFFE5DED4)

class ShoppingList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                GroceryScreen()
            }
        }
    }
}

@Composable
fun GroceryScreen() {

    var newItem by remember { mutableStateOf("") }
    var search by remember { mutableStateOf("") }

    val categories = listOf(
        "All", "Breakfast", "Lunch", "Dinner",
        "Snacks", "Produce", "Pantry"
    )

    var selectedCategory by remember {
        mutableStateOf("All")
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Cream
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
                .background(
                    Color.White,
                    RoundedCornerShape(28.dp)
                )
                .padding(20.dp)
        ) {

            Text(
                text = "Your shopping list",
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                color = DarkText
            )

            Spacer(modifier = Modifier.height(22.dp))

            Text(
                text = "Tell us what you need",
                fontSize = 19.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = newItem,
                onValueChange = { newItem = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text("e.g. milk, eggs, something for dinner")
                },
                minLines = 2,
                shape = RoundedCornerShape(24.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(68.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Lavender
                ),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    "+  Add to my list",
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Search items to add",
                fontSize = 19.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text("Try milk, rice, diapers...")
                },
                shape = RoundedCornerShape(30.dp),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                categories.forEach { category ->

                    FilterChip(
                        selected = selectedCategory == category,
                        onClick = {
                            selectedCategory = category
                        },
                        label = { Text(category) }
                    )
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(65.dp),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    "🛒 Use my usual cart",
                    color = Purple,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "Based on your past trips",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                color = DarkText
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Your list is empty. Search above or use your usual cart.",
                fontSize = 17.sp,
                color = Color.DarkGray
            )
        }
    }
}
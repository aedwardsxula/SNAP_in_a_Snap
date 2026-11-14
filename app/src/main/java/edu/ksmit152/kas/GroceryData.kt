package edu.ksmit152.kas

object GroceryData {

    val items = listOf(

        // These are just sample data that can be changed or added onto in the future
        // als why the prices are 0 right now
        // Fruits
        GroceryItem("Bananas", 1.49, "Fresh bananas", 0, "Fruits"),
        GroceryItem("Apples", 3.99, "Fresh apples", 0, "Fruits"),
        GroceryItem("Oranges", 4.29, "Fresh oranges", 0, "Fruits"),
        GroceryItem("Strawberries", 3.49, "Fresh strawberries", 0, "Fruits"),
        GroceryItem("Grapes", 4.99, "Fresh grapes", 0, "Fruits"),

        // Vegetables
        GroceryItem("Carrots", 1.29, "Fresh carrots", 0, "Vegetables"),
        GroceryItem("Broccoli", 2.49, "Fresh broccoli", 0, "Vegetables"),
        GroceryItem("Spinach", 2.99, "Fresh spinach", 0, "Vegetables"),
        GroceryItem("Potatoes", 4.49, "Fresh potatoes", 0, "Vegetables"),
        GroceryItem("Tomatoes", 2.79, "Fresh tomatoes", 0, "Vegetables"),

        // Meat & Protein
        GroceryItem("Chicken Breast", 8.99, "Fresh chicken", 0, "Meat & Protein"),
        GroceryItem("Ground Beef", 6.49, "Ground beef", 0, "Meat & Protein"),
        GroceryItem("Ground Turkey", 5.49, "Ground turkey", 0, "Meat & Protein"),
        GroceryItem("Canned Tuna", 1.19, "Tuna in a can", 0, "Meat & Protein"),
        GroceryItem("Black Beans", 0.99, "Canned black beans", 0, "Meat & Protein"),

        // Dairy & Eggs
        GroceryItem("Whole Milk", 3.79, "Whole milk", 0, "Dairy & Eggs"),
        GroceryItem("Large Eggs", 3.49, "12 large eggs", 0, "Dairy & Eggs"),
        GroceryItem("Cheddar Cheese", 2.99, "Shredded cheese", 0, "Dairy & Eggs"),
        GroceryItem("Greek Yogurt", 4.49, "Plain yogurt", 0, "Dairy & Eggs"),
        GroceryItem("Butter", 4.29, "Regular butter", 0, "Dairy & Eggs"),

        // Grains & Bread
        GroceryItem("White Rice", 3.49, "White rice", 0, "Grains & Bread"),
        GroceryItem("Brown Rice", 3.99, "Brown rice", 0, "Grains & Bread"),
        GroceryItem("Wheat Bread", 2.49, "Wheat bread", 0, "Grains & Bread"),
        GroceryItem("Pasta", 1.49, "Regular pasta", 0, "Grains & Bread"),
        GroceryItem("Oatmeal", 3.99, "Plain oatmeal", 0, "Grains & Bread"),

        // Snacks & Drinks
        GroceryItem("Peanut Butter", 2.49, "Creamy peanut butter",0, "Snacks & Drinks"),
        GroceryItem("Popcorn", 2.99, "Regular popcorn", 0, "Snacks & Drinks"),
        GroceryItem("Crackers", 2.79, "Snack crackers", 0, "Snacks & Drinks"),
        GroceryItem("Orange Juice", 3.99, "Orange juice", 0, "Snacks & Drinks"),
        GroceryItem("Apple Juice", 2.99, "Apple juice", 0, "Snacks & Drinks")
    )
}

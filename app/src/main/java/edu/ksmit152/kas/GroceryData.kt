
package edu.ksmit152.kas

object GroceryData {

    // This is just sample grocery data for now.
    // More items will be added and the data will be updated later.

    val items = listOf(

        // Fruits
        GroceryItem("Bananas", 1.49, "Fresh bananas", "Fruits"),
        GroceryItem("Apples", 3.99, "Fresh apples", "Fruits"),
        GroceryItem("Oranges", 4.29, "Fresh oranges", "Fruits"),
        GroceryItem("Strawberries", 3.49, "Fresh strawberries", "Fruits"),
        GroceryItem("Grapes", 4.99, "Fresh grapes", "Fruits"),

        // Vegetables
        GroceryItem("Carrots", 1.29, "Fresh carrots", "Vegetables"),
        GroceryItem("Broccoli", 2.49, "Fresh broccoli", "Vegetables"),
        GroceryItem("Spinach", 2.99, "Fresh spinach", "Vegetables"),
        GroceryItem("Potatoes", 4.49, "Fresh potatoes", "Vegetables"),
        GroceryItem("Tomatoes", 2.79, "Fresh tomatoes", "Vegetables"),

        // Meat & Protein
        GroceryItem("Chicken Breast", 8.99, "Fresh chicken", "Meat & Protein"),
        GroceryItem("Ground Beef", 6.49, "Ground beef", "Meat & Protein"),
        GroceryItem("Ground Turkey", 5.49, "Ground turkey", "Meat & Protein"),
        GroceryItem("Canned Tuna", 1.19, "Tuna in a can", "Meat & Protein"),
        GroceryItem("Black Beans", 0.99, "Canned black beans", "Meat & Protein"),

        // Dairy & Eggs
        GroceryItem("Whole Milk", 3.79, "Whole milk", "Dairy & Eggs"),
        GroceryItem("Large Eggs", 3.49, "12 large eggs", "Dairy & Eggs"),
        GroceryItem("Cheddar Cheese", 2.99, "Shredded cheese", "Dairy & Eggs"),
        GroceryItem("Greek Yogurt", 4.49, "Plain yogurt", "Dairy & Eggs"),
        GroceryItem("Butter", 4.29, "Regular butter", "Dairy & Eggs"),

        // Grains & Bread
        GroceryItem("White Rice", 3.49, "White rice", "Grains & Bread"),
        GroceryItem("Brown Rice", 3.99, "Brown rice", "Grains & Bread"),
        GroceryItem("Wheat Bread", 2.49, "Wheat bread", "Grains & Bread"),
        GroceryItem("Pasta", 1.49, "Regular pasta", "Grains & Bread"),
        GroceryItem("Oatmeal", 3.99, "Plain oatmeal", "Grains & Bread"),

        // Snacks & Drinks
        GroceryItem("Peanut Butter", 2.49, "Creamy peanut butter", "Snacks & Drinks"),
        GroceryItem("Popcorn", 2.99, "Regular popcorn", "Snacks & Drinks"),
        GroceryItem("Crackers", 2.79, "Snack crackers", "Snacks & Drinks"),
        GroceryItem("Orange Juice", 3.99, "Orange juice", "Snacks & Drinks"),
        GroceryItem("Apple Juice", 2.99, "Apple juice", "Snacks & Drinks")
    )

    fun getAllItems(): List<GroceryItem> {
        return items
    }

    fun getCategories(): List<String> {
        return items.map { it.category }.distinct()
    }

    fun getItemsByCategory(category: String): List<GroceryItem> {
        if (category.equals("All", ignoreCase = true)) {
            return items
        }

        return items.filter {
            it.category.equals(category, ignoreCase = true)
        }
    }

    fun searchItems(name: String): List<GroceryItem> {
        return items.filter {
            it.name.contains(name, ignoreCase = true)
        }
    }
}

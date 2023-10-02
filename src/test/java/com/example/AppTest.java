package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.testng.Assert;
//import org.testng.Assert;
//import org.testng.annotations.Test;

public class AppTest 
{
   
    @Test
    public void testAddItemsToCart()
    {
        boolean itemExistsInCart = isItemInCart("chocolate Ice Cream");
        Assert.assertTrue(itemExistsInCart, "Chocolate Ice Cream item not found in the cart");
    }
    private boolean isItemInCart(String itemName) {
        // Implement logic to check if the item is in the cart
        return true; // Replace with your actual logic
    }
}

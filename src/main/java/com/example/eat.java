package com.example;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class eat {

    public static void main(String[] args) {
        // Create a new Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://order.eatmeglobal.org/sg/entre-nouscreperie-?id=b2eed485-a8b9-42b3-a63c-225f9ed6d021&diningMode=pickup");
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement popupButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
        popupButton.click();

        WebElement continueButton = driver.findElement(By.id("mui-13"));
       
        continueButton.click();

        WebElement finishButton = driver.findElement(By.id("mui-13"));
        finishButton.click();
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div/button[2]"));
        searchButton.click();
         WebElement searchBar = driver.findElement(By.id("input-with-sx"));
            searchBar.sendKeys("Chocolate Ice Cream");

            // Press Enter to initiate the search (if needed)
           // searchBar.sendKeys(Keys.RETURN); // You can use Keys.ENTER instead of Keys.RETURN if ENTER key is required
           WebElement chocolateIceCream = driver.findElement(By.xpath("//*[@id='5989_40899']/button/div"));
           chocolateIceCream.click();

          
          


            
    }
}
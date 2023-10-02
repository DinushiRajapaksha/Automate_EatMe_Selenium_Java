package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class e {

    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();

        driver.get("https://order.eatmeglobal.org/sg/entre-nouscreperie-?id=b2eed485-a8b9-42b3-a63c-225f9ed6d021&diningMode=pickup");
        driver.manage().window().maximize();

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

            
        WebElement radioButton = driver.findElement(By.xpath("//input[@type='checkbox' and @value='912']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", radioButton);

        WebElement sbutton = driver.findElement(By.id("mui-12"));
        sbutton.click();


        // Find and click the "Add to Basket" button
        WebElement addToBasketButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div/button"));
        addToBasketButton.click();

       
        WebElement inputField = driver.findElement(By.xpath("MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-w1jawv"));

        inputField.sendKeys("076803725");

        }
}
package com.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pom {

    public static void main(String[] args) {
        // Create a new Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to the restaurant website's home page
        driver.get("https://order.eatmeglobal.org/sg/entre-nouscreperie-?id=b2eed485-a8b9-42b3-a63c-225f9ed6d021&diningMode=pickup");
        driver.manage().window().maximize();

        try {
           

            // Create instances of Page Objects for Home Page and Basket Page
            HomePage homePage = new HomePage(driver);
            BasketPage basketPage = new BasketPage(driver);

            // Interact with the home page
            homePage.closePopup();
            homePage.clickContinueButton();
             homePage.clickFinishButton();
            homePage.clickSearchButton();
            homePage.enterSearchQuery("Chocolate Ice Cream");
            homePage.clickChocolateIceCream();
            homePage.clickRadioButton();

            // Add the selected item to the basket
            homePage.clickAddToBasketButton();

            // Interact with the basket page
            basketPage.enterPhoneNumber("076803725");
        } finally {
            // Close the browser when done
            //driver.quit();
        }
    }
}

// Page Object for Home Page
class HomePage {
    private WebDriver driver;
    
    // Define locators for elements on the home page
   // private By popupButtonLocator = By.id("onesignal-slidedown-cancel-button");
    private By continueButtonLocator = By.id("mui-13");
    private By finishButtonLocator = By.id("mui-13");
    private By searchButtonLocator = By.xpath("//*[@id='root']/div/div[1]/div[2]/div[1]/div/button[2]");
    private By searchBarLocator = By.id("input-with-sx");
    private By chocolateIceCreamLocator = By.xpath("//*[@id='5989_40899']/button/div");
    private By radioButtonLocator = By.xpath("//input[@type='checkbox' and @value='912']");
    private By addToBasketButtonLocator = By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div/button");
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void closePopup() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
         WebElement popupButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("onesignal-slidedown-cancel-button")));
        popupButton.click();
    }

    public void clickContinueButton() {
        WebElement continueButton = driver.findElement(continueButtonLocator);
        continueButton.click();
    }

     public void clickFinishButton() {
        WebElement FinishButton = driver.findElement(finishButtonLocator);
        FinishButton.click();
    }
    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    public void enterSearchQuery(String query) {
        WebElement searchBar = driver.findElement(searchBarLocator);
        searchBar.sendKeys(query);
    }

    public void clickChocolateIceCream() {
        WebElement chocolateIceCream = driver.findElement(chocolateIceCreamLocator);
        chocolateIceCream.click();
    }

    public void clickRadioButton() {
        WebElement radioButton = driver.findElement(radioButtonLocator);
        radioButton.click();
    }

    public void clickAddToBasketButton() {
        WebElement addToBasketButton = driver.findElement(addToBasketButtonLocator);
        addToBasketButton.click();
    }
}

// Page Object for Basket Page
class BasketPage {
    private WebDriver driver;

    // Define locators for elements on the basket page
    private By phoneNumberLocator = By.xpath("MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-w1jawv");

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterPhoneNumber(String phoneNumber) {
        WebElement phoneNumberField = driver.findElement(phoneNumberLocator);
        phoneNumberField.sendKeys(phoneNumber);
    }
}

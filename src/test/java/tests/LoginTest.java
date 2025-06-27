package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    @Test
    public void testValidLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Valid username and password
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        // Check success message
        WebElement successMsg = driver.findElement(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
        if (successMsg.isDisplayed()) {
            System.out.println("✅ Valid login test passed.");
        } else {
            System.out.println("❌ Valid login test failed.");
        }

        driver.quit();
    }

    @Test
    public void testInvalidLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Invalid username and password
        driver.findElement(By.id("username")).sendKeys("wrongUser");
        driver.findElement(By.id("password")).sendKeys("wrongPass");
        driver.findElement(By.id("submit")).click();

        // Check error message - this locator is based on the site structure
        WebElement errorMsg = driver.findElement(By.id("error"));
        if (errorMsg.isDisplayed()) {
            System.out.println("✅ Invalid login test passed.");
        } else {
            System.out.println("❌ Invalid login test failed.");
        }

        driver.quit();
    }
}

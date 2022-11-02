package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage
{
    // protected class accessible to the current package
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        // To do Auto-generated method sub
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // Method for unique id
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        System.out.println(timeStamp);

        // For keep fullscreen
        driver.manage().window().maximize();
        // Enter URL
        driver.get("https://demo.nopcommerce.com/");
        // Click on Register
        driver.findElement(By.className("ico-register")).click();
        // Enter First Name
        driver.findElement(By.id("FirstName")).sendKeys("Rajesh");
        // Enter Last Name
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        // Enter Email with unique id
        driver.findElement(By.id("Email")).sendKeys("rajeshpatelhh"+timeStamp+"@gmail.com");
        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("Test&1234");
        // Enter Confirm Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test&1234");
        // Click on Register Button
        driver.findElement(By.name("register-button")).click();

        // Get Text line after successfully Registartion in output
        String regMsg = driver.findElement(By.className("result")).getText();
        System.out.println(regMsg);

        // close website
        driver.quit();
    }
}

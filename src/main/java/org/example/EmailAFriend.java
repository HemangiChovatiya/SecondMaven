package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class EmailAFriend
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
        // Click on Apple MacBook Pro 13-inch on Homepage
        driver.findElement(By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        // Click on Email a friend on Apple MacBook Pro 13-inch page
        driver.findElement(By.className("email-a-friend")).click();
        // Enter friend's email on emailafriend page
        driver.findElement(By.className("friend-email")).sendKeys("bindupatel"+timeStamp+"@gmail.com");
        // Enter your email on emailafriend page
        driver.findElement(By.className("your-email")).sendKeys("hayatipatelhh@gmail.com");
        // Enter prsonal message on emailafriend page
        driver.findElement(By.id("PersonalMessage")).sendKeys("Hi..");
        // Click on SEND EMAIL on emailafriend page
        driver.findElement(By.name("send-email")).click();

        // Get Text line after click SEND EMAIL in output
        String emailMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        System.out.println(emailMsg);

        // close website
        driver.quit();

    }

}

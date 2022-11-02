package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComments
{
    // protected class accessible to the current package
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        // To do Auto-generated method sub
        System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        // For keep fullscreen
        driver.manage().window().maximize();
        // Enter URL
        driver.get("https://demo.nopcommerce.com/");
        // Click on Details of nopCommerce new release
        driver.findElement(By.xpath("//div[@class=\"news-head\"]/a[@href=\"/nopcommerce-new-release\"]")).click();
        // Enter Title on nopCommerce new release page
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Product");
        // Enter comment on nopCommerce new release page
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("All products are good.");
        // Click on New Comment on nopCommerce new release page
        driver.findElement(By.name("add-comment")).click();

        // Get Text line after successfully comments in output
        String newsComment = driver.findElement(By.className("result")).getText();
        System.out.println(newsComment);

        // close website
        driver.quit();
    }
}

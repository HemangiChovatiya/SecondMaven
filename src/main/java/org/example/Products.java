package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products
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
        // Click on Computers on Homepage
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        // Click on Desktops on Computers page
        driver.findElement(By.xpath("//h2/a[@href=\"/desktops\"]")).click();

        // Get as a text in output products of desktop(computers)
        String productComputer1 = driver.findElement(By.xpath("//h2/a[@href=\"/build-your-own-computer\"]")).getText();
        System.out.println(productComputer1);
        // Get as a text in output products of desktop(computers)
        String productComputer2 = driver.findElement(By.xpath("//h2/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        System.out.println(productComputer2);
        // Get as a text in output products of desktop(computers)
        String productComputer3 = driver.findElement(By.xpath("//h2/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        System.out.println(productComputer3);

        // close website
        driver.quit();
    }
}

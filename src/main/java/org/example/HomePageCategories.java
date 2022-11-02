package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories
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

        // Print categories on homepage
        System.out.println("Home-Page Categories");

        // Get name of Home-page Categories in output
        String homeCate1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]")).getText();
        System.out.println(homeCate1);
        // Get name of Home-page Categories in output
        String homeCate2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]")).getText();
        System.out.println(homeCate2);
        // Get name of Home-page Categories in output
        String homeCate3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]")).getText();
        System.out.println(homeCate3);
        // Get name of Home-page Categories in output
        String homeCate4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]")).getText();
        System.out.println(homeCate4);
        // Get name of Home-page Categories in output
        String homeCate5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]")).getText();
        System.out.println(homeCate5);
        // Get name of Home-page Categories in output
        String homeCate6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]")).getText();
        System.out.println(homeCate6);
        // Get name of Home-page Categories in output
        String homeCate7 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]")).getText();
        System.out.println(homeCate7);

        // close website
        driver.quit();
    }
}

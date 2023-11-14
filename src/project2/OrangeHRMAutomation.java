package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMAutomation {
    public static void main(String[] args) throws InterruptedException {
        //Step:1 Setup Chrome Browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        //Step:2 open Url
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        driver.get(baseUrl);
        Thread.sleep(5000);
        //Step:3 Print the title of the page
        System.out.println("Title of the page:" + driver.getTitle());
        //Step:4 Print the Current Url
        System.out.println("CurrentUrl:" + driver.getCurrentUrl());
        //Step:5 Print the page Source
        System.out.println("Page Source :" + driver.getPageSource());
        //Step:6 Click on 'Forgot your password' link
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        forgotPasswordLink.click();
        //Step:7 Print the Current Url
        System.out.println("Current url after clicking Forgot Password:" + driver.getCurrentUrl());
        //Step:8 Navigate back to the login page
        driver.navigate().back();
        //step:9 Refresh the page
        driver.navigate().refresh();
        //step :10 Enter email to email Field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("abcd@gmail.com");
        //Step 11:Enter password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("123456");
        //Step 12:Click on the Login Button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        //Step:13 Close the browser
        driver.quit();





    }
}

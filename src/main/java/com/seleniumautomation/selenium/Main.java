package com.seleniumautomation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "libs//chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("selim");

        WebElement email = driver.findElement(new By.ByCssSelector("#userEmail"));
        email.click();
        email.sendKeys("asda@hotmail.com");

        WebElement textArea = driver.findElement(new By.ByCssSelector("#currentAddress"));
        textArea.click();
        textArea.sendKeys("xxxx");

        WebElement address = driver.findElement(new By.ByCssSelector("#permanentAddress"));
        address.click();
        address.sendKeys("yyyyy");

        WebElement button = driver.findElement(new By.ByCssSelector("#submit"));
        button.click();


    }
}

package com.practicePackage.practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //HOME LINK
        WebElement homelink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        if(homelink.isDisplayed()){
            System.out.println("Homelink is a yes");
        }else{
            System.out.println("It is a no");
        }
        //System.out.println(homelink);
        //FORGOT PASSWORD HEADER
        WebElement header = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        if(header.isDisplayed()){
            System.out.println("Header is a yes");
        }else{
            System.out.println("it is a no");
        }
        //Email text
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
        if(emailText.isDisplayed()){
            System.out.println("Email text is a yes");
        }else{
            System.out.println("It is a no");
        }
        //Email input box
        WebElement inoutBox = driver.findElement(By.xpath("//input[@name='email']"));
        if(inoutBox.isDisplayed()){
            System.out.println("Inputbox is a yes");
        }else{
            System.out.println("It is a no");
        }
        //retrieve password button
        WebElement retrievebutton = driver.findElement(By.xpath("//i[.='Retrieve password']"));
        if(retrievebutton.isDisplayed()){
            System.out.println("Retrieve button is a yes");
        }else{
            System.out.println("It is a no");
        }

        //"Powered by Cybertek School" text
        WebElement textofCybertek = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        if(textofCybertek.isDisplayed()){
            System.out.println("Text is a yes");
        }else{
            System.out.println("It is a no");
        }


    }
}

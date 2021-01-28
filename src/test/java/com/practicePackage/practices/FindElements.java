package com.practicePackage.practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
    public static void main(String[] args) {
        //1- Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2- Go to the website
        driver.get("https://www.merriam-webster.com/");
        //3- print out the texts of all links
        String url = driver.getCurrentUrl();
        System.out.println(url);
        //6- print out how many total links





    }
}

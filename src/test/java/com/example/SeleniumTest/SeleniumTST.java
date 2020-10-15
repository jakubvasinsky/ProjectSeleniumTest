package com.example.SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class SeleniumTST {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();

       driver.get("https://github.com/jakubvasinsky");

    }



}

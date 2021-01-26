package com.example.SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumTST {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();

       driver.get("http://itsovy.sk/testing/");
        driver.manage().window().fullscreen();

        WebElement polickoAmmount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));

        WebElement polickoInterest = driver.findElement(By.xpath("//*[@id=\"interest\"]"));

        WebElement posuvadloPeriod = driver.findElement(By.xpath("//*[@id=\"period\"]"));

        WebElement  labelPeriod = driver.findElement(By.id("lblPeriod"));

        WebElement radioYes = driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[4]/td/input[1]"));
        WebElement radioNo = driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr[4]/td/input[2]"));

        WebElement polickoAgree = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));

        WebElement btnCalculate = driver.findElement(By.id("btnsubmit"));

        WebElement result = driver.findElement(By.id("result"));

        //////////////////////////////////////////////////


        polickoAmmount.sendKeys("111111");

        polickoInterest.sendKeys("5");

       /* Dimension sliderSize = posuvadloPeriod.getSize();
        int sliderWidth = sliderSize.getWidth();
        int xCoord = posuvadloPeriod.getLocation().getX();
        Actions builder = new Actions(driver);
        builder.moveToElement(posuvadloPeriod)
                .click()
                .dragAndDropBy
                        (posuvadloPeriod,xCoord + sliderWidth, 0)
                .build()
                .perform();*/

       /* posuvadloPeriod.getAttribute("value").equals("4");*/

        radioYes.click();
        radioYes.isSelected();
        polickoAgree.click();
        polickoAgree.isSelected();
        btnCalculate.click();


       /* driver.close();*/

    }



}

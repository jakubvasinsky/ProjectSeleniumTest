package com.example.SeleniumTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class CalculatorTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.edgedriver().setup();
    driver = new EdgeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void calculatorTest() {
    driver.get("http://itsovy.sk/testing/");
    driver.manage().window().setSize(new Dimension(1382, 784));
    driver.findElement(By.id("amount")).click();
    driver.findElement(By.id("amount")).sendKeys("5000");
    driver.findElement(By.id("interest")).click();
    driver.findElement(By.id("interest")).sendKeys("11");
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("period")).sendKeys("2");
    driver.findElement(By.id("period")).click();
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("period")).sendKeys("3");
    driver.findElement(By.id("period")).click();
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    driver.findElement(By.name("tax")).click();
    driver.findElement(By.id("confirm")).click();
    driver.findElement(By.id("btnreset")).click();
    driver.findElement(By.id("amount")).click();
    driver.findElement(By.id("amount")).sendKeys("1456");
    driver.findElement(By.id("interest")).click();
    driver.findElement(By.id("interest")).sendKeys("4");
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("period")).sendKeys("5");
    driver.findElement(By.id("period")).click();
    driver.findElement(By.cssSelector("input:nth-child(3)")).click();
    driver.findElement(By.id("confirm")).click();
    driver.findElement(By.id("btnsubmit")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) > th"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) > th"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(1) > th"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(1)")).click();
    driver.findElement(By.id("amount")).sendKeys("-25");
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > th"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > th"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > th"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("tr:nth-child(2)")).click();
    driver.findElement(By.id("interest")).sendKeys("-1");
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.id("period"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.id("period")).sendKeys("1");
    driver.findElement(By.id("period")).click();
    driver.findElement(By.name("tax")).click();
    driver.findElement(By.id("btnsubmit")).click();
  }
  {
    WebElement errorMessage1 = driver.findElement(By.xpath("//*[@id=\"error\"]/text()[1]"));
    WebElement errorMessage2 = driver.findElement(By.xpath("//*[@id=\"error\"]/text()[2]"));
    WebElement errorMessage3 = driver.findElement(By.xpath("//*[@id=\"error\"]/text()[3]"));

    errorMessage1.equals("Amount must be a number between 0 and 1000000 !");
    errorMessage2.equals("Interest must be a number between 0 and 100 !");
    errorMessage3.equals("You must agree to the processing !");
  }


}

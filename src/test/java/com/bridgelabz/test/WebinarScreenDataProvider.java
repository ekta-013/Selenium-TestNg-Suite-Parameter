package com.bridgelabz.test;

import com.bridgelabz.main.BaseClass;
import com.bridgelabz.main.DataProviderD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class WebinarScreenDataProvider extends BaseClass {
    @Test(description = "Webinar Screen Automation", priority = 0, dataProvider = "dataProvider",dataProviderClass = DataProviderD.class)
    public void WebinarScreen(String phoneNo, String emailId, String userName) throws InterruptedException {
        driver.get("https://bldev.bridgelabz.com/webinar");

        boolean flag = driver.findElement(By.id("deftphnumber")).isDisplayed();
        if (flag){
            Thread.sleep(500);
            driver.findElement(By.id("deftphnumber")).sendKeys(phoneNo);
            Thread.sleep(500);
        }
        Thread.sleep(500);
        driver.findElement(By.id("deftemail")).sendKeys(emailId);
        Thread.sleep(500);

        driver.findElement(By.id("deftusername")).sendKeys(userName);
        Thread.sleep(500);

        List<WebElement> elements = driver.findElements(By.xpath("//div"));
        System.out.println("No of elements: " +elements.size());
        for (int i=0; i<elements.size(); i++){
            System.out.println("Element text: "+elements.get(i).getAttribute("value"));
        }
    }
  @Test(dataProvider = "dataProvider",dataProviderClass = DataProviderD.class)
  public void phoneNo(String phoneNo) throws InterruptedException {
      driver.get("https://bldev.bridgelabz.com/webinar");
      driver.findElement(By.id("deftphnumber")).sendKeys(phoneNo);
      Thread.sleep(500);
  }
}


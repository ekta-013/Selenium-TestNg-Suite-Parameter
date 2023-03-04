package com.bridgelabz.test;

import com.bridgelabz.main.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FbLoginUsingRobotClass extends BaseClass {
    @Test
    public void RobotClass() throws AWTException {
        driver.get("https://www.facebook.com/");
        Robot robot = new Robot();
        robot.delay(1000);
        driver.findElement(By.id("email")).sendKeys("ektamo0123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("9876543210");
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);


    }
}

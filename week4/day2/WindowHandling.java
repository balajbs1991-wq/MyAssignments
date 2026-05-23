package org.week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/");
        driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window: " + parentWindow);
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All Windows: " + allWindows);
        List<String> windowsList = new ArrayList<String>(allWindows);
        driver.switchTo().window(windowsList.get(1));   
        String childTitle = driver.getTitle();      
        System.out.println("Child Window Title: " + childTitle);
        driver.switchTo().window(parentWindow);
        String parentTitle = driver.getTitle();         
        System.out.println("Parent Window Title: " + parentTitle);
          driver.close();
          driver.switchTo().window(windowsList.get(1));
          System.out.println("Child Window Title: " + childTitle);
    }
}

package org.week5.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frames {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
         driver.manage().window().maximize();
         driver.switchTo().frame("iframeResult");
         driver.findElement(By.xpath("//button[text()='Try it']")).click();
         Alert popup = driver.switchTo().alert();
         popup.accept();
         WebElement message =driver.findElement(By.xpath("//p[text()='You pressed OK!']"));
         String text = message.getText();
         System.out.println(text);
    }
}
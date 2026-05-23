package org.Week2.Day2;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TestLeafLogin {
    public static void main(String[] args) {
         ChromeOptions options = new ChromeOptions();
         options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options );
       
       
        driver.get("https://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");  
        driver.findElement(By.className("decorativeSubmit")).click(); 
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Balaji ");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subramaniyan");
        WebElement IndustryElement = driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select industrySelect = new Select(IndustryElement);
        industrySelect.selectByIndex(1);
        driver.findElement(By.className("smallSubmit")).click();
    }

}

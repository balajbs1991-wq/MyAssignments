package org.week5.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class WebTable {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.id("txtStationFrom")).clear();
        driver.findElement(By.id("txtStationFrom")).sendKeys("MAS", Keys.ENTER);
        driver.findElement(By.id("txtStationTo")).clear();
        driver.findElement(By.id("txtStationTo")).sendKeys("MDU", Keys.ENTER);
        driver.findElement(By.id("chkSelectDateOnly")).click();

        List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class, 'TrainList')]//tr/td[2]"));
        List<String> allTrainNames = new ArrayList<>();
        System.out.println("All Available trains List:");
        for (WebElement AllTrain : trainNames) {
             String trainName = AllTrain.getText();
             allTrainNames.add(trainName);
             System.out.println(trainName);
        }
        System.out.println("Total number of trains: " + allTrainNames.size());
        Set<String> uniqueTrainNames = new LinkedHashSet<>(allTrainNames);
        System.out.println("No. of trains without duplicates: " + uniqueTrainNames.size());
        if (allTrainNames.size() == uniqueTrainNames.size()) {
            System.out.println("So, No duplicate trains found!");
        } else {
            System.out.println("Duplicate train trains found!");
        }
        driver.quit();
    }
}
        


package org.week1.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class seleniumsetup {
    public static void main(String[] args) throws InterruptedException{
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
    }
}

package org.Week2.Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBroser {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }

}

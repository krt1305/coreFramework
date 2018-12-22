package com.drivers;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryPatternTest {

DriverManager driverManager;
WebDriver driver;



@BeforeTest
    public void beforeTest()
{
    driverManager=DriverManagerFactory.getDriverManager(DriverType.CHROME);
    driver=driverManager.getDriver();
}

    @Test
    public void launchGoogleTest() {
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }


@AfterTest
    public void afterTest()
{
    driverManager.quitDriver();
}


}

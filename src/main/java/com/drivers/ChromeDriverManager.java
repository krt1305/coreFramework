package com.drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    protected void startService() {
        if(chService==null)
        {
            chService=new ChromeDriverService.Builder().usingDriverExecutable(new File("src/main/resources/chromedriver")).usingAnyFreePort().build();

        }
    }

    @Override
    protected void stopService() {

        if(chService==null && chService.isRunning())
            chService.stop();

    }

    @Override
    protected void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setJavascriptEnabled(true);
        System.setProperty("webdriver.chrome.driver", "/Users/rabia/Desktop/chromedriver");
        driver = new ChromeDriver();

    }
}

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    private Propreader propreader = new Propreader();
    //private String URL =
    private String URL ="http://www.google.com";
    private static WebDriver driver;
    private static ThreadLocal<WebDriver> tdlocal = new ThreadLocal<>();


    public WebDriver init_driver(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chrome-win64\\chrome.exe");

        String value= propreader.getValue("url");
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        tdlocal.set(driver);

        getDriver().get(value);
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getDriver().manage().deleteAllCookies();
        return getDriver();

    }

    public static WebDriver getDriver(){
       return tdlocal.get();
    }

}

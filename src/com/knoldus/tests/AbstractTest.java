package com.knoldus.tests;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.knoldus.pages.Page;

public abstract class  AbstractTest {

  protected static Page page;

  @BeforeTest
  @Parameters({"url"})
  public void setup(String url) {
    // Set the path to the geckodriver
    System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
    FirefoxOptions options = new FirefoxOptions();
          
            options.addArguments("--headless");
            options.addArguments("--window-size=1580,1280");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            FirefoxDriver driver = new FirefoxDriver(options);
  

    // Instantiate a new Page and navigate
    // to the url specified in the testng.xml
    page = new Page(driver);
    page.navigate(url);
  }

  @AfterTest
  public void afterTest() {
    page.tearDown();
  }
}

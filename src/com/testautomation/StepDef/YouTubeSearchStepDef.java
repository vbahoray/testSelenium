package com.testautomation.StepDef;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testautomation.Utility.PropertiesFileReader;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class YouTubeSearchStepDef {
	public static WebDriver driver;
	
    @Given("^Chrome browser and enter url$")
    public void chrome_browser_and_enter_url() throws Throwable {
    	PropertiesFileReader obj = new PropertiesFileReader();
    	Properties properties=obj.getProperty();
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhav\\eclipse-workspace\\chromedriver_win32.chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(properties.getProperty("browser.baseURL"));
    	
        throw new PendingException();
    }

    @When("^Enter search criterion$")
    public void enter_search_criterion() throws Throwable {
    	driver.findElement(By.id("search")).sendKeys("selenium");
    	
        throw new PendingException();
    }

    @Then("^Click on search button$")
    public void click_on_search_button() throws Throwable {
    	driver.findElement(By.id("search-icon-legacy")).click();
    	
        throw new PendingException();
    }

}
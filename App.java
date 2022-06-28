package com.selenium.script.selenium_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
	                         //key                          //path
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayanth shetty\\Desktop\\devops classes\\chromedriver.exe");
	    ChromeOptions chromeOptions = new ChromeOptions();
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    
	    //automation
	    driver.get("http://3.18.225.78:8888/jayanth/");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
        driver.findElement(By.className("v-button")).click();
        
        driver.findElement(By.id("gwt-uid-5")).sendKeys("jayanth");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("shetty");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("xyz@abc.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("10/10/1988,");
		
		
		//click on save button
		driver.findElement(By.className("v-button-primary")).click();
		Thread.sleep(5000);
	    driver.quit();
	    
	    
    }

	    
}




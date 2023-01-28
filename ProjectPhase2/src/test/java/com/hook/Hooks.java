package com.hook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	WebDriver driver = new EdgeDriver();
	
    @Before
    public void setup() {
        // code to navigate to the Swiggy website and log in
    	
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id='location']")).sendKeys("cessana business park");
		driver.findElement(By.xpath("//span[@class='_2W-T9']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//input[@class='_2FkHZ']")).sendKeys("Biryani");
		driver.findElement(By.xpath("//button[2]")).click();
    }

    @After
    public void tearDown() {
        // code to log out and close the browser
    	driver.close();
    }
}

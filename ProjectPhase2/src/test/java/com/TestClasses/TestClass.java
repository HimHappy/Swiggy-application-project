package com.TestClasses;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestClass {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@id='location']")).sendKeys("cessana business park");
//		driver.findElement(By.xpath("//*[@class='_3iFC5']")).click();
		//span[@class='_2W-T9']
		driver.findElement(By.xpath("//span[@class='_2W-T9']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		driver.findElement(By.xpath("//input[@class='_2FkHZ']")).sendKeys("Biryani");
		driver.findElement(By.xpath("//button[2]")).click();
		//xpath for new panjabi hotel
		//*[@class='styles_container__2GTLR styles_containerV2__1_U51']//descendant::div[3]
	}

}

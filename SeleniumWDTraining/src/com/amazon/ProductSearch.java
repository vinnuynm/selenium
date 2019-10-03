package com.amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductSearch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipseWorkSpace\\SeleniumWDTraining\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.findElement(By.id("searchDropdownBox")).sendKeys("Electronics");
		driver.findElement(By.name("field-keywords")).sendKeys("Iphone 8 64 gb gold");
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
	}
}

package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.master.Pagefactory.MasterPageFactory1;

public class GreenGroupPageFactory {
	public static void main(String[] args) {
		GreenGroupPageFactory.pageFactoryCodding();
	}
	public static void pageFactoryCodding() {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php?");
		System.out.println(driver.getCurrentUrl());
		
		MasterPageFactory1 obj = new MasterPageFactory1(driver);
		obj.getSignIn().click();
		obj.getEmail().sendKeys("sarowerny@gmail.com");
		obj.getPasswd().sendKeys("student");
		obj.getSubmitLogin().click();
		//WebElement signIn = driver.findElement(By.xpath("//*[contains(text(),'Sign in"));
		//signIn.click();
        driver.quit();
	
	}
	
}

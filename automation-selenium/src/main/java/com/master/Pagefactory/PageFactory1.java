package com.master.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory1 { //java encapsulation
	
	public PageFactory1(WebDriver driver) { //to remove null pointer exception	
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[contains(text(),'Sign in")//selenium
	private WebElement signinbtn;
	
	@FindBy(xpath="//*[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//*[@id='passwd']")
	private WebElement pass;
	
	@FindBy(xpath="//*[@class='icon-lock left']")
	private WebElement loginbtn;

	
	public WebElement getSigninbtn() {
		return signinbtn;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	}
	



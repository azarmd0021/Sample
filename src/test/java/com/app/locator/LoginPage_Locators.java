package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class LoginPage_Locators extends BaseClass {
	public static WebElement getuser() {
		return driver.findElement(By.id("username"));	
	}
	
	public static WebElement getpass() {
		return driver.findElement(By.id("password"));
	}
	
	public static WebElement getlogin_Button() {
		return driver.findElement(By.id("login"));
	}
	public static WebElement getStudentReg(String data) {
		return driver.findElement(By.xpath("//label[text()='"+data+"']//following::input[1]"));
		
	}
	
	
}

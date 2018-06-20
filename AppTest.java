package com.maven.qa.div;

import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.testng.AssertJUnit;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.*;


public class AppTest
{
	WebDriver driver;
	logindetails hrislogin;

	String expectedURL = "https://hris.qainfotech.com:8086/time/timesheet";
	
	@BeforeClass
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
		hrislogin = new logindetails(driver);
	}
	
	@Test(expectedExceptions = NoSuchElementException.class)
	public void login()
	{
		hrislogin.loginform("Akashtyagi","Akash@321#");
		Assert.assertFalse(hrislogin.isDisplayed());
	}
	
    
   
}

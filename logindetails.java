package com.maven.qa.div;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class logindetails 
	{
		WebDriver driver;
		WebElement username;
		
		public logindetails(WebDriver driver)
		{
			this.driver = driver;
		}
		
		private WebElement getusername()
		{
			return this.driver.findElement(By.xpath("//*[@id=\"txtUserName\"]"));
		}
		
		private WebElement getpassword()
		{
			return this.driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		}
		
		public void loginform(String username, String password)
		{
			getusername().sendKeys(username);
	       		getpassword().sendKeys(password);
	       		getpassword().submit();
		}
		
		public Boolean isDisplayed()
		{
			return getpassword().isDisplayed();
		}
	}

}

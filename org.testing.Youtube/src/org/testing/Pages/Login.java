package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	public void signin(String user, String Password) throws InterruptedException
	{
		WebElement sign=driver.findElement(By.xpath(pr.getProperty("Sign")));
		sign.click();
		WebElement usid=driver.findElement(By.id(pr.getProperty("User")));
		usid.sendKeys(user);
		WebElement nxt=driver.findElement(By.xpath(pr.getProperty("Next1")));
		nxt.click();
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.name(pr.getProperty("Password")));
		pass.sendKeys(Password);
		WebElement nxt2=driver.findElement(By.xpath(pr.getProperty("Next2")));
		nxt2.click();
	}
}

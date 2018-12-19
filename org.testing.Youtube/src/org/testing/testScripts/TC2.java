package org.testing.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base
{
	
	
	@Test
	public void tc2() throws InterruptedException
	{
		Login l=new Login(driver, pr);
		l.signin("crmtechnical908@gmail.com", "xxxxxxxx");
		Thread.sleep(3000);
		WebElement sbus=driver.findElement(By.xpath(pr.getProperty("Subscription")));
		sbus.click();
	}
		
		
}

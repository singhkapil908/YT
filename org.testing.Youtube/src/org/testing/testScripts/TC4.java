package org.testing.testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.video_play;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends Base
{

	
	@Test
	public void tc4() throws InterruptedException
	{
		Login l=new Login(driver, pr);
		l.signin("crmtechnical908@gmail.com", "xxxxxxx");
		video_play v=new video_play(driver, pr);
		v.video();
		Thread.sleep(5000);
		WebElement lik=driver.findElement(By.xpath(pr.getProperty("Like")));
		lik.click();
		Thread.sleep(5000);
		WebElement subs=driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		subs.click();
	}
	
	
}

package org.testing.Pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class video_play 
{
	ChromeDriver driver; 
	Properties pr;
	public video_play(ChromeDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void video() throws InterruptedException
	{
		Thread.sleep(5000);
		List<WebElement> ls=driver.findElements(By.id(pr.getProperty("Video")));
		ls.get(1).click();				
	}
}
	
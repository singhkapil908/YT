package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\JAVA\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		File f=new File("D:\\JAVA\\PROGRAM\\org.testing.Youtube\\ytor.properties");
		FileInputStream fi=new FileInputStream(f);
		pr=new Properties();
		pr.load(fi);
	}
	
	@AfterMethod
	public void end() throws InterruptedException
	{
		Thread.sleep(9000);
		driver.close();
	}
}

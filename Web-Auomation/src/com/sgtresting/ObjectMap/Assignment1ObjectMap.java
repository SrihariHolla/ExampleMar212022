package com.sgtresting.ObjectMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1ObjectMap {
	public static WebDriver oBrowser=null;
	public static String filename = null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		deleteuser();
		logout();
		closeApplication();

		
	}
	private static void launchBrowser()
	{
		try
		{
			filename= "F:\\SeleniumAutomation\\Web-Auomation\\src\\ObjectMap\\objectmap.properties";   
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Web-Auomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("AdduserButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("lastName")).sendKeys("user1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("email")).sendKeys("user1@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("username")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("passwordCopy")).sendKeys("welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createUser")).click();
			Thread.sleep(1000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("userlist")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser")).click();
			Thread.sleep(1000);
			Alert oalert=oBrowser.switchTo().alert();
			String content=oalert.getText();
			System.out.println("content");
			oalert.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

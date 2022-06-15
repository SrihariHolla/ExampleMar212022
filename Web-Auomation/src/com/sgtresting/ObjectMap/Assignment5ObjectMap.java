package com.sgtresting.ObjectMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5ObjectMap {

	public static WebDriver oBrowser=null;
	public static String filename = null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
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
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("taskicon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("Addnew")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("NewCustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customername")).sendKeys("HariPrasad PVT ltd");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("CreateCustomer")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("Addnew")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("newProject")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ProjectName")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ProjectName")).sendKeys("Project-1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createProject")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("ProjectSetting")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ProjectAction")).click();
			Thread.sleep(1000); 
			oBrowser.findElement(objectmap.getLocator("ProjectDelete")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ProjectDeletePermanently")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("customersetting")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customeraction")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerDelete")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("customerDeletePermanently")).click();
			Thread.sleep(2000);
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

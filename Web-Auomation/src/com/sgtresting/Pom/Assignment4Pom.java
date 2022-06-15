package com.sgtresting.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Pom {

	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\SeleniumAutomation\\Web-Auomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getusername().sendKeys("admin");
			oPage.getpwd().sendKeys("manager");
			oPage.getlogin().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeflyoutwindow()
	{
		try
		{
			Thread.sleep(2000);
			oPage.getminimizeflyoutwindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createcustomer()
	{
		try
		{
			oPage.gettaskicon().click();
			Thread.sleep(1000);
			oPage.getAddnew().click();
			oPage.getNewCustomer().click();
			oPage.getcustomerLightBox_nameField().sendKeys("Arihant Pvt Ltd");
			Thread.sleep(1000);
			oPage.getcustomerLightBox_commitBtn().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifycustomer()
	{
		try
		{
			oPage.getcustomersetting().click();
			Thread.sleep(1000);
			oPage.getCustomerNameModify().click();
			Thread.sleep(1000);
			oPage.getcustomerNameinput().clear();
			oPage.getcustomerNameinput().sendKeys("Modified Customer");
			oPage.getcustomersetting().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			oPage.getcustomersetting().click();
			Thread.sleep(1000);
			oPage.getcustomeraction().click();
			oPage.getcustomerDelete().click();
			Thread.sleep(1000);
			oPage.getcustomerDeletePermanently().click();
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
			oPage.getlogout().click();
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
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

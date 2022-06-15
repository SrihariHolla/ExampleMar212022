package com.sgtresting.ObjectMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvaScena2ObjectMap {


	public static WebDriver oBrowser=null;
	public static String filename = null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeFlyOutWindow();
		createuser1();
		logoutAdmin();
		loginuser1();
		createuser2();
		logoutuser1();
		loginuser2();
		createuser3();
		logoutuser2();
		loginuser3();
		logoutuser3();
		loginuser2a();
		ModifyPassword3();
		logoutuser2a();
		loginuser3a();
		logoutuser3a();
		loginuser1a();
		ModifyPassword2();
		logoutuser1a();
		loginuser2b();
		logoutuser2b();
		loginAdmin2();
		ModifyPassword1();
		logoutAdmin2();
		loginuser11();
		logoutuser11();
		loginuser2c();
		deleteuser3();
		logoutuser2c();
		loginuser11c();
		deleteuser2();
		logoutuser11c();
		loginAdmin3();
		deleteuser1();
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
	private static void loginAdmin()
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
	private static void createuser1()
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAdmin()
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
	private static void loginuser1()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ExpolreActitime")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("AdduserButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("lastName")).sendKeys("user2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("email")).sendKeys("user2@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("username")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("welcome456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("passwordCopy")).sendKeys("welcome456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createUser")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1()
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
	private static void loginuser2()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("welcome456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ExpolreActitime")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("AdduserButton")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("firstName")).sendKeys("demo");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("lastName")).sendKeys("user3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("email")).sendKeys("user3@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("username")).sendKeys("demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("welcome789");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("passwordCopy")).sendKeys("welcome789");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createUser")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2()
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
	private static void loginuser3()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("welcome789");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("ExpolreActitime")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3()
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
	private static void loginuser2a()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("welcome456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifyPassword3()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlist3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("new789");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("passwordCopy")).sendKeys("new789");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechanges")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2a()
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
	private static void loginuser3a()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("new789");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3a()
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
	private static void loginuser1a()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("welcome123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifyPassword2()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlist2")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("new456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("passwordCopy")).sendKeys("new456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechanges")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1a()
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
	private static void loginuser2b()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("new456");
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2b()
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
	private static void loginAdmin2()
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
	private static void ModifyPassword1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlist")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("password")).sendKeys("new123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("passwordCopy")).sendKeys("new123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechanges")).click();
			Thread.sleep(1000);	Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutAdmin2()
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
	private static void loginuser11()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("new123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser11()
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
	private static void loginuser2c()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("new456");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser3()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);	
			oBrowser.findElement(objectmap.getLocator("deleteuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser")).click();
			Thread.sleep(1000);
			Alert o1=oBrowser.switchTo().alert();
			String value=o1.getText();
			System.out.println(value);
			o1.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2c()
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
	private static void loginuser11c()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("new123");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser2()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);	
			oBrowser.findElement(objectmap.getLocator("userlist2")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser")).click();
			Thread.sleep(1000);
			Alert o=oBrowser.switchTo().alert();
			String val=o.getText();
			System.out.println(val);
			o.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser11c()
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
	private static void loginAdmin3()
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
	private static void deleteuser1()
	{
		try
		{

			oBrowser.findElement(objectmap.getLocator("usericon")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userlist")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
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

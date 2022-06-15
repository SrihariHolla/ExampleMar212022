package com.sgtresting.Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvaScena2Pom {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdmin();
		minimizeflyoutwindow();
		createuser1();
		logout();
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
		loginuser1b();
		logoutuser1b();
		loginuser2c();
		deleteuser3();
		logoutuser2c();
		loginuser1c();
		deleteuser2();
		logoutuser1c();
		loginAdmin3();
		deleteuser1();
		logoutAdmin3();
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
	private static void loginAdmin()
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
			Thread.sleep(1000);
			oPage.getminimizeflyoutwindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1()
	{
		try
		{
			oPage.getAddusericon().click();
			oPage.getAdduserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("demo");
			oPage.getlastName().sendKeys("user1");
			oPage.getemail().sendKeys("user1@gmail.com");
			oPage.getusernameField().sendKeys("demouser1");
			oPage.getpassword().sendKeys("welcome123");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("welcome123");
			oPage.getCreateUser().click();
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
	private static void loginuser1()
	{
		try
		{
			oPage.getusername().sendKeys("demouser1");
			oPage.getpwd().sendKeys("welcome123");
			oPage.getlogin().click();
			oPage.getExpolreActitime().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try
		{
			oPage.getAddusericon().click();
			oPage.getAdduserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("demo");
			oPage.getlastName().sendKeys("user2");
			oPage.getemail().sendKeys("user2@gmail.com");
			oPage.getusernameField().sendKeys("demouser2");
			oPage.getpassword().sendKeys("welcome456");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("welcome456");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1()
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
	private static void loginuser2()
	{
		try
		{
			oPage.getusername().sendKeys("demouser2");
			oPage.getpwd().sendKeys("welcome456");
			oPage.getlogin().click();
			oPage.getExpolreActitime().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try
		{
			oPage.getAddusericon().click();
			oPage.getAdduserButton().click();
			Thread.sleep(1000);
			oPage.getfirstName().sendKeys("demo");
			oPage.getlastName().sendKeys("user3");
			oPage.getemail().sendKeys("user3@gmail.com");
			oPage.getusernameField().sendKeys("demouser3");
			oPage.getpassword().sendKeys("welcome789");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("welcome789");
			oPage.getCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2()
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
	private static void loginuser3()
	{
		try
		{
			oPage.getusername().sendKeys("demouser3");
			oPage.getpwd().sendKeys("welcome789");
			oPage.getlogin().click();
			oPage.getExpolreActitime().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3()
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
	private static void loginuser2a()
	{
		try
		{
			oPage.getusername().sendKeys("demouser2");
			oPage.getpwd().sendKeys("welcome456");
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifyPassword3()
	{
		try
		{
			oPage.getAddusericon().click();
			Thread.sleep(1000);
			oPage.getUserlist3().click();
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("new789");
			oPage.getpasswordCopy().sendKeys("new789");
			oPage.getsaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2a()
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
	private static void loginuser3a()
	{
		try
		{
			oPage.getusername().sendKeys("demouser3");
			oPage.getpwd().sendKeys("new789");
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3a()
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
	private static void loginuser1a()
	{
		try
		{
			oPage.getusername().sendKeys("demouser1");
			oPage.getpwd().sendKeys("welcome123");
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void ModifyPassword2()
	{
		try
		{
			oPage.getAddusericon().click();
			Thread.sleep(1000);
			oPage.getUserlist2().click();
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("new456");
			oPage.getpasswordCopy().sendKeys("new456");
			oPage.getsaveChanges().click();
			Thread.sleep(2000);
			}catch(Exception e)
		{
				e.printStackTrace();
			}
		}
	private static void logoutuser1a()
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
	private static void loginuser2b()
	{
		try
		{
			oPage.getusername().sendKeys("demouser2");
			oPage.getpwd().sendKeys("new456");
			oPage.getlogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2b()
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
	private static void loginAdmin2()
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
	private static void ModifyPassword1()
	{
		try
		{
			oPage.getAddusericon().click();
			oPage.getuserlist().click();
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("new123");
			oPage.getpasswordCopy().sendKeys("new123");
			oPage.getsaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
}
		private static void logoutAdmin2()
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
		private static void loginuser1b()
		{
			try
			{
				oPage.getusername().sendKeys("demouser1");
				oPage.getpwd().sendKeys("new123");
				oPage.getlogin().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logoutuser1b()
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
		private static void loginuser2c()
		{
			try
			{
				oPage.getusername().sendKeys("demouser2");
				oPage.getpwd().sendKeys("new456");
				oPage.getlogin().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteuser3()
		{
			try
			{
				oPage.getAddusericon().click();
				Thread.sleep(1000);	
				oPage.getdeleteuser3().click();
				Thread.sleep(1000);
				oPage.getdeleteuser().click();
				Thread.sleep(2000);
				Alert o1=oBrowser.switchTo().alert();
				String val1=o1.getText();
				System.out.println(val1);
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
				oPage.getlogout().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
		private static void loginuser1c()
		{
			try
			{
				oPage.getusername().sendKeys("demouser1");
				oPage.getpwd().sendKeys("new123");
				oPage.getlogin().click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
		private static void deleteuser2()
		{
			try
			{
				oPage.getAddusericon().click();
				Thread.sleep(1000);	
				oPage.getdeleteuser2().click();
				Thread.sleep(1000);
				oPage.getdeleteuser().click();
				Thread.sleep(2000);
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
		private static void logoutuser1c()
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
		private static void loginAdmin3()
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
		private static void deleteuser1()
		{
			try
			{
				oPage.getAddusericon().click();
				Thread.sleep(1500);
				oPage.getuserlist().click();
				Thread.sleep(1000);
				oPage.getdeleteuser().click();
				Thread.sleep(2000);
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
		private static void logoutAdmin3()
		{
			try
			{
				oBrowser.findElement(By.id("logoutLink")).click();
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

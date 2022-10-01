package Module1_FB_Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FB_LoginPage.Fb_Home_Page_2;
import FB_LoginPage.Fb_Home_Page_3;
import FB_LoginPage.Fb_Login_page_1;
import FB_LoginPage.Fb_Notification_Page_4;
import FB_LoginPage.Fb_logout_page_5;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;

public class TestClass extends BaseClass
{
	Fb_Login_page_1 login1;
	Fb_Home_Page_2 home2;
	Fb_Home_Page_3 home3;
	Fb_Notification_Page_4 noti;
	Fb_logout_page_5 logout;
	int TCID;
	

	@BeforeClass
	public void OpenBrowser()
	{
		
		initializeBrowser();
		login1=new Fb_Login_page_1(driver);
	    home2 = new Fb_Home_Page_2(driver);
	    home3 = new Fb_Home_Page_3(driver);
		noti = new Fb_Notification_Page_4(driver);
		logout = new Fb_logout_page_5(driver);	
	}
	
	@BeforeMethod
	public void LoginToApp() throws InterruptedException, IOException
	{
		
		login1.Login1createaccount();
		Thread.sleep(3000);
		login1.Login1CloseSignUp();
		Thread.sleep(3000);
		login1.Login1username(UtilityClass.getPFData("Userid"));
		login1.Login1password(UtilityClass.getPFData("Password"));
		login1.Login1loginbtn();
		Thread.sleep(2000);
		home2.Homepage2cliknotnow();
		Thread.sleep(2000);
		home2.Homepage2clikonsearch();
		home2.Homepage2findfriend(UtilityClass.getPFData("Name"));
	    Thread.sleep(3000);
		home3.Homepage3clikhome();
     	Thread.sleep(2000);
		home3.Homepage3cliktime();
		home3.Homepage3Clikcoverpic();
		Thread.sleep(3000);
		home3.Homepage3closepic();
		Thread.sleep(2000);
		logout.fblogout5clikpropic();
		Thread.sleep(3000);	
	}

    @Test
    public void VerifyUSerID() throws EncryptedDocumentException, IOException
    {
    	TCID = 105;
    	String actUser = logout.fblogout5verifyuser();
    	String expUserID = UtilityClass.getPFData("actUser");
    	Assert.assertEquals("Sandesh Jadhav", "Santosh Jadhav","Pass:Act & exp results are same");
    	
    }
	
	@AfterMethod
	public void LogoutFromApp(ITestResult result) throws IOException, InterruptedException
	{
			if(result.getStatus()==ITestResult.FAILURE) 
			{
				UtilityClass.captureScreenshot(driver, TCID);
			}
			Thread.sleep(3000);
			logout.fblogout5cliklogout();
		}
		
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	

}

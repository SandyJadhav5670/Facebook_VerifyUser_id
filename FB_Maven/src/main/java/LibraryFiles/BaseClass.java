package LibraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	public void initializeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\Desktop\\New folder (2)\\New folder\\FB_Maven\\Browser\\chromedriver.exe");						
	    driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");		
	}

}

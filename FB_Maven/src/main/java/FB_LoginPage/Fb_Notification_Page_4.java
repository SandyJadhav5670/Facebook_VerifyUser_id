package FB_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Notification_Page_4 
{
	@FindBy(xpath="") private WebElement ClikonNoti;
	@FindBy(xpath="") private WebElement ClikonWatch;
	
	public Fb_Notification_Page_4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Notipage4clikonNoti()
	{
		ClikonNoti.click();
	}
	public void Notipage4clikonwatch()
	{
		ClikonWatch.click();
	}

}

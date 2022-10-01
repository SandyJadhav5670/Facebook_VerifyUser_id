package FB_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Home_Page_3 
{
	@FindBy(xpath="(//span[@class='om3e55n1'])[1]") private WebElement ClickHomebtn;
	@FindBy(xpath="//span[text()='Sandesh Jadhav']") private WebElement Clicktimeline;
	@FindBy(xpath="//img[@data-imgperflogname='profileCoverPhoto']") private WebElement ClickCoverPic;
	@FindBy(xpath="//div[@class='cdum9rwi s8sjc6am eemk9rux m4pnbp5e ctyh02ob onc49dji wyg9jdsx']") private WebElement CloseCoverPic;
	
	public Fb_Home_Page_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Homepage3clikhome()
	{
		ClickHomebtn.click();
	}
	public void Homepage3cliktime()
	{
		Clicktimeline.click();
	}
	public void Homepage3Clikcoverpic()
	{
		ClickCoverPic.click();
	}
	public void Homepage3closepic()
	{
		CloseCoverPic.click();
	}

}

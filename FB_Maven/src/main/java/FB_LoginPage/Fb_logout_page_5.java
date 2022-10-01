package FB_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_logout_page_5
{
	@FindBy(xpath="//div[@class='om3e55n1 alzwoclg']") private WebElement Clickonprofilelogo;
	@FindBy(xpath="(//span[text()='Sandesh Jadhav'])[1]") private WebElement userid ;
	@FindBy(xpath="//span[text()='Log Out']") private WebElement ClikLogoutBtn;
	
	public Fb_logout_page_5(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void fblogout5clikpropic()
	{
		Clickonprofilelogo.click();		
	}
	public String fblogout5verifyuser()
	{
		String actUser = userid.getText();
		return actUser;
	}
	public void fblogout5cliklogout()
	{
		ClikLogoutBtn.click();
	}
	

}

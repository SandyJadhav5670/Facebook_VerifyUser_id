package FB_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Home_Page_2 
{
	@FindBy(xpath="(//span[text()='Not Now'])[2]") private WebElement ClikNotNow;
	@FindBy(xpath="(//input[@dir='ltr'])[1]") private WebElement ClikOnSearch;
	@FindBy(xpath="(//input[@dir='ltr'])[1]") private WebElement FindFriend;
	@FindBy(xpath="(//span[@class=\"b6ax4al1 lq84ybu9 hf30pyar om3e55n1\"])[1]") private WebElement ClikOnFriendName;

	public Fb_Home_Page_2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Homepage2cliknotnow()
	{
		ClikNotNow.click();
	}
	public void Homepage2clikonsearch()
	{
		ClikOnSearch.click();
	}
	public void Homepage2findfriend(String Name)
	{
		FindFriend.sendKeys(Name);
	}
	public void Homepage2clikfriendname()
	{
		ClikOnFriendName.click();
	}

}

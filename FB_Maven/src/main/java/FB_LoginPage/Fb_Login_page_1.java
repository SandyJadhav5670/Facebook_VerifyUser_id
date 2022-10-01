package FB_LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Login_page_1 
{
	//@FindBy(xpath ="//img[@class='fb_logo _8ilh img']") private WebElement Logo;
	@FindBy(xpath ="//a[text()='Create New Account']") private WebElement CreateNewAccount;
	@FindBy(xpath ="//img[@class='_8idr img']") private WebElement CloseSignup;
	@FindBy(xpath ="//input[@type='text']") private WebElement UN;
	@FindBy(xpath ="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath ="//button[@name='login']") private WebElement ClickonLoginBtn;
	
	public Fb_Login_page_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public boolean Login1logo()
//	{
//		boolean logo=Logo.isDisplayed();
//		return logo;
//	}
	public void Login1createaccount()
	{
		CreateNewAccount.click();
	}
	public void Login1CloseSignUp()
	{
		CloseSignup.click();
	}
	public void Login1username(String Userid)
	{
		UN.sendKeys(Userid);
	}
	public void Login1password(String Password)
	{
		PWD.sendKeys(Password);
	}
	public void Login1loginbtn()
	{
		ClickonLoginBtn.click();
	}

}

package facebookpackage;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	@FindBy(name="email")
	public WebElement email;
	@FindBy(name="pass")
	public WebElement  pwd;
	@FindBy(xpath="//*[@value='Log In']")
	public WebElement submit;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void login(String x) {
		email.sendKeys(x);
	}
	public void password(String x)
	{
		pwd.sendKeys(x);
	}
	public void clickpwd()
	{
		submit.click();
	}

}

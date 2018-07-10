package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Methods {
	
	public WebDriver driver;
	
	@FindBy(name="email")
	 public WebElement  mail;
	
   @FindBy(name="pass")
   public WebElement pwd;

 @FindBy(xpath="//*[@value='Log In']")
   public WebElement login;

//constructor
public Methods(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
//methods
public void Mail(String x){
	
	mail.sendKeys();
}
public void password(){
	pwd.sendKeys();
	login.click();
}
	
}


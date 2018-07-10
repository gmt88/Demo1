package examples;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import facebookpackage.Login;

public class Facebookgogglesearch {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?rlz=1C1GGRV_enIN748IN748&oq=facebook&aqs="
				+ "chrome..69i57j69i60l4j69i59.4948j0j8&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("facebook");
		Thread.sleep(4000);
		while (2 > 1) {
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
            a.sendKeys(Keys.DOWN).build().perform();
			String x11 = driver.findElement(By.name("q")).getAttribute("value");
			if (x11.equals("facebook log in")) {
				driver.manage().timeouts()
						.implicitlyWait(100, TimeUnit.SECONDS);
            a.sendKeys(Keys.ENTER).build().perform();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Log in to Facebook | Facebook']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Facebook – log in or sign up']")).click();
		Login lp=new Login(driver);
		{
			lp.login("thimmareddy88@mail.com");
			lp.password("hindupur@88");
			lp.clickpwd();
			}
		Thread.sleep(5000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		/*Actions a1=new Actions (driver);
		a.sendKeys(Keys.ESCAPE).build().perform();
		
	a.sendKeys(Keys.ESCAPE).build().perform();*/
		
		
		
	}
}

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumgogglesearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?rlz=1C1GGRV_enIN748IN748&oq=facebook&aqs="
				+ "chrome..69i57j69i60l4j69i59.4948j0j8&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.xpath("//*[@name='q']"));
		Thread.sleep(5000);
		e1.sendKeys("selenium");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		for (int i = 1; i < 4; i++) {
			Thread.sleep(5000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath("//*[text()='50 Most Popularly Asked Selenium Interview Questions and Answers ...']"))
				.click();
		Thread.sleep(5000);
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@title='Close'])[2]"))).click();
		

	}
}
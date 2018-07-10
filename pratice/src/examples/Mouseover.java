package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement e = driver.findElement(By
				.xpath("//*[@class='_2AkmmA _29YdH8']"));
		e.click();
		WebElement e1 = driver.findElement(By
				.xpath("//*[@title='Women']/*[@class='_3ynUUz']"));
		Actions a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		a.moveToElement(e1).build().perform();

		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("thimmareddy88@mail.com",Keys.TAB,"hindupur@88");
		//driver.findElement(By.name("pass")).sendKeys("hindupur@88");
	}

}

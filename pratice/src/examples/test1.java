package examples;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?rlz=1C1GGRV_enIN748IN748&oq=facebook&aqs="
				+ "chrome..69i57j69i60l4j69i59.4948j0j8&sourceid=chrome&ie=UTF-8");

		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		driver.findElement(By.name("q")).sendKeys("w3schools ");

		while (2 > 1) {
			Thread.sleep(5000);
			a.sendKeys(Keys.DOWN).build().perform();
			String x = driver.findElement(By.name("q")).getAttribute("value");
			if (x.equals("w3schools java")) {
				Thread.sleep(5000);
				a.sendKeys(Keys.ENTER).build().perform();
				break;
			}
		}

		List<WebElement> e1 = driver.findElements(By.tagName("a"));
		int x1 = e1.size();
		System.out.println(x1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement e2 = driver.findElement(By
				.xpath("//*[text()='HTML JavaScript - W3Schools']"));
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,0)");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);", e2);
		driver.findElement(By.linkText("Java Programs - W3schools")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.in/java-tutorial/intro/");
		String x = driver.getTitle();
		System.out.println(x);

		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();

		driver.findElement(By.name("q")).sendKeys("facebook ");
		while (2 > 1) {
			Thread.sleep(5000);
			a.sendKeys(Keys.DOWN).build().perform();
			String x11 = driver.findElement(By.name("q")).getAttribute("value");
			if (x11.equals("facebook log in")) {
				Thread.sleep(5000);
				a.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(5000);
				break;
			}
		}

		driver.findElement(
				By.xpath("//*[text()='Facebook – log in or sign up']")).click();
		driver.findElement(By.name("email")).sendKeys("thimmareddy88@mail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("pass")).sendKeys("hindupur@88");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		Thread.sleep(5000);
		WebElement lstitem = driver.findElement(By.id("userNavigationLabel"));
		lstitem.click();
		WebDriverWait w = new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.elementToBeClickable(By
				.xpath("//*[text()='Log out']"))).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@title='Remove']")).click();

	}
}

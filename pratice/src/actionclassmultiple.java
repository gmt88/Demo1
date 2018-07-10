import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionclassmultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By
				.xpath("(//*[@class='ui dropdown'])[1]"));
		Actions a = new Actions(driver);
		a.click(e1).build().perform();
		for (int i = 1; i <= 5; i++) {
			Thread.sleep(3000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By
				.xpath("(//*[@class='ui selection dropdown'])[1]"));
		a.click(e2).build().perform();
		Thread.sleep(3000);
		a.sendKeys("F").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By
				.xpath("(//*[@class='ui fluid selection dropdown'])[1]"));
		a.click(e3).build().perform();
		Thread.sleep(3000);
		a.sendKeys("j").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();

	}

}

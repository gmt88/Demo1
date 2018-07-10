import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement e1 = driver
				.findElement(By
						.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(e1, 300, 0).build().perform();
		Thread.sleep(5000);

		a.dragAndDropBy(e1, -300, 0).build().perform();
		Thread.sleep(5000);

		driver.get("http://jqueryui.com/slider/#slider-vertical");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		WebElement e2 = driver
				.findElement(By
						.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		a.dragAndDropBy(e2, 0, 500).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(e2, 0, -300).build().perform();

	}

}

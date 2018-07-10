import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		WebElement e1 = driver.findElement(By.linkText("JAVASCRIPT"));
		String x = e1.getAttribute("title");
		System.out.println(x);
		// tooltip

		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement srl=driver.findElement(By.xpath("//*[text()='Demo: Tooltip Examples']"));
		js.executeScript("arguments[0].scrollIntoView(true);",srl);
		WebElement e3 = driver.findElement(By
				.xpath("(//*[@class='tooltip'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(e3).build().perform();
		Thread.sleep(5000);
		WebElement e4 = driver.findElement(By
				.xpath("(//*[@class='tooltip'])[1]/span"));
		Thread.sleep(5000);
		String y = e4.getText();
		System.out.println(y);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[text()='Try it Yourself »'])[1]"))
				.click();
	
		
	
		

	}
}

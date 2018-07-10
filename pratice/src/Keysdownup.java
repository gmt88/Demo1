import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class Keysdownup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		String x1 = driver.getWindowHandle();
		System.out.println(x1);
		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.name("cars"));
		Select S = new Select(e);
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL).click(S.getOptions().get(1)).build().perform();
		Thread.sleep(5000);
		a.click(S.getOptions().get(3)).build().perform();
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		
		driver.findElement(By.linkText("//*[text()='PHP tutorial']")).click();
		for (int i = 0; i < S.getAllSelectedOptions().size(); i++) {
			System.out.println(S.getAllSelectedOptions().get(i).getText());
		}
		System.out.println();

		Thread.sleep(6000);
		
		Thread.sleep(5000);
		
		
		
	
		
		

		// get size
		int x = driver.manage().window().getSize().getWidth();
		int y = driver.manage().window().getSize().getHeight();
		System.out.println(x + " " + y);
		// set size
		Dimension d = new Dimension(600, 400);
		driver.manage().window().setSize(d);
		// get position
		int X = driver.manage().window().getPosition().getX();
		int Y = driver.manage().window().getPosition().getY();
		System.out.println(X + "  " + Y);
		// set position
		Point P = new Point(100, 100);
		driver.manage().window().setPosition(P);
		Thread.sleep(5000);

		

	}

}

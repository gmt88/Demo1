import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gogglesearch2 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp?rlz=1C1GGRV_enIN748IN748&oq=facebook&aqs=" +
				"chrome..69i57j69i60l4j69i59.4948j0j8&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.xpath("//*[@name='q']"));
		Thread.sleep(5000);
		e1.sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> l =driver.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbqs_c']"));
		
		System.out.println(l.size());
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getText());
				if(l.get(i).getText().contains("selenium maven dependency")){
				l.get(i).click();
				}
		}
	}
}

	



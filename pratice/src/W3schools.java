import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("navbtn_tutorials")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@class='w3-button w3-xlarge w3-display-topright barex'][1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/div[5]/div/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Learn CSS",
				Keys.ENTER);

		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//*[@class='gsc-results-close-btn gsc-results-close-btn-visible']"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Learn HTML")).click();
		driver.findElement(
				By.xpath("//*[@id='mainLeaderboard']//following ::*[@class='w3-clear nextprev'][1]//a[1]"))
				.click();

		Thread.sleep(3000);

		driver.findElement(By.linkText("Learn SQL")).click();
		driver.close();
	}	
}

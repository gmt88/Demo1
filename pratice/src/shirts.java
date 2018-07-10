import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shirts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium 1\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s/ref=lp_1968093031_nr_p_n_feature_three_br_0/261-6599753-7684256?fst=as%3Aoff&rh="
				+ "n%3A1571271031%2Cn%3A%211571272031%2Cn%3A1968024031%2Cn%3A1968093031%2Cp_n_feature_three_browse"
				+ "-bin%3A1974919031&bbn=1968093031&ie=UTF8&qid=1519309653&rnid=1974917031");
		List<WebElement> l = driver.findElements(By
				.xpath("//*[@id='s-results-list-atf']//child::li"));
		WebElement l1 = driver.findElement(By
				.xpath("//*[@id='result_0']//child::div//child::a//child::h2"));
		l1.click();
		Actions a =new Actions(driver);
		WebElement e=driver.findElement(By.linkText("KIDS"));
		a.click(e).contextClick().build().perform();

		System.out.println("DESCRIPITION: " + l1.getText());
		System.out.println("Total list items: " + l.size());
	}
}

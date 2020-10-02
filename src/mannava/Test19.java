package mannava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {
// program to collect of elements
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(5000);

		List <WebElement> e = driver.findElements(By.xpath("//*"));

		System.out.println("Count of elements is " + e.size());

		// close site
		driver.close();
	}
}
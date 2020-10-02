package mannava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 {
// program to get count of anchor tag elements on page source
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(5000);
		// collect <a> elements
		List <WebElement> e = driver.findElements(By.tagName("a"));
		// 
		List <WebElement> e1 = driver.findElements(By.xpath("//a"));
		
		System.out.println("Count of <a> tag elements is " + e.size());
		System.out.println("Count of <a> tag elements is " + e1.size());

		// close site
		driver.close();
	}
}
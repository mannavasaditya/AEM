package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {
// program to getTagName()
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		Thread.sleep(5000);

		String e = driver.findElement(By.name("q")).getTagName();

		System.out.println("Tagname" + e);

		// close site
		driver.close();
	}
}
package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {
// program to find password enabled or disabled
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");
		Thread.sleep(5000);

		// locate element in page source
		WebElement e = driver.findElement(By.name("hiddenPassword"));

		// locate element in page
		if (e.isDisplayed())
		{
			if(e.isEnabled())
				System.out.println("Enabled");
			else
				System.out.println("Enabled");
		}	
		else
			System.out.println("Hidden Element");

		// close site
		driver.close();
	}
}
package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {
// program to radio button is selected
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com");
		Thread.sleep(5000);

		// locate element in page source
		WebElement e = driver.findElement(By.xpath("//input[@value='RoundTrip'])[1]"));

		// locate element in page
		if (e.isDisplayed())
		{
			System.out.println("is visible");
			if(e.isSelected())
				System.out.println("Selected");
			else
				System.out.println("Not Selected");
		}	
		else
			System.out.println("Hidden Element");

		// close site
		driver.close();
	}
}
package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {
// program to 
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");
		Thread.sleep(5000);

		// locate element in page source
		WebElement e = driver.findElement(By.name("identifier"));

		// get dimensions
		Dimension d1 = e.getSize();
		int w = d1.getWidth();
		int h = d1.getHeight();
		
		System.out.println("location is " + w + "" + h);

		e = driver.findElement(By.name("hiddenPassword"));
		w=d1.getWidth();
		h=d1.getWidth();
		
		System.out.println("location is " + w + "" + h);

		// close site
		driver.close();
	}
}
package mannava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test48 
{
	// program to locate carousel slider element in webpage.
	public static void main(String[] args) throws Exception
	{
		// matrix (1,0,0,1,-1072.2,0) for 2D
		// matrix3d (1,0,0,1,-1072.2,0,... etc) for 3D
		
		// transform 0.45s ease-in-out 0s, -webkit-transform 0.45s ease-in-out 0s
		
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.ebay.com");
		Thread.sleep(5000);
		
		// locate carousel slider [specific for corresponding slider]
		WebElement cslider = driver.findElement(By.className("carousel_list"));
		
		
		
		//closing the site driver
		driver.close();
	}
}

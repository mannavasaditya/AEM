package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {
// program to location of an element
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");
		Thread.sleep(5000);

		// locate element in page source
		WebElement e = driver.findElement(By.name("identifier"));

		// get hidden element size (width and height in pixels)
		// get hidden element location(x and y coordinates)
		// get location of visible element in page
		Point p = e.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println("location is " + x + "" + y);

		//get location of hidden element in page
		e = driver.findElement(By.name("hiddenPassword"));// get (0,0) for hidden elemnts
		p = e.getLocation();
		System.out.println("location is " + x + "" + y);

		// close site
		driver.close();
	}
}
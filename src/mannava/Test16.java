package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {
// program to 
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		Thread.sleep(5000);

		// fill fields
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.className("fname")).sendKeys("mannava");
		driver.findElement(By.className("lname")).sendKeys("aditya");
		driver.findElement(By.xpath("//*[@value='Submit'")).submit();
		//driver.findElement(By.xpath("//*[@value='Submit'")).click();
		// close site
		driver.close();
	}
}
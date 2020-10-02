package mannava;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class Test14 {
// program to screenshot
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");
		Thread.sleep(5000);

		// get visible element screenshot as a file
		File src = driver.findElement(By.xpath("//input[@value='Go']")).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\batch250\\elemetscreenshot.jph");
		FileHandler.copy(src, dest);
		// close site
		driver.close();
	}
}
package mannava;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test15 {
// program to take screenshot of hiddenelement
	public static void main(String[] args) throws Exception {
		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		// get hidden element screenshot as a file
		File src = driver.findElement(By.name("hiddenPassword")).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\batch250\\hiddenPassword.jpg");
		FileHandler.copy(src, dest);
	
		// close site
		driver.close();
	}
}
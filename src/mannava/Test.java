package mannava;

import java.io.File;

//import java.awt.image.BufferedImage;
//import java.io.File;
//import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.Point;
public class Test {
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\batch250\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
			
		driver.get("https://www.thomsonreuters.ca/en.html");
		Thread.sleep(15000);// time in milisec
		driver.findElement(By.id("onetrust-pc-btn-handler")).click();
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.id("onetrust-pc-sdk"));
	        System.out.println(element.getText());
	        
	        Point location = element.getLocation();
	        int x = location.getX();
	        int y = location.getY();
	        System.out.println("Coordinates of an element is : " + x + " and " + y);
 	        int elementWidth = element.getSize().getWidth();
	        System.out.println("Element width: "+ elementWidth);
	        int elementHeight = element.getSize().getHeight();
	        System.out.println("Element height: "+ elementHeight);
	        
	     // get hidden element screenshot as a file
			File src = driver.findElement(By.id("onetrust-pc-sdk")).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\batch250\\hiddenPassword.jpg");
			FileHandler.copy(src, dest);
	        driver.close();
	}
}
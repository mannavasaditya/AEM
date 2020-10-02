package mannava;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Tes25 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.id("hbutton"));
		File src = e.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\batch250\\InvisibleOfElementScreenShotAs.png");
		FileHandler.copy(src, dest);
		driver.close();
		System.exit(1);

	}
}

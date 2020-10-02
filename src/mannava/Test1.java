package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		System.out.println(" hello page opened");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.close();
	}
}
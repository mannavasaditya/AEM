package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//ex 16
public class Test24 {

	public static void main(String[] args) throws Exception {
		// program to get count for attachments on GMail
				System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://login.yahoo.com/");
				Thread.sleep(3000);
				
				
				driver.close();
	}

}

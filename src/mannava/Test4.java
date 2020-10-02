package mannava;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test4 {

	public static void main(String[] args) throws Exception {
		// Take browser name from keyboard
		Scanner scobj = new Scanner(System.in);
		System.out.println("Enter browser name");
		String bn = scobj.nextLine();
		// Declare driver object
		RemoteWebDriver driver = null;
		if (bn.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (bn.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\batch250\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		// common code
		driver.get("http://www.amazon.com");
		Thread.sleep(5000); // time in milisec
		driver.close();
		scobj.close();
	}

}

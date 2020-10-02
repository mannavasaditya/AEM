package mannava;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args)  throws InterruptedException  {
				System.setProperty("webdriver.gecko.driver", "C:\\batch250\\geckodriver.exe");
				FirefoxDriver driver = new FirefoxDriver();
				driver.get("http://www.google.co.in");
				Thread.sleep(5000);// time in milisec
				driver.close();
	}
}
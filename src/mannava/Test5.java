package mannava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	public static void main(String[] args) throws Exception {
		// Open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// launch site using base URL given by developer
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);// time in milisec
		// get current url of the page
		String x=driver.getPageSource();
		String y = driver.getWindowHandle();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(driver.getCurrentUrl().toString());
		// close site
		driver.close();
	}

}

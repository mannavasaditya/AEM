package mannava;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	public static void main(String[] args) throws Exception {
				// Open chrome browser
				System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				// launch site using base URL given by developer
				driver.get("http://www.amazon.in");
				Thread.sleep(5000);// time in milisec
				// get the title of the page
				String t = driver.getTitle();
				System.out.println(t);
				// Check the site is secured or not?
				String x=driver.getCurrentUrl();
				if(x.startsWith("https"))
				{
					System.out.println("Secured");
				}
				else
					System.out.println("Not Secured");
				// close site
				driver.close();
	}

}

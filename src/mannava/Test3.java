package mannava;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.ie.driver", "C:\\batch250\\iedriver\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);// time in milisec
		driver.close();
	}

}

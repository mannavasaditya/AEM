package mannava;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test21 {
	public static void main(String[] args) throws Exception {
		// Testing broken link - open browser and launch site [gui test using SWD]
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);// time in milisec
		// locate one links and take href attribute value 	
		WebElement e =driver.findElement(By.linkText("Gmail"));
		// href  address value tesing  or broken link testing [API test  usig JDK Classes]]
		String x=e.getAttribute("href");
		try 
		{
			URL u = new URL(x);
			HttpURLConnection con =(HttpURLConnection) u.openConnection();
			con.connect();
			String y = con.getResponseMessage();
			int z=con.getResponseCode();
			// Getting response message
			System.out.println(y);
			//Getting response code
			System.out.println(z);
			con.disconnect();
			if(y.equalsIgnoreCase("ok"))
			{
				System.out.println(x+"is working correctly");
			}
			else
			{
				System.out.println(x+"is not working correctly");
			}
			
			// checking with status response code
			if(z>=200 && z<=299)
			{
				System.out.println(z+"is working correctly");
			}
		}
		catch(Exception ex) 
		{
		}
		driver.close();
	}
}
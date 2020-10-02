package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		
         //Do registration
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='For myself']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstName")).sendKeys("aarthi");
		
		driver.findElement(By.name("lastName")).sendKeys("rudrawar");
		
		driver.findElement(By.name("Username")).sendKeys("aarthirudrawar123");
		
		driver.findElement(By.name("Passwd")).sendKeys("chinky12345");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("chinky12345");
	
		driver.findElement(By.xpath("//span[@class='CwaK9']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("countryList")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[contains(text(), 'India')][last()]/parent::*")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'India')])[last()]/parent::*")).isSelected();
		//driver.findElement(By.xpath("//span[@class='vRMGwf oJeWuf'")).click();
		String countryXpath = "//*[@class='select-item']/following::span[contains(text(), 'India')]";

		//Thread.sleep(50000);
	    
	    driver.findElement(By.id("phoneNumberId")).sendKeys("9849979427");
	    //Xb9hP
	   // driver.findElement(By.xpath("//div[@class='Xb9hP']")).sendKeys("1234465475675");
		//driver.findElement(By.cssSelector(".e2CuFe")).click();
	    
		//driver.findElement(By.cssSelector(".OA0qNb > .KKjvXb")).click();
	    //driver.findElement(By.id("phoneNumberId")).sendKeys("+91 1234567890");
	    //driver.findElement(By.xpath("//*[text()='Next']/parent::*")).click();
	    
	    Thread.sleep(5000);
	    driver.close();

	}

}
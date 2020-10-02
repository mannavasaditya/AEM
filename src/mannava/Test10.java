package mannava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {
// program to find opasity with CSS
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");
		Thread.sleep(5000);

		// locae gmail link element
		WebElement e = driver.findElement(By.linkText("Gmail"));

		// Before focusing on element
		String x1 = e.getCssValue("text-decoration");
		String y1 = e.getCssValue("opacity");
		System.out.println("Before focus:" + x1 + " " + y1);

		// move focus to element
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
		Thread.sleep(5000);

		// Ater focused on element
		String x2 = e.getCssValue("text-decoration");
		String y2 = e.getCssValue("opacity");
		System.out.println("After focus:" + x2 + " " + y2);

		// test case - 1
		if (x2.contains("underline"))
			System.out.println("Element text was underlined after getting focus");
		else
			System.out.println("Element text was not underlined after getting focus");
		// test case - 2
		float f = Float.parseFloat(y2);
		if (f < 1)
			System.out.println("Elemen color was shaded after getting focus");
		else
			System.out.println("Elemen color was not shaded after getting focus");
		// close site
		driver.close();
	}
}
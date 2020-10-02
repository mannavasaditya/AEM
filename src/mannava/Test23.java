package mannava;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {
// finding broken links in all pages of a site via pagination
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// get data from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to search");
		String word = sc.nextLine();
		sc.close();

		// open browser and launch site
		System.setProperty("webdriver.chrome.driver", "C:\\batch250\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// driver.get("http://mrselenium.com/");

		driver.get("https://www.google.com");
		Thread.sleep(5000);// time in milisec

		// search given word
		driver.findElement(By.name("q")).sendKeys(word, Keys.ENTER);
		
		Thread.sleep(5000);// time in milisec
		// pagination on result pages
		int pageCount = 0;
		while (true)// infinite loop
		{
			pageCount++;
			System.out.println("Page - " + pageCount);
			System.out.println("------------------");

			// collect all link type elements in home page
			List<WebElement> listElements = driver
					.findElements(By.xpath("(//image)|(//link)|(//area)|(//a)|(/script)|(//base)|(//div)"));

			// goto each one via looping
			int cwl = 0; // count correctly working links
			int bl = 0; // broken links
			int totallinks = 0;

			for (int i = 0; i < listElements.size(); i++) {
				try {// to handle any exception and continue loop
						// test case-1: whether that elements has href attribute or not if an element
						// has href attribute that element is called hyperlinks
					WebElement e = listElements.get(i);
					if (e.getAttribute("href") != null) {
						String x = e.getAttribute("href");
						// test case -2 whether that href value is URL [address] or not, some elements
						// href attribute value[not a url] refer local page only.
						if (x.startsWith("http") || x.startsWith("https")) 
						{
							// test case 3 - whether that url related server is responding or not
							totallinks++;
							URL u = new URL(x);
							HttpURLConnection con = (HttpURLConnection) u.openConnection();
							con.connect();
							String y = con.getResponseMessage();
							int z = con.getResponseCode();
							con.disconnect();
							// checking with status response code
							if (z >= 200 && z <= 299)
								cwl++;
							else 
							{
								bl++;
								System.out.println(x + " send " + y + " with " + z);
							}
						}
					}
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			} // end of for loop completion
			System.out.println("Total Links coun is " + totallinks);
			System.out.println("Correctly working links are" + cwl);
			System.out.println("broken links are " + bl);
			// goto next page
			try {
				if (driver.findElement(By.xpath("//span[text()='Next'")).isDisplayed()) {

				}
			} catch (Exception ex) {

			}

		} // end of while loop
		//driver.close();
	}
}